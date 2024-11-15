import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num_dia, a = 0; // , mayor;
        Scanner tecladoScanner = new Scanner(System.in);

        System.out.println("Dame el numero de dia");
        num_dia = tecladoScanner.nextInt();
        tecladoScanner.close();

        System.out.println("El mayor es: " + ((a > num_dia) ? a : num_dia));
        // mayor = (num_dia > a) ? a : num_dia;
        // System.out.println("hola");

        switch (num_dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;

            case 3:
                System.out.println("Miércoles");
                break;

            case 4:
                System.out.println("Jueves");
                break;

            case 5:
                System.out.println("Viernes");
                break;

            case 6:
                System.out.println("Sábado");
                break;

            case 7:
                System.out.println("Domingo");
                break;

            default:
                System.out.println("ERROR: numero \n" +
                        "El numero ingresado es menor 1 o mayor que 7");
                break;
        }

    }
}