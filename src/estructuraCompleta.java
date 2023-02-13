import java.io.File;

public class estructuraCompleta {
    static String nombreFichero = "";
    public static File carpeta = new File("genomas");

    public static void main(String[] args) throws Exception {
        // Equivalente en Python: ruta_inicial = os.path.dirname(os.path.realpath(__file__))
        System.out.println("Leyendo estructura de la carpeta inicial "+ carpeta.getAbsolutePath());
        // Llamada a listaFicherosTxt
        listaFicherosTxt(carpeta);
    }

    public static void listaFicherosTxt(final File carpeta) throws Exception {
        // Equivalente en Python: función estructura_completa
        for (final File refFichero : carpeta.listFiles()) {
            if (!refFichero.isFile()) {listaFicherosTxt(refFichero);
            } else {
                if (refFichero.isFile()) {
                    /* ¿Contiene el nombre del fichero la subcadena '.txt'? */
                    /* Llamado a otra clase es largo, pero se hace como práctica para invocar la clase cadenaContiene dentro de esta clase */
                    String nombreFichero = refFichero.getName();
                    CharSequence extension = ".txt";
                    boolean esTxt = cadenaContiene.cadenaContiene(nombreFichero, extension);
                    if (esTxt) {
                        String nombreFicheroCompleto = carpeta.getAbsolutePath()+ "\\" + nombreFichero;
                        String contenidoFichero = leerTxt.leerContenido(nombreFicheroCompleto);
                        CharSequence subcadena = "wax synthase";
                        boolean contieneSubcadena = cadenaContiene.cadenaContiene(contenidoFichero, subcadena);
                        if (contieneSubcadena){
                            System.out.println("Fichero: " + nombreFicheroCompleto);
                            //System.out.println(contenidoFichero);
                        }
                    }
                }
            }
        }
    }
}