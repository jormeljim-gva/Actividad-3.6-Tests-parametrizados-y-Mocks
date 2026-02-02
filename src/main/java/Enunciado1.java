public class Enunciado1 {
    public String asignaPrima(int numEmpleado, String nombreEmpleado, int mesesTrabajo, char directivo){
        if(numEmpleado < 1 || numEmpleado > 999){
            throw new IllegalArgumentException();
        }

        if(nombreEmpleado.isEmpty() || nombreEmpleado.length() > 10){
            throw new IllegalArgumentException();
        }

        if(mesesTrabajo < 0 || mesesTrabajo > 999){
            throw new IllegalArgumentException();
        }

        if(directivo != '+' && directivo != '-'){
            throw new IllegalArgumentException();
        }

        if(directivo == '+'){
            if(mesesTrabajo >= 12){
                return "P1";
            } else {
                return "P3";
            }
        } else {
            if(mesesTrabajo >= 12){
                return "P2";
            } else {
                return "P4";
            }
        }
    }
}
