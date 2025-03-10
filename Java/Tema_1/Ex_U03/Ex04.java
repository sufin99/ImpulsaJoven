package Java.Tema_1.Ex_T03;

import java.util.Scanner;

public class Ex04 {
    public static boolean esPar(int num) {
        if (num % 2 == 0)
            return(true);
        else
            return (false);
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        try {
            int num = entrada.nextInt();
            boolean par = esPar(num);
            if (par)
                System.out.println("Es par");
            else
                System.out.println("Es impar");
        } catch (Exception e) {
            System.out.println("Sólo números");
        }
    }
}
