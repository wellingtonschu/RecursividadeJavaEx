package Recursividade;

public class InverteString
{
	
	public static String Inverte (String Palavra)
	{
		if (Palavra.length()== 0)
			return Palavra;
		
		else
		{
			String letra = String.valueOf(Palavra.charAt(Palavra.length()-1));
			Palavra = Palavra.substring(0,Palavra.length()-1);
			return letra + Inverte(Palavra);
		}
			
	}

}
