package RSA;

import java.math.BigInteger;
import java.util.Scanner;

public class Criptar {
	
	public BigInteger[] criptar(String mensagem) {
		int i;
		byte[] temp = new byte[1];
		byte[] digitos = mensagem.getBytes();
		BigInteger[] bigNumeros = new BigInteger[digitos.length];

		for (i = 0; i < bigNumeros.length; i++) {
			temp[0] = digitos[i];
			bigNumeros[i] = new BigInteger(temp);
		}

		BigInteger[] msgCripto = new BigInteger[bigNumeros.length];
		Scanner sc = new Scanner(System.in);
		System.out.println("Escreva teu N: ");
		BigInteger n = sc.nextBigInteger();
		System.out.println("Escreva teu E: ");
		BigInteger e = sc.nextBigInteger();
		for (i = 0; i < bigNumeros.length; i++)
			msgCripto[i] = bigNumeros[i].modPow(e, n);

		return (msgCripto);
	}
}
