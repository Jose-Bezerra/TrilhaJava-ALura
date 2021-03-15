package capitulo3.testes;

import capitulo3.modelos.Employee;

public class EmloyeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee("José", "Bezerra", -10000);
        Employee employee2 = new Employee("Patrícia", "Cavalcante", 12000);

        double salarioAnual1 = employee1.getSalarioAnual();
        double salarioAnual2 = employee2.getSalarioAnual();

        System.out.println(salarioAnual1);
        System.out.println(salarioAnual2);

        employee1.setAumentoSalario();
        employee2.setAumentoSalario();

        salarioAnual1 = employee1.getSalarioAnual();
        salarioAnual2 = employee2.getSalarioAnual();

        System.out.println(salarioAnual1);
        System.out.println(salarioAnual2);

    }
}
