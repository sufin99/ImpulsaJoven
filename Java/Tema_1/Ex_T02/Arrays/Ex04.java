package Java.Tema_1.Ex_T02.Arrays;

import java.util.Scanner;

public class Ex04 {
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
            while (i < len)
            {
                System.out.printf("%d ", nums[i]);
                i++;
            }
            System.out.printf("\n");
            i--;
            while (i >= 0)
            {
                System.out.printf("%d ", nums[i]);
                i--;
            }
            System.out.printf("\n");
        } catch (Exception e) {
            System.out.println("Sólo números");
        }
    }
}
