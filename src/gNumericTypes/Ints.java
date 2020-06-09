package gNumericTypes;

import libs.Input;

public class Ints {

	public static void main(String args[])
	{
		// prompt user for x
		System.out.print("x is "); // imprime el texto
	    int x = Input.get_int(); // pide al usuario el valor de x
	    
	    // prompt user for y
	    System.out.print("y is "); // imprime el texto
	    int y = Input.get_int(); // pide al usuario el valor de y
	    
	    // perform calculations for user
	    System.out.print(x + " plus " + y + " is " + (x + y) + "\n"); // imprime el texto y la operacion de suma
	    System.out.print(x + " minus " + y + " is " + (x - y) + "\n"); // imprime el texto y la operacion de resta
	    System.out.print(x + " times " + y + " is " + (x * y) + "\n"); // imprime el texto y la operacion de multiplicacion
	    System.out.print(x + " divided by " + y + " is " + (x / y) + "\n"); // imprime el texto y la operacion de division
	    System.out.print("The reminder of " + x + " over "+ y + " is " + (x % y) + "\n"); // imprime el texto y la sobra de la division
	}
}


