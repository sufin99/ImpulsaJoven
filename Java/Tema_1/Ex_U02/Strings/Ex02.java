package Java.Tema_1.Ex_T02.Strings;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce una palabra: ");
        String str = entrada.nextLine();
        int len = str.length() - 1;
        while (0 <= len)
        {
            System.out.printf("%c", str.charAt(len));
            len--;
        }
        System.out.printf("\n");
    }
}
