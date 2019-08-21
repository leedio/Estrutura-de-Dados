package br.ucsal.ed;

public interface IString {
	public int length();
	public char charAt(int posicao);
	public boolean equals(String valor);
	public boolean startsWith(String valor);
	public boolean endWith(String valor);
	public int indexOf(char letra);
	public int lastIndexOf(char letra);
	public String substring(int inicio, int quantCaracters);
	public String replace(char letraASertrocada, char letraATrocar);
	public String concat(String valor);
	public void imprime();
}
