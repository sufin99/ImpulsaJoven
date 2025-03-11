package Java.Tema_3.Ex_U01;

class Persona {
    public String nombre;
    private int edad;
    protected String ciudad;
}

public class Ex02 {
    public static void main(String[] args) {
        Persona p = new Persona();
        p.nombre = "Eustaquio";
        p.ciudad = "Lituania";
    
        System.out.println("Nombre: " + p.nombre);
        System.out.println("Ciudad: " + p.ciudad);
    }
}
