public class cadenaContiene {

    static boolean cadenaContiene(String cadena, CharSequence subcadena) {
        boolean bool = cadena.contains(subcadena);

        System.out.println("¿Contiene '" + subcadena + "'?: " + bool);
        return bool;
    }

    public static void main (String[] args){
        // Cadena de texto de ejemplo
        String cadena = "34000615\tBrdisv1ABR31014897m.g\tBrdisv1ABR31014897m\tBrdisv1ABR31014897m.p\tPF03007\tPTHR31650,PTHR31650:SF12\t\t\t\tGO:0045017,GO:0004144\t\t\t\tAT5G53390.1\t\tO-acyltransferase (WSD1-like) family protein\tLOC_Os01g56360.1\t\twax synthase, putative, expressed";
        // Subcadena de texto a buscar
        CharSequence subcadena = "wax synthase";
        // Comparar
        cadenaContiene(cadena, subcadena);
    };
};
