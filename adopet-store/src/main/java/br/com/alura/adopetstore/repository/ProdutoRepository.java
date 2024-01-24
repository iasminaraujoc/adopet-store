package br.com.alura.adopetstore.repository;

import br.com.alura.adopetstore.model.Produto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
     boolean existsByNomeIgnoringCase(String nome);
     @Query("SELECT p FROM Produto p WHERE p.ativo=true")
     Page<Produto> findAll(Pageable pageable);
}
