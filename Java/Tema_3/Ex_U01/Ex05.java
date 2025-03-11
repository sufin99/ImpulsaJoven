package Java.Tema_3.Ex_U01;

abstract class Animal {
    public abstract void hacerSonido();
}

class Gato extends Animal {
    public void hacerSonido() {
        System.out.println("Miau");
    }
}

class Perro extends Animal {
    public void hacerSonido() {
        System.out.println("Guau");
    }
}

public class Ex05 {
    public static void main(String[] args) {
        Animal miGato = new Gato();
        Animal miPerro = new Perro();
    
        miGato.hacerSonido();
        miPerro.hacerSonido();
    }
}
