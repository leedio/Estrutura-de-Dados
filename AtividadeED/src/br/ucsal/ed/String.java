package br.ucsal.ed;

import java.util.Arrays;
import java.util.Scanner;


public class String implements IString{
	Scanner input = new Scanner(System.in);
	char[]valores;
	
	public String(char a) {
		
	}
	public String() {
		valores = input.nextLine().toCharArray();
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
				return false;
			}
		}
		return starts;
	}

	@Override
	public boolean endWith(String valor) {
		boolean end = false;
		int cont = valor.valores.length, cont2=valores.length-1, cont3=valor.valores.length-1;
		
		while(cont>0) {
			if(valores[cont2]==valor.valores[cont3]) {
				end = true;
			}else {
				return false;
			}
			cont--;
			cont2--;
			cont3--;
		}
		return end;
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
		for(int cont = inicio,i=0; cont<valores.length; cont++,i++) {
			a.valores[i] = valores[cont];
		}
		return a;
	}

	@Override
	public String replace(char letraASertrocada, char letraATrocar) {
		String repl = new String('a');
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
		
		a.valores = new char[valores.length+valor.valores.length];
		
		for(int cont=0; cont<valores.length; cont++) {
			a.valores[cont] = valores[cont];
		}
		for(int cont = valores.length, cont2=0;cont<a.valores.length; cont++, cont2++) {
			a.valores[cont] = valor.valores[cont2];
		}
		return a;
	}

	@Override
	public void imprime() {
		for(int cont=0; cont<valores.length; cont++) {
			System.out.print(valores[cont]);
		}
	}
}
