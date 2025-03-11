package Java.Tema_3.Ex_U01;

class Perro {
    String nombre;
    int edad;
}

public class Ex01 {
    public static void main(String[] args) {
        Perro miPerro = new Perro();
        miPerro.nombre = "Sipollo";
        miPerro.edad = 96;
        System.out.println("Datos de mi perro");
        System.out.println("Nombre: " + miPerro.nombre);
        System.out.println("Edad: " + miPerro.edad);
    }
}
