package br.ucsal.ed;

import java.util.Scanner;

public class Teste {

	public static void main(java.lang.String[] args) {
		Scanner input = new Scanner(System.in);
		char[] carac;
		char[] carac2;
		
		System.out.println("Informe um texto: ");
		carac = input.nextLine().toCharArray();
		System.out.println("Informe um texto: ");
		carac2 = input.nextLine().toCharArray();
		
		
		String a = new String(carac);
		String b = new String(carac2);
		
		
		a.concat(b);
		
		
		
		
		input.close();
	}

}
