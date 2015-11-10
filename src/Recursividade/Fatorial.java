package Recursividade;

public class Fatorial
{

	public static double Fatorial (double num)
	{
		if(num <= 1)
			return 1;
		else
			return num * Fatorial(num - 1);
	}

}
