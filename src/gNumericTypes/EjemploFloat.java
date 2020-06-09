package gNumericTypes;

import libs.Input;

public class EjemploFloat {

	public static void main(String[] args) {
		float f = Input.get_float(); // pide al usuario el valor de f
		
		float f2 = Input.get_float(); // pide al usuario el valor de f2
		
		Input.print("f/f2 = " + (f/f2)); // imprime el texto y el resultado de la division de las variables

	}

}
