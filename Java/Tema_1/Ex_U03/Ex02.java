package Java.Tema_1.Ex_U03;

import java.util.Scanner;

public class Ex02 {
    public static void imprimirDatos(String name, int year)
    {
        System.out.println("Hola soy " + name + " y tengo " + year + " años.");
    }

    public static void main(String[] args) {
        try {
            Scanner entrada = new Scanner(System.in);
            System.out.println("¿Cómo te llamas?: ");
            String str = entrada.nextLine();
            System.out.println("¿Cuántos años tienes?: ");
            int num = entrada.nextInt();
            imprimirDatos(str, num);
        } catch (Exception e) {
            System.out.println("La edad tiene que ser un número");
        }
    }
}
