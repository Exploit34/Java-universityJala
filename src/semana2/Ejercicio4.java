package semana2;

public class Ejercicio4 {

    public static void circulo(float radio) {
            float area = 3.1415f * (radio * radio);
            float pedimetro = 2 * 3.1415f * radio;

            System.out.println("El area es: " + area + " y el perimetro es: " + pedimetro);
    }

    public static void main(String[] args) {
        if (args.length > 0) {
            float num1 = Float.parseFloat(args[0]);

            circulo(num1);
        } else {
            System.out.println("Solo se permiten numeros decimales");
        }
    }
}
