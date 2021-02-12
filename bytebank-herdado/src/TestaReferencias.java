public class TestaReferencias {

	public static void main(String[] args) {
		Funcionario g1 = new Gerente();
		g1.setName("Marcos");
		String nome = g1.getName();
		g1.setSalario(5000);
		//Por que usar uma referênica genérida para um objeto mais específico?
		System.out.println(nome);
		
		EditorVideo ev = new EditorVideo();
		ev.setSalario(2500.0);
		
		Designer desig = new Designer();
		desig.setSalario(2000.0);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		controle.registra(ev);
		controle.registra(desig);
		
		System.out.println(controle.getSoma());
		
		
	}

}
