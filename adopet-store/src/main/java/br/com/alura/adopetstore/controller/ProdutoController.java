package br.com.alura.adopetstore.controller;

import br.com.alura.adopetstore.dto.CadastroProdutoDTO;
import br.com.alura.adopetstore.dto.ProdutoDTO;
import br.com.alura.adopetstore.service.ProdutoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("admin/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService service;

    @PostMapping
    @Transactional
    public ResponseEntity<ProdutoDTO> cadastrar(@Valid @RequestBody CadastroProdutoDTO dto) {
        var produto = this.service.cadastrar(dto);
        return ResponseEntity.ok(produto);
    }

    @GetMapping
    public ResponseEntity<Page<ProdutoDTO>> listar(Pageable paginacao) {
        var produtos = this.service.listar(paginacao);
        return ResponseEntity.ok(produtos);
    }

    @DeleteMapping("{id}")
    @Transactional
    public ResponseEntity<Void> excluir(@PathVariable Long id) {
        this.service.excluir(id);
        return ResponseEntity.noContent().build();
    }

}
