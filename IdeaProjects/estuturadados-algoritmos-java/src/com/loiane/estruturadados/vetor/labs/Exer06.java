package com.loiane.estruturadados.vetor.labs;

import com.loiane.estruturadados.vetor.Lista;
import com.loiane.estruturadados.vetor.teste.Contato;

import java.util.Scanner;

public class Exer06 {

  public static void main(String[] args) {

    // 0 - Criação variável Scanner
    Scanner scan  = new Scanner(System.in);

    // 1 - Criar vetor com 20 de capacidade
    Lista<Contato> lista = new Lista<Contato>(20);

    // 2 - Criar e adicionar 30 contatos
    criarContatosDinamicamente(5, lista);

    // 3 - Criar um menu para escolha do usuário
    int opcao = 1;
    while (opcao != 0) {
      opcao = obterOpcaoMenu(scan);
      switch (opcao) {
        case 1:
          adicionarContatoFinal(scan, lista);
          break;
        case 2:
          adicionaContatoPosicao(scan, lista);
          break;
        case 3:
          obtemContatoPosicao(scan, lista);
          break;
        case 4:
          obtemContato(scan, lista);
          break;
        case 5:
          pesquisarUltimoIndice(scan, lista);
          break;
        case 6:
          pesquisarContatoExiste(scan, lista);
          break;
        case 7:
          excluirPorPosicao(scan, lista);
          break;
        case 8:
          excluirContato(scan, lista);
          break;
        case 9:
          imprimeTamanhoVetor(lista);
          break;
        case 10:
          limparVetor(lista);
          break;
        case 11:
          imprimirVetor(lista);
          break;
        default:
          break;
      }


    }
    System.out.println("Usuário digitou 0, programa encerrado.");
  }

  private  static void imprimirVetor(Lista<Contato> lista) {
    System.out.println(lista);
  }

  private  static void limparVetor(Lista<Contato> lista) {
    lista.limpar();
    System.out.println("Todos os contatos foram excluídos.");
  }

  private static void imprimeTamanhoVetor(Lista<Contato> lista) {
    System.out.println("Tamanho do vetor é: "+ lista.tamanho());
  }

  private static void obtemContatoPosicao(Scanner scan, Lista<Contato> lista){
    int pos = leInformacaoInt("Entre com a posicao a ser pesquisada", scan);
    try {

      Object contato = lista.busca(pos);
      System.out.println("Contato existe, segue dados:");
      System.out.println(contato);

    } catch (Exception e) {
      System.out.println("Posição inválida!");
    }

  }


  private static void obtemContato(Scanner scan, Lista<Contato> lista){
    int pos = leInformacaoInt("Entre com a posicao a ser pesquisada", scan);
    try {

      Contato contato = (Contato) lista.busca(pos);
      System.out.println("Contato existe, segue dados:");
      System.out.println(contato);
      System.out.println("Fazendo pesquisa do contato encontrado:");
      pos = lista.busca(contato);
      System.out.println("Contato encontrado na posição " + pos);

    } catch (Exception e) {
      System.out.println("Posição inválida!");
    }

  }

  private static void pesquisarUltimoIndice(Scanner scan, Lista<Contato> lista){
      int pos = leInformacaoInt("Entre com a posicao a ser pesquisada", scan);
      try {

        Contato contato = (Contato) lista.busca(pos);
        System.out.println("Contato existe, segue dados:");
        System.out.println(contato);
        System.out.println("Fazendo pesquisa do último índice do contato encontrado:");
        pos = lista.ultimoIndice(contato);
        System.out.println("Contato encontrado na posição " + pos);

      } catch (Exception e) {
        System.out.println("Posição inválida!");
      }

    }

    private static void pesquisarContatoExiste(Scanner scan, Lista<Contato> lista){
      int pos = leInformacaoInt("Entre com a posicao a ser pesquisada", scan);
      try {

        Contato contato = (Contato) lista.busca(pos);

        boolean existe = lista.contem(contato);

        if (existe) {

          System.out.println("Contato existe, segue dados:");
          System.out.println(contato);

        }

      } catch (Exception e) {
        System.out.println("Posição inválida!");
      }

    }

    private static void excluirPorPosicao(Scanner scan, Lista<Contato> lista){
          int pos = leInformacaoInt("Entre com a posicao a ser removida", scan);
          try {

            Contato contato = (Contato) lista.busca(pos);

            lista.remove(contato);

            System.out.println("Contato excluído!");

          } catch (Exception e) {
            System.out.println("Posição inválida!");
          }

        }

    private static void excluirContato(Scanner scan, Lista<Contato> lista){
              int pos = leInformacaoInt("Entre com a posicao a ser removida", scan);
              try {

                lista.remove(pos);

                System.out.println("Contato excluído!");

              } catch (Exception e) {
                System.out.println("Posição inválida!");
              }

            }

  private static void adicionarContatoFinal(Scanner scan, Lista<Contato> lista) {
    System.out.println("Criando um contato, entre com as informações:");
    String nome = leInformacoes("Entre com o nome", scan);
    String telefone = leInformacoes("Entre com o telefone", scan);
    String email = leInformacoes("Entre com o email", scan);

    Contato contato = new Contato(nome, telefone, email);
    lista.adiciona(contato);
    System.out.println("Contato adicionado com sucesso!");
    System.out.println(contato);
  }

  private static void adicionaContatoPosicao(Scanner scan, Lista<Contato> lista) {
    System.out.println("Criando um contato, entre com as informações:");
    String nome = leInformacoes("Entre com o nome", scan);
    String telefone = leInformacoes("Entre com o telefone", scan);
    String email = leInformacoes("Entre com o email", scan);

    Contato contato = new Contato(nome, telefone, email);
    int posicao = leInformacaoInt("Entre com a posição a adicionar o contato", scan);

    try {
      lista.adiciona(posicao, contato);
      System.out.println("Contato adicionado com sucesso!");
      System.out.println(contato);
    } catch (Exception e) {
      System.out.println("Posição inválida, contato não adicionado");
    }

  }

  private static String leInformacoes(String msg, Scanner scan){
    System.out.println(msg);
    String input = scan.nextLine();
    return  input;
  }

  private static int leInformacaoInt(String msg, Scanner scan) {

    boolean inputValid = false;
    int num = 0;

    while (!inputValid) {
      try {
        System.out.println(msg);
        String input = scan.nextLine();
        num = Integer.parseInt(input);
        inputValid = true;

      } catch (Exception e) {
        System.out.println("Entrada inválida, digite novamente");
      }
    }


    return num;
  }


  private static int obterOpcaoMenu(Scanner scan) {

    boolean inputValid = false;
    int opcao = 0;
    String input;

    while (!inputValid) {
      System.out.println("Digite a opção desejada: ");
      System.out.println("1: Adiciona contato no final do vetor");
      System.out.println("2: Adiciona contato numa posição específica");
      System.out.println("3: Obtém contato de uma posição espesífica");
      System.out.println("4: Consulta contato");
      System.out.println("5: Consulta último índice do contato");
      System.out.println("6: Veririca se contato existe");
      System.out.println("7: Excluir por posição");
      System.out.println("8: Excluir contato");
      System.out.println("9: Verifica tamanho do vetor");
      System.out.println("10: Excluir todos os contatos do vetor");
      System.out.println("11: Imprime vetor");
      System.out.println("0: Sair");

      try {
         input = scan.nextLine(); // Aceita qualquer digitação do usuário.
        opcao = Integer.parseInt(input); // Tranforma a string num inteiro.
        if (opcao >= 0 && opcao <= 11) {
          inputValid = true;
        } else {
          throw new Exception();
        }
      } catch (Exception e) {
        System.out.println("Entrada inválida, digite novmente!\n\n");
      }
    }


    return opcao;
  }

  private static void criarContatosDinamicamente(int quantidade, Lista<Contato> lista) {
    Contato contato; //Evite instanciar variáveis dentro de loop, por isso foi declarada fora da repetição.

    for (int i = 1; i <= quantidade; i++) {
      contato = new Contato();
      contato.setNome("Contato " + i);
      contato.setTelefone("99999999 " + i);
      contato.setEmail("contato"+ i + "@gmail.com");

      lista.adiciona(contato);
    }
  }
}
