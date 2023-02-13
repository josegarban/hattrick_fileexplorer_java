import java.io.File;
import java.util.Scanner;

public class leerTxt {
    static String leerContenido (String ubicacionAbsolutaFichero) throws Exception {
        File fichero = new File (ubicacionAbsolutaFichero);
        //System.out.println("Leyendo fichero: " + fichero);
        String contenido = new Scanner(fichero).useDelimiter("\\Z").next();
        return contenido;
    }
    public static void main (String[] args) throws Exception {
        // Comportamiento por defecto: leerse a sí mismo como fichero de texto
        //String ubicacionAbsolutaFichero = "src\\leerTxt.java";
        String ubicacionAbsolutaFichero = "C:\\Users\\José\\eclipse-workspace\\hattrick\\hattrick_fileexplorer_java\\genomas\\BdistachyonABR6\\v1.ABR6\\annotation\\BdistachyonABR6_336_v1.ABR6_r.1.annotation_info.txt";
        //System.out.println(ubicacionAbsolutaFichero);
        leerContenido(ubicacionAbsolutaFichero);
    };
}

