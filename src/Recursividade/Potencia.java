package Recursividade;

public class Potencia
{
	
	public static double potencia(double base, double expoente)
	{
		if(expoente == 1)
			return base;
		
		else
			return base * potencia(base, expoente - 1);
	}

}
