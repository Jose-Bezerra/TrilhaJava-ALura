
public class SistemaInterno {
	
	private int senha = 2222;
	
	public void autentica(Autenticavel acesso) {
		
		boolean autenticou = acesso.autentica(this.senha);
		
		if (autenticou) {
			System.out.println("Você pode entrar no sistema!");
		} else {
			System.out.println("Não pode entrar no sistema!");
		}
		
	}
	

}
