package br.com.alura.adopetstore.dto;

import java.util.List;

public record RelatorioEstoque (List<ProdutoDTO> produtosAusentes) {
}