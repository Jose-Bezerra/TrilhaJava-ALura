public class TesteGerente {

	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		gerente.setName("Jailheminau");
		gerente.setCpf("02825215422");
		gerente.setSalario(5000);
		
		System.out.println("O gerente é o sr. " + gerente.getName() + 
							" cujo CPF é : " + gerente.getCpf() +
							" com salário de " + gerente.getSalario());
		
		gerente.setSenha(234);
		boolean autenticou = gerente.autentica(234);
		System.out.println(autenticou);
		System.out.println(gerente.getBonificacao());
		
	}

}
