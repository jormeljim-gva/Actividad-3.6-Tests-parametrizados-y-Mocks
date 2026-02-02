public class Ejemplo2 {
    public String esAdmitido(String apto){
        if(apto.equals("apto")){
            return "SI";
        } else if (apto.equals("no apto")){
            return "NO";
        } else {
            throw new IllegalArgumentException();
        }
    }
}
