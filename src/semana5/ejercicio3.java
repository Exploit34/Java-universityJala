package semana5;

public class ejercicio3 {
    //metodo que lleva un parametro entrada
    public static void separacionCheck(String entrada) {
        //separacion con # lo cual se creó un array
        String[] filas = entrada.split("#", -1); // separa las filas

        // for each que recorre la entrada
        for (String fila : filas) {
            for (int i = 0; i < fila.length(); i++) {
                // la posicion del objecto
                char c = fila.charAt(i);
                if (c == 'X') {
                    System.out.print("1\t");
                } else if (c == 'Y') {
                    System.out.print("2\t");
                } else if (c == 'Z') {
                    System.out.print("0\t");
                }
            }
            System.out.println(); // salto de línea después de cada fila
        }
    }

    public static void main(String[] args) {
        // entrada de parametro para enviar al metodo
        String separador = "XYX#YYZ#ZZY";
        //metodo con el parametro
        separacionCheck(separador);
    }
}
