public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario nico = new Gerente();
		nico.setName("Nico Steppat");
		nico.setCpf("02825215422");
		nico.setSalario(2600);
		
		System.out.println(nico.getName());
		System.out.println(nico.getBonificacao()	);

	}

}
