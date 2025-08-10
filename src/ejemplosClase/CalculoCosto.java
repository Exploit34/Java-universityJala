package ejemplosClase;

public class CalculoCosto {
    public static void mensualidad(String nombre, String carrera) {
        switch (carrera) {
            case "ing.de sistemas":
                    int operacionSistemas = 6*350+350;
                    System.out.println("Hola " + nombre + " el costo de la carrera " + carrera + " es: " + operacionSistemas);
                break;
            case "derecho":
                    int operacionDerecho = 6*350+750;
                    System.out.println("Hola " + nombre + " el costo de la carrera " + carrera + " es: " + operacionDerecho);
                break;
            case "ing.mecanica":
                    int operacionMecanica = 6*310+700;
                    System.out.println("Hola " + nombre + " el costo de la carrera " + carrera + " es: " + operacionMecanica);
                break;
            case "ing.aeroespacial":
                    int operacionAeroespacial = 6*210+740;
                    System.out.println("Hola " + nombre + " el costo de la carrera " + carrera + " es: " + operacionAeroespacial);
                break;
            case "economia":
                    int operacionEconomia = 6*400+700;
                    System.out.println("Hola " + nombre + " el costo de la carrera " + carrera + " es: " + operacionEconomia);
                break;
            case "psicologia":
                    int operacionPsicologia = 6*760+620;
                    System.out.println("Hola " + nombre + " el costo de la carrera " + carrera + " es: " + operacionPsicologia);
                break;
            default:
                System.out.println("Error: no hay ninguna carrera con ese nombre");
        }
    }

    public static void main(String[] args) {
        String costo = """
                Carrera: ing.de sistemas | Matricula: 350 | Mensualidad: 640 |
                Carrera: Derecho | Matricula: 350 | Mensualidad: 750 |
                Carrera: ing.Mecanica | Matricula: 310 | Mensualidad: 700 |
                Carrera: ing.Aeroespacial | Matricula: 210 | Mensualidad: 740 |
                Carrera: Economia | Matricula: 400 | Mensualidad: 700 |
                Carrera: Psicologia | Matricula: 760 | Mensualidad: 620 |
                """;

        System.out.println(costo);

        String nombreIngresado = args[0];
        String carreraAInscribir = args[1];

        mensualidad(nombreIngresado, carreraAInscribir);
    }
}
