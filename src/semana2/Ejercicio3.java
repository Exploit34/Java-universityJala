package semana2;

public class Ejercicio3 {

    public static int promedioNumeros(int a, int b, int c) {
        int suma = a + b + c;
        return suma / 3;
    }

    public static void main(String[] args) {
        if (args.length >= 3) {
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);
            int num3 = Integer.parseInt(args[2]);

            int resultado = promedioNumeros(num1, num2, num3);

            System.out.println(resultado);
        } else {
            System.out.println("Solo numeros son permitidos");
        }
    }
}
