package Java.Ex_T01;
import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un número para su factorial: ");
        int num = entrada.nextInt();
        System.out.println("Has intoducido " + num + "!");
        int total = 1;
        while (num > 0)
        {
            total *= num;
            num--;
        }
        System.out.println("El total es: " + total);
    }
}
