package Java.Tema_1.Ex_U01;
import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el límite de suma: ");
        int n = entrada.nextInt();
        int i = 0;
        int total = 0;
        while (i <= n)
        {
            total += i;
            i++;
        }
        System.out.println("La suma total es: " + total);
    }
}
