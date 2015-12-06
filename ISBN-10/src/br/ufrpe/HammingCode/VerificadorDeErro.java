package br.ufrpe.HammingCode;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class VerificadorDeErro {

	
	public static void main(String []args)throws IOException{
		int vetor[] = new int[13];
		 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Insira um vetor de hamming de 12 dígitos");
		for(int i = 1; i <=12;i++){
			 vetor[i] = Integer.parseInt(br.readLine());
		 }
		System.out.print("Vetor de entrada: ");
		for(int i = 0;i<=12;i++){
			System.out.print(vetor[i]);
		}
		
		if(VerificarErro(vetor)){
			System.out.println("\nErro encontrado");
			CorrigirErro(vetor);
			System.out.print("Vetor corrigido:  ");
			for(int i = 0;i<=12;i++){
				System.out.print(vetor[i]);
			}
		}
		else{
			System.out.println("\nVetor sem erro");
			for(int i = 0;i<=12;i++){
				System.out.print(vetor[i]);
			}
		}
			
	}
	
	static boolean VerificarErro(int[] vetor){
		int numeroDeUns = 0;
		boolean resultado = false;
		
		for(int i = 0;i<=12;i++){
			if(vetor[i]==1){
				numeroDeUns++;
			}
		}
		if(numeroDeUns%2==0){
			return resultado;
		}
		else{
			resultado = true;
			return resultado;
		}
		
	}
	
	static void CorrigirErro(int[]vetor){
	
		int indice = VerificarParidadeUm(vetor) + VerificarParidadeDois(vetor) + VerificarParidadeQuatro(vetor) + VerificarParidadeOito(vetor);
		vetor[indice] = 0;
	}
	
	static int VerificarParidadeUm(int[]vetor){
		int numeroDeUns = 0;
		
		for(int i = 1;i<=12;i=i+2){
			if(vetor[i] == 1){
				numeroDeUns++;
			}
		}
		
		if(numeroDeUns%2==0){
			return 0;
		}
		else{
			return 1;
		}
	}
	
	static int VerificarParidadeDois(int[]vetor){
		int numeroDeUns = 0;
		int aux[] = new int[6];
		
		aux[0] = vetor[2];
		aux[1] = vetor[3];
		aux[2] = vetor[6];
		aux[3] = vetor[7];
		aux[4] = vetor[10];
		aux[5] = vetor[11];
		
		for(int i =0; i<aux.length;i++){
			if(aux[i]==1){
				numeroDeUns++;
			}
		}
		if(numeroDeUns%2==0){
			return 0;
		}
		else{
			return 2;
		}
	}
	
	static int VerificarParidadeQuatro(int[]vetor){
		int numeroDeUns = 0;
		int aux[] = new int[5];
		
		aux[0] = vetor[4];
		aux[1] = vetor[5];
		aux[2] = vetor[6];
		aux[3] = vetor[7];
		aux[4] = vetor[12];

		for(int i =0; i<aux.length;i++){
			if(aux[i]==1){
				numeroDeUns++;
			}		
		}
		
		if(numeroDeUns%2==0){
			return 0;
		}
		else{
			return 4;
		}
	}
	
	static int VerificarParidadeOito(int[]vetor){
		int numeroDeUns = 0;
		int aux[] = new int[5];
		
		aux[0] = vetor[8];
		aux[1] = vetor[9];
		aux[2] = vetor[10];
		aux[3] = vetor[11];
		aux[4] = vetor[12];

		for(int i =0; i<aux.length;i++){
			if(aux[i]==1){
				numeroDeUns++;
			}		
		}
		
		if(numeroDeUns%2==0){
			return 0;
		}
		else{
			return 8;
		}
	}
	
	
}
