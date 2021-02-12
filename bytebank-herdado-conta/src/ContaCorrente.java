
public class ContaCorrente extends Conta implements Tributavel {

	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
		
	}
	
	@Override /* Esta anotação informa ao compilador que estamos querendo 
	reescrever, sobrescrever, redefinir o método da classe mãe */
	public void saca(double valor) throws SaldoInsuficienteException {
		double  valorASacar = valor + 0.2;
		super.saca(valorASacar);
	}
	 

	@Override /* Tivemos que sobrescrecer devido o método deposita na classe
	 conta estar como abstrato */
	public void deposita(double valor) {
		super.saldo += valor;
		
	}

	@Override
	public double getValorImposto() {
		return super.getSaldo() * 0.01;
	}

}
