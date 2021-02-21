
public class TesteSistema {

	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		gerente.setSenha(2222);
		
		SistemaInterno si = new SistemaInterno();
		si.autentica(gerente);
		
		Autenticavel adm = new Administrador();
		adm.setSenha(2222);
		si.autentica(adm);
		
		Autenticavel cliente = new Cliente();
		cliente.setSenha(2222);
		si.autentica(cliente);
		
	}

}
