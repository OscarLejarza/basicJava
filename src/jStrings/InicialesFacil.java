package jStrings;

import libs.Input;


public class InicialesFacil {

    public static void main(String[] args) {


        System.out.println("Ingresa tu nombre"); // imprime texto
        String nombre = Input.get_string(); // pide un input de tipo String
        String[] lista = nombre.split(" "); // separa la cadena de texto por los espacios
        for(int i = 0; i < lista.length; i++){ // ciclo para recorrer la longitus de la lista
            System.out.print(lista[i].charAt(0)); // imprime de la lista de caracteres solo los chars en la primera posicion
        }
        System.out.println("\n");

    }
}
