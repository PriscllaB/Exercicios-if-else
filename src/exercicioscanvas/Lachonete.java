package exercicioscanvas;

import java.util.Scanner;

public class Lachonete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		int produto, quantidade;
		
		System.out.println("Digite o codigo do produto: ");
		produto = leia.nextInt();
		
		System.out.println("Digite a quantidade");
		quantidade = leia.nextInt();
		
		switch(produto) {
		case 1:
			System.out.println("Produto: Cachorro quente");
			System.out.println("valor total de compra: " + (quantidade * 10.00));
			break;
			
		case 2:
			System.out.println("Produto: X-salada");
			System.out.println("valor total de compra: " + (quantidade * 15.00));
			break;
			
		case 3:
			System.out.println("Produto: X-bacon");
			System.out.println("valor total de compra: " + (quantidade * 18.00));
			break;
			
		case 4:
			System.out.println("Produto: bauru");
			System.out.println("valor total de compra: " + (quantidade * 12.00));
			break;
		case 5:
			System.out.println("Produto: Refrigerante");
			System.out.println("valor total de compra: " + (quantidade * 18.00));
			break;
			
		case 6:
			System.out.println("Produto: suco de laranja");
			System.out.println("valor total de compra: " + (quantidade * 12.00));
			break;
		default:
			System.out.println("Opção invalida ");
		}
		

	}

}
