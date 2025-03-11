package Java.Tema_2.Ex_U01.Arrays;

import java.util.Scanner;

public class Ex05 {
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
            int count = 0;
            System.out.println("Introduce el número a encontrar: ");
            num = entrada.nextInt();
            while (i < len)
            {
                if (num == nums[i])
                    count++;
                i++;
            }
            System.out.println("El número: " + num + " fue encontrado " + count + " veces");
        } catch (Exception e) {
            System.out.println("Sólo números");
        }
    }
}
