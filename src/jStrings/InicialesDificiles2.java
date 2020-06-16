package jStrings;

import libs.Input;

public class InicialesDificiles2 {
    public static void main(String[] args) {


        String strNombre = get_notnull_string();
        String nuevaCadena = "";
        int contadorVacios = 0;

        for (int i = 0; i < strNombre.length(); i++) {
            char actual = strNombre.charAt(i);
            boolean isApha = Character.isAlphabetic(actual);
            if (isApha) {
                nuevaCadena = nuevaCadena + "" + strNombre.charAt(i);

                contadorVacios = 0;

            }
            else if (strNombre.charAt(i) == ' ' && contadorVacios == 0) {
                contadorVacios++;
                nuevaCadena = nuevaCadena + "" + strNombre.charAt(i);

            }
        }


        System.out.println(nuevaCadena);
        String[] nombresFinal = nuevaCadena.split(" ");

        for (int i = 0; i < nombresFinal.length; i++) {
            if (nombresFinal[i].charAt(0) >= 'A' && nombresFinal[i].charAt(0) <= 'Z' || nombresFinal[i].charAt(0) >= 'a' && nombresFinal[i].charAt(0) <= 'z'
                    && !nombresFinal[i].matches("de") && !nombresFinal[i].startsWith("la") && !nombresFinal[i].matches("y"))
            {
                System.out.print(nombresFinal[i].charAt(0));
            }
        }
    }



    public static String get_notnull_string()
    {
        String nombre;
        do {
            System.out.println("Escribe el nombre deseado");
            nombre = Input.get_string();

        }
        while (nombre == null);
        return nombre;
    }
}
