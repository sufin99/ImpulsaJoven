package Java.Tema_1.Ex_T02.Strings;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce una palabra: ");
        String str = entrada.nextLine();
        int len = str.length() - 1;
        int i = 0;
        int count = 0;
        while (i < len)
        {
            if (str.charAt(i) == str.charAt(len))
                count++;
            i++;
            len--;
        }
        int len2 = str.length();
        if ((len2 / 2) == count)
            System.out.println("Es palíndromo");
        else
            System.out.println("No es palíndromo");
    }
}
