package br.com.alura.adopetstore.dto;

import br.com.alura.adopetstore.model.ItemPedido;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

public record ItemPedidoDTO(@NotNull Long produtoId, @NotNull @Min(1) Integer quantidade) {
    public ItemPedidoDTO(ItemPedido itemPedido){
        this(itemPedido.getProduto().getId(), itemPedido.getQuantidade());
    }
}
