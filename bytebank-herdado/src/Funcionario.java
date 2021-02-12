/* Esta não poderá ser instanciada porque Funcionário é muito genérico,
 * ou seja abstrata
 */

public abstract class Funcionario {
	
	private String name;
	private String cpf;
	private double salario; // Protected está entre público e privado => visível para os filhos
	
	public Funcionario() {
		
	}
	
	
	public abstract double getBonificacao();	
//		return this.salario * 0.05;
//	}
//	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
}
