package RSA;

import java.math.BigInteger;
import java.util.Scanner;

public class Decriptar {
	public String decriptar(BigInteger[] msgCripto) {
		BigInteger[] msgDecripto = new BigInteger[msgCripto.length];
		Scanner sc = new Scanner(System.in);
		System.out.println("Escreva teu N: ");
		BigInteger n = sc.nextBigInteger();
		System.out.println("Escreva teu D: ");
		BigInteger d = sc.nextBigInteger();
		
		for (int i = 0; i < msgDecripto.length; i++)
			msgDecripto[i] = msgCripto[i].modPow(d, n);

		char[] charArray = new char[msgDecripto.length];

		for (int i = 0; i < charArray.length; i++)
			charArray[i] = (char) (msgDecripto[i].intValue());

		return (new String(charArray));
	}
}
