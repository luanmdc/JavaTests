public class QuantidadeVogais {
	public static void main(String[] args){

		String frase = "telhado";
		
		int contarVogais = 0;

		for(int i=0; i < frase.length(); i++){

		if(

		frase.charAt(i) =='a' 
		||frase.charAt(i) =='A' 
		||frase.charAt(i) =='e' 
		||frase.charAt(i) =='E' 
		||frase.charAt(i) =='i' 
		||frase.charAt(i) =='I' 
		||frase.charAt(i) =='o' 
		||frase.charAt(i) =='O' 
		||frase.charAt(i) =='u' 
		||frase.charAt(i) =='U' 
		){

		int quantidadeVogais +=1;
	}
	}
		int quantidadePalavras = frase.length();

		int QuantidadeConsoante = quantidadePalavras - quantidadeVogais;

		System.out.println("essa frase tem:"+ quantidadePalavras+ "caracteres"+ quantidadeVogais+ "vogais e"+ quantidadeConsoante+ "consoantes");
	}

		}




