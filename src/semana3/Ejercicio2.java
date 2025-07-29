package semana3;

public class Ejercicio2 {
    public static void parImpar(String letras, int num1, int num2) {

        if (letras.equals("PAR")) {
          for (int i = num1; i <= num2; i++) {
              if(i % 2 == 0) {
                  System.out.println(i);
              }
          }
        } else if(letras.equals("IMPAR")) {
            for (int i = num1; i <= num2; i++) {
                if(i % 2 != 0) {
                    System.out.println(i);
                }
            }
        }
    }

    public static void numeros(int num) {
        int count = 0;
        int numUser = num;

        while (num > 0) {
            num = num / 10;
            count++;
        }

        System.out.println("El número " + numUser + " tiene " + count + " dígitos.");
    }

    public static void caraCruz(String elejir) {
        int cara = 0;
        int cruz = 0;

        elejir = elejir.toLowerCase();

        System.out.println("¡Comienza el juego!");

        do {
            int lanzamiento = (int)(Math.random() * 2);

            if (lanzamiento == 1) {
                cara++;
                System.out.println("Salió CARA (1). Total CARAS: " + cara);
            } else {
                cruz++;
                System.out.println("Salió CRUZ (0). Total CRUCES: " + cruz);
            }

        } while (cara < 5 && cruz < 5);

        if ((cara == 5 && elejir.equals("cara")) || (cruz == 5 && elejir.equals("cruz"))) {
            System.out.println("¡Felicidades! Ganaste, tu lado (" + elejir + ") salió 5 veces primero.");
        } else {
            System.out.println("Lo siento, perdiste. El otro lado salió 5 veces primero.");
        }
    }

    public static void main(String[] args) {

        //FOR
        /*
        if (args.length != 3) {
            System.out.println("Solo 3 argumetos PAR o IMPAR y numeros ejemplos 2 y 12");
            return;
        }

        String letraUser = args[0];

        try {
            int n1 = Integer.parseInt(args[1]);
            int n2 = Integer.parseInt(args[2]);

            if (letraUser.equals("PAR") && (n1 % 2 != 0 || n2 % 2 != 0)) {
                System.out.println("no se permite esa operacion los numeros son impares");
            } else if (letraUser.equals("IMPAR") && (n1 % 2 == 0 || n2 % 2 == 0)) {
                System.out.println("no se permite esa operacion los numeros son impares");
            } else {
                parImpar(letraUser, n1, n2);
            }
        } catch (NumberFormatException e) {
            System.out.println("El n1 o n2, no son numeros validos");
        }
        */

        //WHILE
        /*
        int num = Integer.parseInt(args[0]);
        numeros(num);
        */

        //DO WHILE
        String user = args[0];
        caraCruz(user);
    }
}
