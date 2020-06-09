package gNumericTypes;

import libs.Input;

public class Minutos_Botellas_Agua {
    public static void main(String Args[])
    {
        int min;
        min = pedirDatos();
        System.out.println("Gastaste " + min*12 + " botellas de agua");
        //CalcularMinutos();
        //imprimirDatos();
    }

    static int pedirDatos()
    {
        System.out.println("Introduce los minutos en numero entero: ");
        int n = Input.get_int();
                return n;
    }
    /*calcularMinutos(int n){
    }
    imprimirDatos(String valor){
    }
     */
}
