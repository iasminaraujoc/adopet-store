package br.com.alura.adopetstore.service;

import br.com.alura.adopetstore.dto.AtualizaEstoqueDTO;
import br.com.alura.adopetstore.repository.EstoqueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstoqueService {
    @Autowired
    private EstoqueRepository repository;

    public void atualizarEstoque(AtualizaEstoqueDTO dto){
        var estoque = repository.findByProdutoId(dto.idProduto());
        estoque.atualizar(dto.quantidade());
    }
}
