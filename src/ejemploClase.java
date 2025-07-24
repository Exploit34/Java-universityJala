public class ejemploClase {
    public static void semana(int dia) {
        if (dia == 1) {
            System.out.println("lunes");
        } else if( dia == 2){
            System.out.println("Martes");
        } else if( dia == 3){
            System.out.println("Miercoles");
        } else if(dia == 4){
            System.out.println("Jueves");
        } else if(dia == 5){
            System.out.println("Viernes");
        } else if(dia == 6){
            System.out.println("Sabado");
        } else if(dia == 7){
            System.out.println("Domingo");
        } else if ( dia < 0 || dia > 7) {
            System.out.println("solo se puede numeros del 1 al 7");
        }
    }

    public static void numeros(int num){
        if (num == 0){
            System.out.println("es cero");
        } else if (num > 0 && num < 1000) {
            System.out.println("Mayor a 0 pero menor a 1000");
        } else if (num >= 1000){
            System.out.println("Es mayor o igual a 1000");
        } else if (num < 0 && num >= -1000){
            System.out.println("negativos menor a cero y mayo a -1000");
        } else if (num <= -1000){
            System.out.println("Super negativo");
        }
    }

    public static void año(int mes) {
        switch (mes) {
            case 1:
                System.out.println("Enero");
                break;
            case 2:
                System.out.println("Febrero");
                break;
            case 3:
                System.out.println("Marzo");
                break;
            case 4:
                System.out.println("Abril");
                break;
            case 5:
                System.out.println("Mayo");
                break;
            case 6:
                System.out.println("Junio");
                break;
            case 7:
                System.out.println("Julio");
                break;
            case 8:
                System.out.println("Agosto");
                break;
            case 9:
                System.out.println("Septiembre");
                break;
            case 10:
                System.out.println("Octubre");
                break;
            case 11:
                System.out.println("Noviembre");
                break;
            case 12:
                System.out.println("Diciembre");
                break;
            default:
                System.out.println("Solo se permiten numeros del uno al 12");
        }
    }

    public static void terniario(int num1, int num2) {
        int ter = num1 < num2 ? num1 : num2;

        System.out.println("El numero menor es: " + ter);
    }

    public static void triangulo(int lado1, int lado2, int lado3) {
        if (lado1 == lado2 && lado2 == lado3) {
            System.out.println("Es equilatero");
        } else if ((lado1 == lado2 && lado1 != lado3) ||
                (lado2 == lado3 && lado2 != lado1) ||
                (lado3 == lado1 && lado3 != lado2)) {
            System.out.println("Es isosceles");
        } else if (lado1 != lado2 && lado2 != lado3 && lado1 != lado3) {
            System.out.println("Es escaleno");
        } else {
            System.out.println("No es un triángulo válido");
        }
    }

    public static int encontrarMenor(int[] num) {
        int menor = num[0];
        for (int i = 1; i < num.length; i++) {
            if (num[i] < menor) {
                menor = num[i];
            }
        }
        return menor;
    }

    public static int sumaNumeros(int[] num) {
        int suma = num[0];

        for (int i = 1; i < num.length; i++) {
            suma += num[i];
        }

        return suma;
    }

    public static void main(String[] args) {

        //semana, numeros, año
        if (args.length > 0) {
            int num = Integer.parseInt(args[0]);

            semana(num);
            numeros(num);
            año(num);
        } else {
            System.out.println("Solo se permite numeros");
        }

        //ternario
        if (args.length > 2) {
            int num1 = Integer.parseInt(args[1]);
            int num2 = Integer.parseInt(args[2]);

            terniario(num1, num2);
        } else {
            System.out.println("Solo se permite numeros");
        }

        //triangulo
        if (args.length > 3) {
            int lengt1 = Integer.parseInt(args[0]);
            int lengt2 = Integer.parseInt(args[1]);
            int lengt3 = Integer.parseInt(args[2]);

            triangulo(lengt1, lengt2, lengt3);
        }

        //for anidados encontrar el menor
        if (args.length != 10) {
            System.out.println("Por favor ingresa exactamente 10 números enteros como argumentos.");
            return;
        }

        int[] numeros = new int[args.length];
        int count = 0;

        while(count < args.length){

            try {
                numeros[count] = Integer.parseInt(args[count]);
            } catch (NumberFormatException e) {
                System.out.println("El argumento '" + args[count] + "' no es un número entero válido.");
                return;
            }
            count++;
        }

        int menor = encontrarMenor(numeros);
        System.out.println("El numero menor entre todos es: " + menor);

        //Suma de numero
        if (args.length != 10) {
            System.out.println("Por favor ingresa exactamente 10 números enteros como argumentos.");
            return;
        }

        int[] numerosSuma = new int[args.length];
        int count1 = 0;

        while(count1 < args.length){

            try {
                numeros[count1] = Integer.parseInt(args[count1]);
            } catch (NumberFormatException e) {
                System.out.println("El argumento '" + args[count1] + "' no es un número entero válido.");
                return;
            }
            count1++;
        }

        int suma = sumaNumeros(numerosSuma);
        System.out.println("La suma de los numeros es: " + suma);
    }
}
