package br.com.alura.adopetstore.controller;

import br.com.alura.adopetstore.dto.AtualizaEstoqueDTO;
import br.com.alura.adopetstore.service.EstoqueService;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("admin/estoques")
public class EstoqueController {

    @Autowired
    private EstoqueService service;

    @PutMapping
    @Transactional
    public ResponseEntity<Void> atualizar(@RequestBody @Valid AtualizaEstoqueDTO dto){
        service.atualizarEstoque(dto);
        return ResponseEntity.ok().build();
    }
}
