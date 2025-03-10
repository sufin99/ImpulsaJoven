package Java.Tema_1.Ex_T02.Strings;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce una palabra o frase: ");
        String str = entrada.nextLine();
        int len = str.length();
        int count = 0;
        int i = 0;
        while (i < len)
        {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u')
                count++;
            i++;
        }
        System.out.println("La palabra o frase tiene " + count + " vocales.");
    }
}
