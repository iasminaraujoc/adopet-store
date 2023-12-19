package br.com.alura.adopetstore.repository;

import br.com.alura.adopetstore.model.Estoque;
import br.com.alura.adopetstore.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}
