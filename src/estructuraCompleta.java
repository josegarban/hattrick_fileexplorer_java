import java.io.File;

public class estructuraCompleta {
    static String nombreFichero = "";
    public static File carpeta = new File("genomas");

    public static void main(String[] args) {
        // Equivalente en Python: ruta_inicial = os.path.dirname(os.path.realpath(__file__))
        System.out.println("Leyendo estructura de la carpeta inicial "+ carpeta.getAbsolutePath());
        // Llamada a listaFicheros
        listaFicheros(carpeta);
    }

    public static void listaFicheros(final File carpeta) {
        // Equivalente en Python: función estructura_completa
        for (final File refFichero : carpeta.listFiles()) {
            if (refFichero.isDirectory()) {listaFicheros(refFichero);
            } else {
                if (refFichero.isFile()) {
                    /* ¿Contiene el nombre del fichero la subcadena '.txt'? */
                    nombreFichero = refFichero.getName();
                    boolean bool = nombreFichero.contains(".txt");
                    if (bool) {
                        System.out.println("Fichero: " + carpeta.getAbsolutePath()+ "\\" + nombreFichero);
                    }
                }
            }
        }
    }
}