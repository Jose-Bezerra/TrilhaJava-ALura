package br.com.alura.bytebank.registrador;

import br.com.alura.bytebank.model.Pagamento;
import br.com.alura.bytebank.model.Tipo;

import java.util.ArrayList;
import java.util.List;

public class RegistroDePagamento {

  private final static List<Pagamento> PAGAMENTOS = new ArrayList<>();

  public void registra(List<Pagamento> pagamentos) {
      verificaPagamento(pagamentos);
      if (!PAGAMENTOS.isEmpty()) {
          exibePagamentos();
      } else {
      System.out.println("Não temos pagamentos");
    }
  }

    private void exibePagamentos() {
        System.out.println("Todos os pagamentos");
        for (int i = 0; i < PAGAMENTOS.size(); i++) {
            System.out.println(PAGAMENTOS.get(i));
        }
    }

    private void verificaPagamento(List<Pagamento> pagamentos) {
        for (int i = 0; i < pagamentos.size(); i++) {
            Pagamento pagamento = pagamentos.get(i);
            if (pagamento.getTipo().equals(Tipo.CREDITO)) {
                pagamento.setValor(pagamento.getValor() * 1.02);
            }
            if (pagamento.getTipo().equals(Tipo.DEBITO)) {
                pagamento.setValor(pagamento.getValor() * 1.001);
            }
          salvaPagamentos(pagamento);
        }
    }

    private void salvaPagamentos(Pagamento pagamento) {
        PAGAMENTOS.add(pagamento);
        System.out.println("Pagamento realizado " + pagamento);
    }

}
