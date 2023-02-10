import java.io.File;
import java.util.Scanner;

public class leerTxt {
    static String leerContenido (String ubicacionAbsolutaFichero) throws Exception {
        File fichero = new File (ubicacionAbsolutaFichero);
        System.out.println("Leyendo fichero: " + fichero);
        String contenido = new Scanner(fichero).useDelimiter("\\Z").next();
        return contenido;
    }
    public static void main (String[] args) throws Exception {
        // Comportamiento por defecto: leerse a sí mismo como fichero de texto
        String ubicacionAbsolutaFichero = "src\\leerTxt.java";
        String contenido = leerContenido(ubicacionAbsolutaFichero);
        System.out.println(contenido);
    };
}

