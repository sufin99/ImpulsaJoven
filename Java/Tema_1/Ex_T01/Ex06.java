package Java.Ex_T01;
import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int num = entrada.nextInt();
        int mult = 1;
        while (mult <= 10)
        {
            int total = num * mult;
            System.out.println(num + " x " + mult + " = " + total);
            mult++;
        }
    }
}
