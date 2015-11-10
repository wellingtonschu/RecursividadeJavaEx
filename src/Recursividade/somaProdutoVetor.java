package Recursividade;

public class somaProdutoVetor {
	
	public static double soma(double[] vetor){
		if(vetor.length == 1)
			return vetor[0];
		else{
			
			return vetor[0] + vetor [vetor.length-1];
		}
	}
	
	public static double multiplicacao(double[] vetor){
		if(vetor.length == 1)
			return vetor[0];
		else{
			
			return vetor[0] * vetor [vetor.length-1];
		}
	}

}
