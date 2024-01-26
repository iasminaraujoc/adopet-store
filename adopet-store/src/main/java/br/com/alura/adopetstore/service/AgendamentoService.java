package br.com.alura.adopetstore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class AgendamentoService {

    @Autowired
    private RelatorioService relatorioService;
    @Scheduled(cron = "0 3 11 * * *")
    public void envioEmailsAgendado(){
        var estoqueZerado = relatorioService.infoEstoque();
        var faturamentoObtido = relatorioService.faturamentoObtido();

        System.out.println(estoqueZerado);
        System.out.println(faturamentoObtido);
    }
}
