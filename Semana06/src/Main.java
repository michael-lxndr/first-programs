import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String tipoUsuario, tipoEvento, sinoTarjeta;
        double descuento = 0, costoEntrada = 0, costoPagar;
        Scanner kbdScanner = new Scanner(System.in);

        System.out.println("Es estudiante? (si/no)");
        tipoUsuario = kbdScanner.next();
        if (tipoUsuario.equals("si")) {
            descuento = 0.80;
            // System.out.println("estudiante");

        } else if (tipoUsuario.equals("no")) {
            System.out.println("Es un adulto? (si/no)");
            tipoUsuario = kbdScanner.next();

            if (tipoUsuario.equals("si")) {
                descuento = 1;
                // System.out.println("adulto");

            } else if (tipoUsuario.equals("no")) {
                System.out.println("Es un adulto MAYOR? (si/no)");
                tipoUsuario = kbdScanner.next();

                if (tipoUsuario.equals("si")) {
                    descuento = 0.70;
                    // System.out.println("mayor");

                } else if (tipoUsuario.equals("no")) {
                    System.out.println("Error al elegir el tipo de Usuario");
                }
            }
        }

        //
        System.out.println("A que evento desea ir: (teatro/musica/artes)");
        tipoEvento = kbdScanner.next();
        /*
         * if (tipoEvento.equals("teatro")) {
         * costoEntrada = 15;
         * } else if (tipoEvento.equals("musica")) {
         * costoEntrada = 10;
         * } else if (tipoEvento.equals("arte")) {
         * costoEntrada = 8;
         * }
         */
        switch (tipoEvento) {
            case "teatro" -> costoEntrada = 15;
            case "musica" -> costoEntrada = 10;
            case "arte" -> costoEntrada = 8;
        }

        //
        System.out.println("Posee la tarjeta de descuento del festival? (si/no)");
        sinoTarjeta = kbdScanner.next();

        if (sinoTarjeta.equals("si")) {
            descuento -= 0.1;
        }
        kbdScanner.close();

        costoPagar = costoEntrada * descuento;

        // ? Para masar el numero de muchos deciamles a maximo 3 decimales: Uso
        // "Math.floor( # * 1000) / 1000"
        System.out.println("El costo de la entrada es de:\n" + Math.floor(costoPagar * 1000) / 1000 + "$");
        System.out.println("con un descuento de:\n" + Math.floor((1 - descuento) * 100 + 1) * 1000 / 1000 + "%");
    }
}