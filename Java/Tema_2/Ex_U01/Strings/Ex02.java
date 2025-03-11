package Java.Tema_2.Ex_U01.Strings;

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
