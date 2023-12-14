package exercicioscanvas;

import java.util.Scanner;

public class Exerciciocanvas_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nome;
		int idade;
		boolean primeiradoacao;
		
		Scanner leia = new Scanner (System.in);
		 System.out.println("Digite o nome o doador: ");
		 nome = leia.nextLine();
		 
		 System.out.println("Digite a Idade do doador: ");
		 idade = leia.nextInt(); 
		 
		 System.out.println(" Primeira doaçao de sangue : (true/false");
		 primeiradoacao = leia.nextBoolean();
		 
		if(idade >=18 && idade <=60) {
			System.out.println(nome+ "você está apto para doar!");
			
		}else if (idade >=60 && primeiradoacao ==true) {
			System.out.println("VocÊ esta apto para doar!-");
		}
	
	}

}
