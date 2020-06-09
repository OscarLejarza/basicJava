package gNumericTypes;

import libs.Input;

public class Adder {

	public static void main(String args[])
	{
		// prompt user for x
		System.out.print("x is: "); // funcion para imprimir el texto en consola
	    int x = Input.get_int(); // pide al usuario el valor de x
	    
	    // prompt user for y
	    System.out.print("y is: ");// funcion para imprimir el texto en consola
	    int y = Input.get_int(); // pide al usuario el valor de y
	    
	    // calculate sum for user
	    System.out.println("sum is " + (x + y) + "\n"); // imprime el texto, con la suma de las variables y un salto de linea
	}
}