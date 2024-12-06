
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Qual o seu nome?");
        String name = scanner.nextLine();

        System.out.println("Qual ano você nasceu?");
        int bornIn = scanner.nextInt();

        scanner.close();

        int yearsold = 2025 - bornIn;
        System.out.println("Calculando.......");

        System.out.println("Olá, " + name + "!");
        System.out.println("Em 2025, você completará " +yearsold+ " anos.");

        }
    }
