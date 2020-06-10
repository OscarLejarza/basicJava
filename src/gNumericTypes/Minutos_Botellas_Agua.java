package gNumericTypes;

import libs.Input;

public class Minutos_Botellas_Agua {
    public static void main(String[] args)
    {
       int min = get_positive();
        System.out.println("Gastaste " + min*12 + " botellas de agua. AHORRA MAS!");

    }
    public static int get_positive() {
        int min;
        do {
            System.out.print("Favor de Introducir un numero positivo: ");
            min = Input.get_int();
        }
        while (min <= 0);
        return min;
    }

   /* static int pedirDatos()
    {
        System.out.println("Cuantos minutos tardas en bañarte? \nIntroduce los minutos en numero entero: ");
        int n = Input.get_int();
                return n;*
    }

    /*public static int get_positive_int()
    {
        int min;
        do
        {
            System.out.print("Favor de Introducir un numero positivo: ");
            min = Input.get_int();
        }
        while (min < 0);
        return min;
    }*/

}