package Java.Tema_1.Ex_U01;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int num = entrada.nextInt();
        if (num % 2 == 0)
            System.out.println("Es par");
        else
            System.out.println("Es impar");
    }
}
