package iLoops;

import libs.Input;

public class Ciclos {

	public static void main(String[] args) {
		//imprimir numeros del 0 al 10 (0  1  2  3  4  5  6  7  8  9  10)
		int numero  = 0; // contador
		while(numero <= 10) { // Condicion que se tendra que cumplir para proceder a la ejecución de las instrucciones
			Input.print(numero); // instrucciones
			Input.print("  ");
			numero += 1; // actualizador del contador
		}
		Input.print("\n");
		//imprimir la cuenta regresiva de un cohete,  cuando llegue a cero, diga 'despegar'
		numero=10; // contador
		while (numero >= 0) { // condicion
			if(numero == 0) { // instrucción (condicional)
				Input.print("que tragon eres");
				
			}
			else {
				Input.print(numero);
				Input.print("  ");
				
			}
			numero -= 1; // actualizador de contador
		}

		Input.print("\n");

	System.out.println("Cuantas repeticiones quieres? ");
		int numeroRepeticiones = Input.get_int();
		for(int i = 0; i < numeroRepeticiones; i++) { // contador, condicion, actualizador de contador
			hagoAlgo(); // instruccion
		}
	}

	private static void hagoAlgo() {
		System.out.println("repeticion");
	}


}
