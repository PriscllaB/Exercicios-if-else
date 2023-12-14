package lacosderepeticao;

import java.util.Scanner;

public class While2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// repetir um trecho do código enquanto o usuario não digitar o comando de saida
		
		String continua = "s";
		Scanner leia = new Scanner (System.in);	
		
		while(continua.equals ("s")) {
			System.out.println("Bom dia");
			System.out.println(" Digite S para receber bom dia ");
			continua = leia.nextLine();
			
				
			
		}
		

	}

}
