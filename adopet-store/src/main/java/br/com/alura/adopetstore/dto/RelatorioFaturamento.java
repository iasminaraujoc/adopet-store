package br.com.alura.adopetstore.dto;

import java.math.BigDecimal;
import java.util.List;

public record RelatorioFaturamento(BigDecimal faturamentoTotal, List<EstatisticasVenda> estatisticas) {
}