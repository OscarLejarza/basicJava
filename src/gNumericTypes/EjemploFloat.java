package gNumericTypes;

import libs.Input;

public class EjemploFloat {

	public static void main(String[] args) {
		System.out.println("Introduce la calificación 1: ");
		float f = Input.get_float(); // pide al usuario el valor de f
		System.out.println("Introduce la ponderación: ");
		float f2 = Input.get_float(); // pide al usuario el valor de f2
		System.out.println("La calificación final es: ");
		Input.print("f/f2 = " + (f/f2)); // imprime el texto y el resultado de la division de las variables

	}

}
