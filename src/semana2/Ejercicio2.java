package semana2;

public class Ejercicio2 {
    public static int multiplicacion(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        if (args.length >= 2) {
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);

            int resultado = multiplicacion(num1, num2);
            System.out.println(resultado);
        } else {
            System.out.println("Solo debes ingresar numeros");
        }
    }
}
