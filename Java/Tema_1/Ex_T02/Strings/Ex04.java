package Java.Tema_1.Ex_T02.Strings;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce una palabra o frase: ");
        String str = entrada.nextLine();
        System.out.println("Introduce la letra a reemplazar: ");
        String letter1 = entrada.nextLine();
        int len = letter1.length();
        System.out.println("Introduce la letra sustituta: ");
        String letter2 = entrada.nextLine();
        int len2 = letter2.length();
        if (len != 1 || len2 != 1)
        {
            System.out.println("Introuduce sólo una letra");
            System.exit(-1);
        }
        int i = 0;
        int len3 = str.length() - 1;
        char c = letter1.charAt(0);
        char d = letter2.charAt(0);
        while (i <= len3)
        {
            if (str.charAt(i) == c)
                System.out.printf("%c", d);
            else
                System.out.printf("%c", str.charAt(i));
            i++;
            
        }
        System.out.printf("\n");
    }
}
