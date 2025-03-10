package Java.Tema_1.Ex_T02.Arrays;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce la cantidad de números: ");
        try {
            int n = entrada.nextInt();
            int i = 0;
            int num = 0;
            int[] nums = new int[n];
            while (i < n)
            {
                System.out.println("Introduce un número: ");
                num = entrada.nextInt();
                nums[i] = num;
                i++;
            }
            int len = nums.length;
            i = 0;
            int max = 0;
            int min = nums[0];
            while (i < len)
            {
                if (max < nums[i])
                    max = nums[i];
                if (min > nums[i])
                    min = nums[i];
                i++;
            }
            System.out.println("El número más grande es: " + max);
            System.out.println("El número más pequeño es: " + min);
        } catch (Exception e) {
            System.out.println("Sólo números");
        }
    }
}
