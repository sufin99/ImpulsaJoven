package Java.Tema_2.Ex_U01.Arrays;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce la cantidad de números a sumar: ");
        try {
            int n = entrada.nextInt();
            int i = 0;
            int total = 0;
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
                total += nums[i];
                i++;
            }
            System.out.println("La suma total es: " + total);
        } catch (Exception e) {
            System.out.println("Sólo números");
        }
        
    }
}
