package jStrings;
import libs.Input;

public class InicialesDificil {
    public static void main(String[] args) {
        System.out.println("Introduce tu nombre completo ");
        String nomTrim = Input.get_string().trim();

        String[] nombres = nomTrim.split("\\s+"); // \\s Quita los espacios intermedios entre los String.
                                                        // Espacio simple o multiple (expresion regular)

        for(int i = 0; i < nombres.length; i++) {
            String upperNombre = nombres[i].toUpperCase();

            System.out.println(upperNombre.charAt(0));
        }
    }
}
