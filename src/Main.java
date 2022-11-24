import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz swoje imię:");
        String name = scanner.nextLine();
        System.out.println("Twoje imię:");
            for (int i = 0; i < 5; i++){
            System.out.println(name);
        }
    }
}