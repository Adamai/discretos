package br.ufrpe.HammingCode;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HammingCode {

	public static void main(String [] args) throws IOException{
		
		int vetor[] = new int[9];
		 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("digite o vetor de 8 bits, um bit por vez");
		for(int i = 1; i <=8;i++){
			 vetor[i] = Integer.parseInt(br.readLine());
		 }
		
		System.out.print("Vetor de entrada:  ");
		for(int j = 1; j <=8;j++){
			System.out.print(vetor[j]);
		}
		
		int vetorHamming[] = new int[13];
		GerarBitsVerificacao(vetor, vetorHamming);
		GerarBitUm(vetorHamming);
		GerarBitDois(vetorHamming);
		GerarBitQuatro(vetorHamming);
		GerarBitOito(vetorHamming);
		
		System.out.print("\nVetor de saida:  ");
		for(int j = 1;j<=12;j++){
			System.out.print(vetorHamming[j]);
		}
	}
	
	static void GerarBitsVerificacao(int[] vetor, int vetorHamming[]){
		int i = 1;
		int j = 0;
		int k = 1;
		
		while(i<13 || j<4)
        {
            if((int)Math.pow(2,j) == i)
            {
                vetorHamming[i]=0;
                j++;
            }
            else
            {
                vetorHamming[i]=vetor[k];
                k++;
            }
            i++;
        }
		
	}
	
	
	static void GerarBitUm(int[] vetorHamming){
		int numeroDeUns = 0;
		
		for(int i = 2;i<=12;i=i+2){
			if(vetorHamming[i] == 1){
				numeroDeUns++;
			}
		}
		
		if(numeroDeUns%2==0){
			vetorHamming[1] = 0;
		}
		else{
			vetorHamming[1] = 1;
		}
		
		
	}
	
	static void GerarBitDois(int[]vetorHamming){
		int numeroDeUns = 0;
		int aux[] = new int[6];
		
		aux[0] = vetorHamming[2];
		aux[1] = vetorHamming[3];
		aux[2] = vetorHamming[6];
		aux[3] = vetorHamming[7];
		aux[4] = vetorHamming[10];
		aux[5] = vetorHamming[11];
		
		for(int i =0; i<aux.length;i++){
			if(aux[i]==1){
				numeroDeUns++;
			}
		}
		if(numeroDeUns%2==0){
			vetorHamming[2] = 0;
		}
		else{
			vetorHamming[2] = 1;
		}
		
	}
	
	static void GerarBitQuatro(int[] vetorHamming){
		int numeroDeUns = 0;
		int aux[] = new int[5];
		
		aux[0] = vetorHamming[4];
		aux[1] = vetorHamming[5];
		aux[2] = vetorHamming[6];
		aux[3] = vetorHamming[7];
		aux[4] = vetorHamming[12];

		for(int i =0; i<aux.length;i++){
			if(aux[i]==1){
				numeroDeUns++;
			}		
		}
		
		if(numeroDeUns%2==0){
			vetorHamming[4] = 0;
		}
		else{
			vetorHamming[4] = 1;
		}
		
	}
	
	static void GerarBitOito(int[]vetorHamming){
		int numeroDeUns = 0;
		int aux[] = new int[5];
		
		aux[0] = vetorHamming[8];
		aux[1] = vetorHamming[9];
		aux[2] = vetorHamming[10];
		aux[3] = vetorHamming[11];
		aux[4] = vetorHamming[12];

		for(int i =0; i<aux.length;i++){
			if(aux[i]==1){
				numeroDeUns++;
			}		
		}
		
		if(numeroDeUns%2==0){
			vetorHamming[8] = 0;
		}
		else{
			vetorHamming[8] = 1;
		}
	}
	
}
