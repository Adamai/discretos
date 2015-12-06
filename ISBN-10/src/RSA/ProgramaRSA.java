package RSA;

import java.math.BigInteger;
import java.util.Random;
import java.util.Scanner;

public class ProgramaRSA {

	public static void main(String[] args) {
		GerarChaves gel = new GerarChaves();
		Criptar cpt = new Criptar();
		Decriptar dpt = new Decriptar();
		Scanner scan = new Scanner(System.in);
		gel.geradorDePrimo();
		gel.geradorDeChaves();
		System.out.println("Chave publica: " + "(" + gel.getN()+ "," + gel.getE() + ")");
		System.out.println("Chave privada: " + "(" + gel.getD() + ")");
		System.out.println("Digite o texto para criptar: ");
		String mensagem = scan.nextLine();
		BigInteger[] i = cpt.criptar(mensagem);
		System.out.println("Mensagem criptada: ");
		for (int x = 0; x < mensagem.length(); x++) {			
			System.out.println(i[x].toString());
		}
		System.out.println("\nMensagem decriptada: " + dpt.decriptar(i));

	}

	

	

	

	
	
}
