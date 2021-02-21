
public class ControleBonificacao {
	// Vamos entender o Polimorfismo
	/*Observe que usamos no método abaixo uma referência genérica - Funcionário 
	 * para registrar a bonificaçao de qualquer Tipo de funcionário, seja ele um 
	 * um editor de vídeo, gerente, designer ou qualquer outro. Usamos o polimor-
	 * fismo para criar uma "porta" para qualquer tipo de funcionário. Evitamos o
	 * Code Smell - evitando reutilização de código.
	 * A REAL VANTAGEM DO POLIMORFISMO?
	 * 
	 * Perceba no método abaixo que perguntamos qual a bonificação do Funcionario 
	 * func através do getBonificacao(). O legal é que dependendo do tipo de 
	 * objeto que chamou o getBonificacao, será executa o get específico seja do
	 * Gerente, Edito de vídeo, Designer.. e por aí vai....
	 * */
	private double soma = 0;
	
	public void registra(Funcionario func) {
		double boni = func.getBonificacao();
		this.soma = this.soma + boni;
	}
	
	public double getSoma() {
		return soma;
	}
	
}