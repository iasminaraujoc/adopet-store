package br.com.alura.adopetstore.dto;

import java.math.BigDecimal;

public record CadastroProdutoDTO(String nome, String descricao, BigDecimal preco, Integer estoqueInicial) {
}
