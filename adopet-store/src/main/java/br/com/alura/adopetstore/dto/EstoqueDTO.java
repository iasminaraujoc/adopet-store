package br.com.alura.adopetstore.dto;

import br.com.alura.adopetstore.model.Estoque;

public record EstoqueDTO(Long produtoId, Integer quantidade) {
    public EstoqueDTO(Estoque estoque){
        this(estoque.getProduto().getId(), estoque.getQuantidade());
    }
}
