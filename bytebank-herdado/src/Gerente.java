//Gerente eh um Funcionário, Gerente herda da classe Funcionário
// e assina o contrato Autenticável
public class Gerente extends Funcionario implements Autenticavel{
	
	private AutenticacaoUtil autenticador;
	
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}
	
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}
	
	
	public double getBonificacao() {
		System.out.println("Estou chamando o método da classe Gerente.");
		return super.getSalario();
	}
	
}
