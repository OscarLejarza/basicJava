package jStrings;

import libs.Input;

public class EjemploManejoExcepciones {
    public static void main(String[] args){
        System.out.println("Duracion del video: (mm:ss)");
        String duracionVideo = Input.get_string();

        int min = 0;
        int seg = 0;
        String[] minutos = duracionVideo.split(":");
        try{
            min = Integer.parseInt(minutos[0]);
            seg = Integer.parseInt(minutos[1]);
            System.out.println("Eltotal del video en segundos es: " + (min*60 + seg));
        } catch(NumberFormatException ex){
            System.out.println("Error en la recepcion de datos. El formato correcto es mm:ss");
        }
    }
}
