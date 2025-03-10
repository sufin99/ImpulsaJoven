package Java.Ex_T01;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        String str = entrada.nextLine();
        int len = str.length();
        int i = 0;
        while (i < len)
        {
            char c = str.charAt(i);
            if (c <= '0' || c >= '9')
            {
                System.out.println("Tiene que ser un número");
                System.exit(0);
            }
            i++;
        }
        System.out.println("Tiene " + len + " dígitos");
    }
}
