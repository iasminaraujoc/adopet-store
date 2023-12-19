package br.com.alura.adopetstore.repository;

import br.com.alura.adopetstore.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
     boolean existsByNomeIgnoringCase(String nome);
}
