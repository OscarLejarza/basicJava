package gNumericTypes;

public class Overflow {

	public static void main(String args[])
	{
		int n = 1; // define que la variable n es igual a 1
	    for (int i = 0; i < 64; i++) // se crea un ciclo donde i es igual a 0, cuando i es menor que 64, entonces i se incrementara 1
	    {
	    	System.out.print("n: " + n + "\n"); // imprime el texto donde n es igual al valor de n y un salto de linea
	        n = n * 2; // para terminar el ciclo, el valor de n se multiplica po r2
	    }
	}
}



