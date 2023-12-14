package exercicioscanvas;

import java.util.Scanner;

public class Exercicioscanvas_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float n1, n2, n3, soma; 		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Escreva um numero: ");
		n1 = leia.nextFloat();
		
		System.out.println("Escreva um numero: ");
		n2 = leia.nextFloat();
		
		System.out.println("Escreva um numero: ");
		n3 = leia.nextFloat();
		
		soma = n1+n2;
		
		if(soma >=n3) {
			System.out.println("A soma de Numero 1 mais o numero 2 é MAIOR que numero3!");
		}
		
		
		
	}

}
