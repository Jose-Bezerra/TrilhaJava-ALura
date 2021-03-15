package capitulo3.modelos;

public class Employee {

    private String nome;
    private String sobrenome;
    private double salario;

    public Employee(String nome, String sobrenome, double salario) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        if (salario > this.salario) { this.salario = salario; }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalarioAnual() {
//        System.out.printf("Salário anual: %f", salario * 12);
        return salario * 12;
    }

    public double setAumentoSalario() {
        double aumento = salario * 0.1;
        this.salario += aumento;
        return aumento;
    }


}
