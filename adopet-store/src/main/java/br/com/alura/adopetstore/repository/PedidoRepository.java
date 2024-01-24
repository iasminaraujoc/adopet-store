package br.com.alura.adopetstore.repository;

import br.com.alura.adopetstore.dto.EstatisticasVenda;
import br.com.alura.adopetstore.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {

    List<Pedido> findPedidoByData(LocalDate now);
    @Query("""
            SELECT SUM(i.precoUnitario * i.quantidade)
            FROM Pedido p
            JOIN p.itens i
            WHERE p.data = :data
            """)
    BigDecimal faturamentoTotalDoDia(LocalDate data);
    @Query("""
        SELECT NEW br.com.alura.adopetstore.dto.EstatisticasVenda(
            prod.categoria,
            SUM(i.quantidade),
            SUM(i.precoUnitario * i.quantidade)
        )
        FROM Pedido p
        JOIN p.itens i
        JOIN i.produto prod
        WHERE p.data = :data
        GROUP BY prod.categoria
        """)
    List<EstatisticasVenda> faturamentoTotalDoDiaPorCategoria(LocalDate data);

}