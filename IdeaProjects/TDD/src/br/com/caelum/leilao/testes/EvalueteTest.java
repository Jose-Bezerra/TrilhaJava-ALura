package br.com.caelum.leilao.testes;

import br.com.caelum.leilao.dominio.Lance;
import br.com.caelum.leilao.dominio.Leilao;
import br.com.caelum.leilao.dominio.Usuario;
import br.com.caelum.leilao.servico.Avaliador;

public class EvalueteTest {
    public static void main(String[] args) {
        //Cenario: 3 lances em ordem crescente
        Usuario joao = new Usuario("João");
        Usuario jose = new Usuario("José");
        Usuario maria = new Usuario("Maria");

        Leilao leilao = new Leilao("Playstation 4");

        leilao.propoe(new Lance(maria, 250));
        leilao.propoe(new Lance(joao, 300));
        leilao.propoe(new Lance(jose, 400));

        //Executando a ação
        Avaliador leiloeiro = new Avaliador();
        leiloeiro.avalia(leilao);

        //Comparando a saída de forma automatizada
        double maiorEsperado = 400;
        double menorEsperado = 250;


        System.out.println(maiorEsperado == leiloeiro.getMaiorLance());
        System.out.println(menorEsperado == leiloeiro.getMenorLance());
    }
}
