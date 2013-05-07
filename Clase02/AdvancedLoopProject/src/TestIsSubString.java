public class TestIsSubString {
    
    /*
     * Write a isSubString method that searches for a specific string within
     * another string; the method must return true if the former exists in the
     * latter string. Otherwise, the method return false.
     */
        
    
    public static void main(String[] args) {
        String text = "The cat in the hat.";
        
        System.out.println("isSubString(\"cat\", \"The cat in the hat.\") "
                + isSubString("cat", text));
        
        System.out.println("isSubString(\"bat\", \"The cat in the hat.\") "
                + isSubString("bat", text));
        
        System.out.println("isSubString(\"The\", \"The cat in the hat.\") "
                + isSubString("The", text));
        
        System.out.println("isSubString(\"hat.\", \"The cat in the hat.\") "
                + isSubString("hat.", text));
        
    }

    private static String isSubString(String cat, String text) {
        
        // Se Obtienen los tamaños de los string involucrados
        int tamStr = text.length();
        int tamCat = cat.length();
        // Se crea un objeto mas optimizado para el manejo de String.
        StringBuffer strAux = new StringBuffer(text);
        // Se recorre el string caracter por caracter
        for(int idx = 0; idx <= (tamStr-tamCat); idx++ ){
            // Se valida que la subcaddena sea igual al string q se esta buscando.
            if(strAux.substring(idx, idx + tamCat).equals(cat)){
                return "True";
            }
        }
        return "False";        
        //return text.indexOf(cat) == -1? "False": "True";
    }

}
