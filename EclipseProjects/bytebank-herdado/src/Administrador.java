
public class Administrador extends Funcionario implements Autenticavel{
	
	private AutenticacaoUtil autenticador;
	
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}
	
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}
	
	@Override
	public double getBonificacao() {
		return 50;
	}

}
