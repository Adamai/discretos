package RSA;

import java.math.BigInteger;
import java.util.Random;

public class GerarChaves {
	int tamPrimo  = 10;
	BigInteger n, q, p;
	BigInteger totient;
	BigInteger e, d;
	
	public void geradorDePrimo() {
		p = new BigInteger(tamPrimo, 10, new Random());
		do
			q = new BigInteger(tamPrimo, 10, new Random());
		while (q.compareTo(p) == 0);
	}

	public void geradorDeChaves() {
		n = p.multiply(q);

		totient = p.subtract(BigInteger.valueOf(1));
		totient = totient.multiply(q.subtract(BigInteger.valueOf(1)));

		do
			e = new BigInteger(2 * tamPrimo, new Random());
		while ((e.compareTo(totient) != -1) || (e.gcd(totient).compareTo(BigInteger.valueOf(1)) != 0));

		d = e.modInverse(totient);
	}
	
	public int getTamPrimo() {
		return tamPrimo;
	}

	public BigInteger getN() {
		return n;
	}

	public BigInteger getQ() {
		return q;
	}

	public BigInteger getP() {
		return p;
	}

	public BigInteger getTotient() {
		return totient;
	}

	public BigInteger getE() {
		return e;
	}

	public BigInteger getD() {
		return d;
	}

	public void setTamPrimo(int tamPrimo) {
		this.tamPrimo = tamPrimo;
	}

	public void setN(BigInteger n) {
		this.n = n;
	}

	public void setQ(BigInteger q) {
		this.q = q;
	}

	public void setP(BigInteger p) {
		this.p = p;
	}

	public void setTotient(BigInteger totient) {
		this.totient = totient;
	}

	public void setE(BigInteger e) {
		this.e = e;
	}

	public void setD(BigInteger d) {
		this.d = d;
	}

}
