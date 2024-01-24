package br.com.alura.adopetstore.repository;

import br.com.alura.adopetstore.model.Estoque;
import br.com.alura.adopetstore.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EstoqueRepository extends JpaRepository<Estoque, Long> {
    Estoque findByProdutoId(Long idProduto);
    @Query("SELECT e.produto FROM Estoque e WHERE e.quantidade = 0")
    List<Produto> produtosComEstoqueZerado();
}
