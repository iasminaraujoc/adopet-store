package br.com.alura.adopetstore.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

public record CadastroProdutoDTO(@NotBlank String nome,
                                 @NotBlank String descricao,
                                 @NotNull BigDecimal preco,
                                 @NotNull @Min(1) Integer estoqueInicial,
                                 @NotBlank String categoria ) {
}
