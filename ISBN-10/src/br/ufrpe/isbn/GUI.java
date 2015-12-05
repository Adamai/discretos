package br.ufrpe.isbn;

import java.util.Scanner;

public class GUI {

	public static void main(String[] args) {
		int controlador = 1;
		while (controlador != 0) {
			Scanner control = new Scanner(System.in);
			Generator g = new Generator();
			System.out.println(
					"Voc� deseja:\n1 - Gerar o d�gito verificador de um n�mero ISBN-10\n2 - Verificar se um n�mero ISBN-10 � v�lido\n0 - Encerrar");
			controlador = control.nextInt();
			if (controlador == 1) {
				System.out.println("Insira um n�mero ISBN de 9 d�gitos:");
				Scanner reader = new Scanner(System.in);
				String num = reader.nextLine();
				if (g.validar(num) == true) {
					char c = (char) (g.gerar(num) + 48);
					if (c == ':')
						System.out.println("ISBN completo: " + num + "X");
					else
						System.out.println("ISBN completo: " + num + c);
				} else {
					System.out.println("N�mero inserido inv�lido!");
				}
			}
			else if (controlador == 2) {
				System.out.println("Insira um n�mero ISBN-10 completo: ");
				Scanner reader = new Scanner(System.in);
				String num = reader.nextLine();
				if(g.validar2(num) == true){
					char c = (char) (g.gerar(num)+48);
					if(c == ':' && num.charAt(9) == 'x')
						System.out.println("1 - ISBN v�lido");
					else if(c == num.charAt(9))
						System.out.println("1 - ISBN v�lido");
					else
						System.out.println("0 - ISBN inv�lido");
				}
				
				
			} else
				System.out.println("Entrada inv�lida");
			
		}
	}

}
