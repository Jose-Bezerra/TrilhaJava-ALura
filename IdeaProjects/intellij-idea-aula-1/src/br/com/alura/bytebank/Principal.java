package br.com.alura.bytebank;

import br.com.alura.bytebank.model.Funcionario;

import java.time.LocalDate;

public class Principal {

  public static void main(String[] args) {
    System.out.println("Bem vindo ao banco Bytebank");
    Funcionario jose = new Funcionario("José", 6422870, LocalDate.of(1977,10, 28) );
    Funcionario brunno = new Funcionario("Brunno", 6422861, LocalDate.of(1981,10, 28) );

    System.out.println(brunno);
    System.out.println(jose);


  }

}