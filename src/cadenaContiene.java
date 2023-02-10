public class cadenaContiene {
    public static void main (String[] args){
        // Cadena de texto de ejemplo
        String test = "34000615\tBrdisv1ABR31014897m.g\tBrdisv1ABR31014897m\tBrdisv1ABR31014897m.p\tPF03007\tPTHR31650,PTHR31650:SF12\t\t\t\tGO:0045017,GO:0004144\t\t\t\tAT5G53390.1\t\tO-acyltransferase (WSD1-like) family protein\tLOC_Os01g56360.1\t\twax synthase, putative, expressed";
        // Subcadena de texto a buscar
        CharSequence seq = "wax synthase";

        boolean bool = test.contains(seq);
        System.out.println("¿Contiene '" + seq + "'?: " + bool);

    };
};
