package br.ucsal.ed;

import java.util.Scanner;

public class String implements IString{
	
	char[]valores;
	
	public String(char a) {
		
	}
	public String() {
		Scanner input = new Scanner(System.in);
		System.out.println("Entre com um texto: ");
		valores = input.nextLine().toCharArray();
		input.close();
	}

	@Override
	public int length() {
		
		int tamanhoVetor = valores.length;
		
		return tamanhoVetor;
	}

	@Override
	public char charAt(int posicao) {
		char caractere = valores[posicao];
		return caractere;
	}

	@Override
	public boolean equals(String valor) {
		boolean equals = false;
		if(valores.length == valor.valores.length) {
			for(int cont=0; cont<valor.valores.length; cont++) {
				if(valores[cont] != valor.valores[cont]) {
					equals = false;
				}else {
					equals = true;
				}
			}
		}
	
		return equals;
	}

	@Override
	public boolean startsWith(String valor) {
		boolean starts = false;
		for(int cont=0; cont<valor.valores.length;cont++) {
			if(valores[cont] == valor.valores[cont]) {
				starts = true;
			}else {
				starts = false;
			}
		}
		return starts;
	}

	@Override
	public boolean endWith(String valor) {
		boolean end = false;
		for(int cont=0; cont<valor.valores.length;cont++) {
			if(valores[cont] == valor.valores[cont]) {
				end = true;
			}else {
				end = false;
			}
		}
		return false;
	}

	@Override
	public int indexOf(char letra) {
		
		for(int cont = 0; cont<valores.length; cont++) {
			if(valores[cont] == letra) {
				return cont;
			}
		}
		return -1;
	}

	@Override
	public int lastIndexOf(char letra) {
		int posicao = -1;
		
		for(int cont = 0; cont<valores.length; cont++) {
			if(valores[cont] == letra) {
				posicao = cont;
			}
		}
		return posicao;
	}

	@Override
	public String substring(int inicio, int quantCaracters) {
		String a = new String('a');
		a.valores = new char[quantCaracters];
		for(int cont = inicio,i=0; cont<=valores.length; cont++,i++) {
			a.valores[i] = valores[cont];
		}
		return a;
	}

	@Override
	public String replace(char letraASertrocada, char letraATrocar) {
		String repl = new String();
		repl.valores = new char[valores.length];
		for(int cont = 0; cont<valores.length; cont++) {
			if(valores[cont] == letraASertrocada) {
				valores[cont] = letraATrocar;
			}
		}
		for(int cont=0; cont<repl.valores.length; cont++) {
			repl.valores[cont] = valores[cont];
		}
		return repl;
	}

	@Override
	public String concat(String valor) {
		String a = new String('a');
		
		a.valores = new char[valores.length + valor.valores.length];
		
	
		return null;
	}

	@Override
	public void imprime() {
		for(int cont=0; cont<valores.length; cont++) {
			System.out.print(valores[cont]);
		}
		
	}

}
