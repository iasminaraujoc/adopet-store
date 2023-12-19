package br.com.alura.adopetstore.controller;

import br.com.alura.adopetstore.dto.CadastroPedidoDTO;
import br.com.alura.adopetstore.dto.CadastroProdutoDTO;
import br.com.alura.adopetstore.dto.PedidoDTO;
import br.com.alura.adopetstore.dto.ProdutoDTO;
import br.com.alura.adopetstore.model.Usuario;
import br.com.alura.adopetstore.service.PedidoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("pedidos")
public class PedidoController {

    @Autowired
    private PedidoService service;
    @PostMapping
    @Transactional
    public ResponseEntity<PedidoDTO> cadastrar(@Valid @RequestBody CadastroPedidoDTO dto, @AuthenticationPrincipal Usuario usuario) {
        var pedido = this.service.cadastrar(dto, usuario);
        return ResponseEntity.ok(pedido);
    }
}
