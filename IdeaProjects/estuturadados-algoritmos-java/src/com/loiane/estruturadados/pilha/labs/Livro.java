package com.loiane.estruturadados.pilha.labs;

public class Livro {
  private String nome;
  private String autor;
  private String isbn;
  private int anoLancamento;

  public Livro() {
  }

  public Livro(String nome, String autor, String isbn, int anoLancamento) {
    this.setNome(nome);
    this.setAutor(autor);
    this.setIsbn(isbn);
    this.setAnoLancamento(anoLancamento);
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getAutor() {
    return autor;
  }

  public void setAutor(String autor) {
    this.autor = autor;
  }

  public String getIsbn() {
    return isbn;
  }

  public void setIsbn(String isbn) {
    this.isbn = isbn;
  }

  public int getAnoLancamento() {
    return anoLancamento;
  }

  public void setAnoLancamento(int anoLancamento) {
    this.anoLancamento = anoLancamento;
  }

  @Override
  public String toString() {
    return "Livro{" +
        "nome='" + nome + '\'' +
        ", autor='" + autor + '\'' +
        ", isbn='" + isbn + '\'' +
        ", anoLancamento=" + anoLancamento +
        '}';
  }
}
