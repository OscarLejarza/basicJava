package gNumericTypes;

import libs.Input;

public class Floats {

	public static void main(String args[])
	{
		// prompt user for x
		System.out.print("x is "); // imprime el texto
	    float x = Input.get_float(); // pide al usuario el valor de x
	    
	    // prompt user for y
	    System.out.print("y is "); // imprime el texto
	    float y = Input.get_float(); // pide al usuario el valor de y
	    
	    // perform division for user
	    System.out.print(x + " divided by " + y + " is " + ( x / y) + "\n"); // imprime el valor de las variables,
	}                                                                        // el texto y el resultado de la
}                                                                            // division de x sobre y


