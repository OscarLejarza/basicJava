package iConditionals;

import libs.Input;

public class MinimoMonedas2 {
    public static void main(String[] args){
        System.out.println("Introduce el cambio a devolver");

            double cambiod = Input.get_double();

     int cambio = (int) (cambiod * 100);
     calculaMonedas(cambio);


    }

    private static void calculaMonedas(int cambio){

        int mon50 = 0;
        int mon25 = 0;
        int mon10 = 0;
        int mon5 = 0;
        int mon1 = 0;
        int centavosSobrantes = 0;
        int numMonedas = 0;

        if (cambio >= 50){
            mon50 = cambio / 50;
            centavosSobrantes = cambio % 50;
            numMonedas = mon50;
        }
        if (centavosSobrantes >= 25) {
            mon25 = centavosSobrantes / 25;
            centavosSobrantes = centavosSobrantes % 25;
            numMonedas = numMonedas + mon25;
        }
        if (centavosSobrantes >= 10) {
            mon10 = centavosSobrantes / 10;
            centavosSobrantes = centavosSobrantes % 10;
            numMonedas = numMonedas + mon10;
        }
        if (centavosSobrantes >= 5) {
            mon5 = centavosSobrantes / 5;
            centavosSobrantes = centavosSobrantes % 5;
            numMonedas = numMonedas + mon5;
        }
        if (centavosSobrantes >= 1) {
            mon1 = centavosSobrantes / 1;
            centavosSobrantes = centavosSobrantes % 1;
            numMonedas = numMonedas + mon1;
        }

        System.out.println("Numero de monedas de cambio = " + numMonedas);
        System.out.println("Numero de monedas de 50c = " + mon50);
        System.out.println("Numero de monedas de 25c = " + mon25);
        System.out.println("Numero de monedas de 10c = " + mon10);
        System.out.println("Numero de monedas de 5c = " + mon5);
        System.out.println("Numero de monedas de 1c = " + mon1);

    }
}