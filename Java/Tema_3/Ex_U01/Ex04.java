package Java.Tema_3.Ex_U01;

class Contador {
    public static int cuenta = 0;
    public static void incrementar() {
        cuenta++;
    }
}

public class Ex04 {
    public static void main(String[] args) {
        Contador.incrementar();
        Contador.incrementar();
        Contador.incrementar();
        System.out.println("Cuenta: " + Contador.cuenta);
    }
}
