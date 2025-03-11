package Java.Tema_3.Ex_U01;

class Calculadora {
    public int sumar(int a, int b) {
        return (a + b);
    }

    private int restar(int a, int b) {
        return (a - b);
    }

    protected int multiplicar(int a, int b) {
        return (a * b);
    }
}

public class Ex03 {
    public static void main(String[] args) {
        Calculadora calculo = new Calculadora();
        System.out.println("Suma: " + calculo.sumar(8, 3));
        System.out.println("Multiplicar: " + calculo.multiplicar(8, 3));
    }
}
