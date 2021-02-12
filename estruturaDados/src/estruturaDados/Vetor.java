package estruturaDados;

import java.util.Arrays;

public class Vetor {
	private Aluno[] alunos = new Aluno[100];
	private int totalAlunos = 0;
	
	public void adiciona (Aluno aluno) { //Procuramos um null no array para colocar o aluno.
//		Temos um problema com o algoritmo abaixo pois ele é linear - O(N)
//		for ( int i = 0; i < alunos.length; i++) {
//			if (alunos[i] == null) {
//				alunos[i] = aluno;
//				break;
//			}
//		}
		this.garanteEspaco();
		this.alunos[totalAlunos] = aluno; //tempo constante para inserir um aluno.
		totalAlunos++;
	}
	
	private boolean posicaoValida(int posicao) {
		return posicao >= 0 && posicao <= totalAlunos;
	}
	
	private void garanteEspaco() {
		if (totalAlunos == alunos.length) {
			Aluno[] novoArray = new Aluno[alunos.length * 2];
			for (int i = 0; i < alunos.length; i++) {
				novoArray[i] = alunos[i];
			}
			
			this.alunos = novoArray;
		}
	}
	
	//Queremos adicionar um aluno em qualquer posicao do array.
	//Temos que abrir um buraco no array e empurrar os elementos para direita
	public void adiciona (int posicao, Aluno aluno) {
		this.garanteEspaco();
		if (!posicaoValida(posicao)) {
			throw new IllegalArgumentException("Posição inválida!");
		}
		
		for (int i = totalAlunos - 1; i >= posicao; i -= 1) {
			alunos[i + 1] = alunos[i];
		}
		
		alunos[posicao] = aluno; // Inserindo o aluno na posicão desejada.
		totalAlunos++;
	}
	
	//Vamos criar um método auxiliara para validar a posição.
	private boolean posicaoOcupada (int posicao) {
		return posicao >= 0 && posicao < totalAlunos;
	}
	
	public Aluno pega(int posicao) {
		if (!posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("Posição inválida!");
		}
		return alunos[posicao]; //Precisamos começar a validar! Se passarmos a posição 200?
	}
	
	public void remove(int posicao) {
		for ( int i = posicao; i < totalAlunos; i++) {
			this.alunos[i] = this.alunos[i + 1];
		}
		
		totalAlunos--;
	}
	
	public boolean contem(Aluno aluno) {
		 for ( int i = 0; i < totalAlunos; i++) {
			 if (aluno.equals(alunos[i])) {
				 return true;
			 }
		 }
		return false;
	}
	
	public int tamanho() {
		return totalAlunos;
	}
	
	public String toString() {
		return Arrays.toString(alunos);
	}
}
