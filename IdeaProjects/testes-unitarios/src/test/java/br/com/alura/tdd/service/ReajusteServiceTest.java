package br.com.alura.tdd.service;

import br.com.alura.tdd.modelo.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;
import org.junit.jupiter.api.*;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReajusteServiceTest {

    private ReajusteService service;
    private Funcionario funcionario;

    @BeforeEach
    public void inicializar(){
        System.out.println("Iniciar");
        this.service = new ReajusteService();
        this.funcionario = new Funcionario("Ana", LocalDate.now(), new BigDecimal("1000.00"));
    }

    @AfterEach
    public void Finalizar() {
        System.out.println("Fim");
    }

    @BeforeAll
    public static void AntesDeTodos() {
        System.out.println("Roda ANTES de todos os testes!");
    }
    @AfterAll
    public static void DepoisDeTodos() {
        System.out.println("Roda DEPOIS de todos os testes!");
    }

    @Test //cenário 1
    public void reajusteDeTresPorcentoParaDesempenhoADesejar() {
        service.concederReajuste(funcionario, Desempenho.A_DESEJAR);
        assertEquals(new BigDecimal("1030.00"), funcionario.getSalario());
    }

    @Test //cenário2
    public void reajusteDeQuinzePorcentoParaDesempenhoBom() {
        service.concederReajuste(funcionario, Desempenho.BOM);
        assertEquals(new BigDecimal("1150.00"), funcionario.getSalario());
    }

    @Test //cenário3
    public void reajusteDeVintePorcentoParaDesempenhoOtimo() {
        service.concederReajuste(funcionario, Desempenho.OTIMO);
        assertEquals(new BigDecimal("1200.00"), funcionario.getSalario());
    }
}
