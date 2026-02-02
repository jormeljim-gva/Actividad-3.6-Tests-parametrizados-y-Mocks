public class CalculadoraService {
    private Calculadora calculadora;

    public CalculadoraService(Calculadora calculadora) {
        this.calculadora = calculadora;
    }

    public int dobleDeLaSuma(int a, int b) {
        int suma = calculadora.sumar(a, b);
        return calculadora.multiplicar(suma, 2);
    }

    public int restaAlCuadrado(int a, int b) {
        int resta = calculadora.restar(a, b);
        return calculadora.multiplicar(resta, resta);
    }

    public int sumaYDivide(int a, int b, int divisor) {
        int suma = calculadora.sumar(a, b);
        return calculadora.dividir(suma, divisor);
    }
}