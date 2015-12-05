package br.ufrpe.isbn;


public class Generator {
	
	
	public boolean validar(String num){
		if(num.length() == 9){
		for(int i=0; i < 9; i++ ){
			if(num.charAt(i) > 58 && num.charAt(i)!='x' || num.charAt(i) < 47 && num.charAt(i) !='x'){
				return false;
			}
		}
		return true;
		}
		else return false;
	}
	
	public boolean validar2(String num){
		if(num.length() == 10){
		for(int i=0; i < 10; i++ ){
			if(num.charAt(i) > 58 && num.charAt(i)!='x' || num.charAt(i) < 47 && num.charAt(i) !='x'){
				return false;
			}
		}
		return true;
		}
		else return false;
	}
	
	public int gerar(String num){
		int x=0;
		for(int i = 0; i < 9; i++){
			if(num.charAt(i) == 'x' ||  num.charAt(i) == 'X')
				x = x + 10*(i+1);
			else
			x = x + (num.charAt(i)-48)*(i+1);
		}
		return x%11;
	}
	
	

}
