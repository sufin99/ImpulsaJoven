package Java.Tema_1.Ex_T03;

import java.util.Scanner;

public class Ex03 {
    public static int duplicar(int num)
    {
        int doble = num * 2;
        return (doble);
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        try {
            int num = entrada.nextInt();
            int doble = duplicar(num);
            System.out.println("Su doble es " + doble);
        } catch (Exception e) {
            System.out.println("Sólo números");
        }
        
    }
}
