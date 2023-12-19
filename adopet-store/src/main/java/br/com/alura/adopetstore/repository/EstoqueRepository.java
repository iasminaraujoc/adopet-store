package br.com.alura.adopetstore.repository;

import br.com.alura.adopetstore.model.Estoque;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstoqueRepository extends JpaRepository<Estoque, Long> {
    Estoque findByProdutoId(Long idProduto);
}
