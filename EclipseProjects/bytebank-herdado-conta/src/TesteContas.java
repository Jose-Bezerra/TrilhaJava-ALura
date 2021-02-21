
public class TesteContas {

	public static void main(String[] args) throws SaldoInsuficienteException {
		
		ContaCorrente cc = new ContaCorrente(0321, 1095668);
		cc.deposita(100.00);
		
		ContaPoupanca cp = new ContaPoupanca(3224, 2536899);
		cp.deposita(200.00);
		
		cc.transfere(110.00, cp); //Exemplo de Polimorfismo
		
		System.out.println("CC " + cc.getSaldo());
		System.out.println("CP " + cp.getSaldo());

	}

}

