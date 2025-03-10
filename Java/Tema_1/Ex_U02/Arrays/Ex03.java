package Java.Tema_1.Ex_U02.Arrays;

import java.util.Scanner;

public class Ex03 {
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
            System.out.println("Introduce el número a encontrar: ");
            int x = entrada.nextInt();
            while (i < len)
            {
                if (x == nums[i])
                {
                    System.out.println("El número fue encontrado.");
                    System.exit(-1);
                }
                i++;
            }
            System.out.println("El número no fue encontrado.");
        } catch (Exception e) {
            System.out.println("Sólo números");
        }
    }
}
