//Conceito de pilha

public class Fluxo {

    public static void main(String[] args) {
        System.out.println("Ini do main");
        try {
			metodo1();
		} catch (Exception e) { //Catch genérico capiturando qualquer exceção.
			String msg = e.getMessage();
			System.out.println("Exception " + msg);
			e.printStackTrace();
		}
        System.out.println("Fim do main");
    }

    private static void metodo1() throws MinhaExcecao {
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() throws MinhaExcecao {
        System.out.println("Ini do metodo2");	
        	/*Perceba que na criaçao objeto do tipo ArithmeticException, o JAVA
        	Cria o objeto e devolve uma referência que podemos ou não armazenar numa variável/
        	ArithmeticException exception = new ArithmeticException("Deu ruim!!");
        	throw exception; */
        	throw new MinhaExcecao("Deu muito errado!"); //throw - lançar, jogar a bomba na pilha de execução.
//        System.out.println("Fim do metodo2");
    }
    
}
