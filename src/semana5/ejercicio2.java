package semana5;

public class ejercicio2 {
    // se creó la metodo palibromo que retorna un boolean
    public static boolean palindromo(String palabra) {
        // recorre la palabra y verifica si es palindroma
        for(int i = 0, j = palabra.length() - 1; i < j; i++, j--) {
            // se obtiene la posicion
            if(palabra.charAt(i) != palabra.charAt(j)) {
                // retorno si no es
                return false;
            }
        }
        //retorno si es
        return true;
    }

    //la funcion main
    public static void main(String[] args) {
        // palabra por argumento
        String palabraPalindroma = args[0];

        // llamado del metodo que resive el parametro
        boolean resultado = palindromo(palabraPalindroma);
        //imprime el resultado
        System.out.println(resultado);
    }
}
