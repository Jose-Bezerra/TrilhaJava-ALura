package pilha;

import java.util.Stack;

public class TesteDaPilha {

	public static void main(String[] args) {
		
		Pilha pilha = new Pilha();
		
		pilha.insere("Mauricio");
		System.out.println(pilha);

		pilha.insere("Guilherme");
		System.out.println(pilha);
		System.out.println(pilha.vazia());
		
		String r1 = pilha.remove();
		System.out.println(r1);

		String r2 = pilha.remove();
		System.out.println(r2);

		System.out.println(pilha);
		System.out.println(pilha.vazia());
		
		Stack<String> stack = new Stack<String>();
		stack.push("Mauricio");
		stack.push("Marcelo");
		
		
		String nome = stack.peek();
		System.out.println(nome);
		System.out.println(stack);

	}

}
