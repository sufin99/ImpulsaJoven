package Java.Ex_T01;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner entrada1 = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int num1 = entrada1.nextInt();
        System.out.println("Introduce un número: ");
        int num2 = entrada1.nextInt();
        System.out.println("Introduce un número: ");
        int num3 = entrada1.nextInt();
        if (num1 > num2 && num1 > num3)
            System.out.println("El número más grande es: " + num1);
        else if (num2 > num1 && num2 > num3)
            System.out.println("El número más grande es: " + num2);
        else if (num3 > num1 && num3 > num2)
            System.out.println("El número más grande es: " + num3);
    }
}
