package br.com.alura.adopetstore.dto;

import java.util.List;

public record CadastroPedidoDTO(List<ItemPedidoDTO> itens) {
}
