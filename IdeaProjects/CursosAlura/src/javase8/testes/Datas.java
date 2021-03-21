package javase8.testes;

import java.text.DateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class Datas {
    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();

        System.out.println("Trabalhando com Datas.");
        LocalDate olimpidadasJapao = LocalDate.of(2021, Month.JULY, 23);
        int anos = olimpidadasJapao.getYear() - hoje.getYear();
        System.out.println(anos + " Diferença de anos");
        System.out.println();
        System.out.println("Trabalhando com período de tempo");
        Period periodo = Period.between(hoje, olimpidadasJapao);
        System.out.println(periodo);
        System.out.println(periodo.getYears() + " Anos");
        System.out.println(periodo.getMonths() + " Meses.");
        System.out.println(periodo.getDays() + " Dias");
        System.out.println();
        System.out.println(hoje.minusYears(1) + "  1 ano antes");
        System.out.println(hoje.minusMonths(4) + " 4 Meses antes");
        System.out.println(hoje.minusDays(2) + " 2 dias antes");
        System.out.println();
        System.out.println(hoje.plusYears(1) + " 1 ano depois");
        System.out.println(hoje.plusMonths(4) + " 4 meses depois");
        System.out.println(hoje.plusDays(2) + " 2 dias depois");
        System.out.println();
        LocalDate olimpiadasParis = olimpidadasJapao.plusYears(4);
        System.out.println(olimpiadasParis+ " Próxima Olimpíadas");
        System.out.println();
        System.out.println("Trabalhando a formatação de datas.");
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String valorFormatado = olimpiadasParis.format(formatador);
        System.out.println(valorFormatado + " Data formatada");
        System.out.println();

        DateTimeFormatter formatadorComHoras = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");
        LocalDateTime agora = LocalDateTime.now();
        System.out.println(agora.format(formatadorComHoras));

        DateTimeFormatter formatadorAnoMes = DateTimeFormatter.ofPattern("MM/yyyy");
        YearMonth anoMes = YearMonth.of(2023, Month.MARCH);
        System.out.println(anoMes.format(formatadorAnoMes));

        LocalTime intervalo = LocalTime.of(15, 30);
        System.out.println(intervalo);

    }
}
