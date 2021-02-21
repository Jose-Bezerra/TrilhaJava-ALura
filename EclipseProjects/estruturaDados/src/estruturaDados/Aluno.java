package estruturaDados;
//Precisamos modelar a classe aluno para realizarmos algumas operações 
//objetos alunos dentro do array alunos


public class Aluno {
	private String nome;
	
	public Aluno(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	@Override
	public boolean equals(Object obj) {
		Aluno outro = (Aluno) obj;
		return outro.getNome().equals(this.nome);
	}
	
	@Override
	public String toString() {
		return nome;
	}
}
