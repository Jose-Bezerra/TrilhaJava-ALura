//Conceito de pilha

public class FluxoComTratamento {

    public static void main(String[] args) {
        System.out.println("Ini do main");
        try {
			metodo1();
		} catch (ArithmeticException | NullPointerException | MinhaExcecao e) {
			String msg = e.getMessage();
			System.out.println("Exception " + msg);
			e.printStackTrace();
		}
        System.out.println("Fim do main");
    }

    private static void metodo1() throws MinhaExcecao{
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() throws MinhaExcecao{
        System.out.println("Ini do metodo2");
        for(int i = 1; i <= 5; i++) {
            System.out.println(i);
//            int a = 3 / 0;
            Conta c = null;
            c.deposita();
        }
        System.out.println("Fim do metodo2");
    }
    
}
