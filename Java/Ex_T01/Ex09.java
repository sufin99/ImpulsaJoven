package Java.Ex_T01;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce V o F: ");
        String str = entrada.nextLine();
        int len = str.length();
        if (len != 1)
        {
            System.out.println("Sólo V o F permitido");
            System.exit(0);
        }
        char c = str.charAt(0);
        if (c == 'V')
            System.out.println("Es Verdadero");
        else if (c == 'F')
            System.out.println("Es Falso");
        else
            System.out.println("Sólo V o F permitido");
    }
}
