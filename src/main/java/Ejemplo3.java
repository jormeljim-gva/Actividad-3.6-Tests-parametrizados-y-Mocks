public class Ejemplo3 {
    public int calcula(int numero, int numero2, char operador){
        if(numero < 1 || numero > 999){
            throw new IllegalArgumentException();
        }

        if(numero2 < 1 || numero2 > 999){
            throw new IllegalArgumentException();
        }

        switch (operador){
            case '+':
                return numero + numero2;
            case '-':
                return numero - numero2;
            case '/':
                return numero / numero2;
            case '*':
                return numero * numero2;
            default:
                throw new IllegalArgumentException();
        }
    }
}
