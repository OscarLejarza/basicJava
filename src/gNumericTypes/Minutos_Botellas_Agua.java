package gNumericTypes;

import libs.Input;

public class Minutos_Botellas_Agua {
    public static void main(String[] args)
    {
       int min;
        min = pedirDatos();
        System.out.println("Gastaste " + min*12 + " botellas de agua. AHORRA MAS!");
        //CalcularMinutos();
        //imprimirDatos();
    }

    static int pedirDatos()
    {
        System.out.println("Cuantos minutos tardas en bañarte? \nIntroduce los minutos en numero entero: ");
        int n = Input.get_int();
                return n;
    }

}
