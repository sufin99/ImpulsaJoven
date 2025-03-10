package Java.Ex_T01;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int num = entrada.nextInt();
        int count = 0;
        int i = 1;
        while (i <= num)
        {
            if (num % i == 0)
                count++;
            i++;
        }
        if (count == 2)
            System.out.println("Es primo");
        else
            System.out.println("No es primo");
    }
}
