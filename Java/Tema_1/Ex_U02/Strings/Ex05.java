package Java.Tema_1.Ex_U02.Strings;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce una palabra: ");
        String str1 = entrada.nextLine();
        System.out.println("Introduce otra palanbra: ");
        String str2 = entrada.nextLine();
        String strt = str1 + str2;
        int len = strt.length();
        System.out.println("La palabra es: " + strt + " y mide " + len);
    }
}
