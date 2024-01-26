package br.com.alura.adopetstore.service;

import br.com.alura.adopetstore.email.EmailRelatorioGerado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class AgendamentoService {

    @Autowired
    private RelatorioService relatorioService;
    @Autowired
    private EmailRelatorioGerado enviador;
    @Scheduled(cron = "0 29 11 * * *")
    public void envioEmailsAgendado(){
        var estoqueZerado = relatorioService.infoEstoque();
        var faturamentoObtido = relatorioService.faturamentoObtido();

        enviador.enviar(estoqueZerado, faturamentoObtido);
        System.out.println("Thread do agendamento: " + Thread.currentThread().getName());
    }
}
