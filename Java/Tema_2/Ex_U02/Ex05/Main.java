package Java.Tema_2.Ex_U02.Ex05;
import java.util.Scanner;

import Java.Tema_2.Ex_U02.Ex05.*;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        try {
            System.out.println("Introduce un número: ");
            int num1 = entrada.nextInt();
            System.out.println("Introduce otro número: ");
            int num2 = entrada.nextInt();
            Saludador.Saludar();
            int total = Calculadora.Suma(num1, num2);
            System.out.println("La suma de tus números es de: " + total);
        } catch (Exception e) {
            System.out.println("Sólo números");
        }
        
    }
}
