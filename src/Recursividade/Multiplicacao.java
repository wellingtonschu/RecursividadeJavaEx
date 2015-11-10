package Recursividade;

public class Multiplicacao {
	
	public static int multiplicacao(int produto1, int produto2){
		if (produto2 == 0)
			return produto1;
		else
			return produto1 + multiplicacao(produto1, produto2 - 1);
	}

}
