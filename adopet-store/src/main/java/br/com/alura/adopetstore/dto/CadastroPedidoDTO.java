package br.com.alura.adopetstore.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.util.List;

public record CadastroPedidoDTO(@NotNull @Valid List<ItemPedidoDTO> itens) {
}
