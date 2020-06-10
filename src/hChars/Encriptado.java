package hChars;

public class Encriptado {
    /*public static void main(String[] args){
        char inicial = 'a';
        int x = 12;
        System.out.println((char)(inicial + x));;
    }*/

   /* public static void main(String[] args){
        char inicial = 'a';
        int x = 12;
        double domingo = 45.89;
        System.out.println((int) domingo);
        System.out.println((char)(x + inicial));
    }*/

    public static void main(String[] args){
        char inicial = 'a';
        int x = 12;

        String numero1 = "45";
        System.out.println(Integer.parseInt(numero1)); // convierte los numero de formato de texto en formato de numero
        String numero2 = "23.45";
        System.out.println(Double.parseDouble(numero2)); // convierte los numero de formato de texto en formato de numero

        double domingo = 45.89;
        System.out.println((int) domingo);
        System.out.println((char)(x + inicial));

    }

}
