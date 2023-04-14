package facade;

import fsubsistema1.CrmService;
import fsubsistema2.CepApi;

//INTERFACE MAIS SIMPLES PARA FACILITAR A PEGAR AS INFORMACOES
//integra e  junta as informacoes de outros sistemas aqui

public class Facade {
    
    public void migrarCliente(String nome, String cep) {
        String cidade = CepApi.getInstancia().recuperarCidade(cep);
        String estado = CepApi.getInstancia().recuperarEstado(cep);

        CrmService.gravarCliente(nome, cep, cidade, estado);
    }
}
