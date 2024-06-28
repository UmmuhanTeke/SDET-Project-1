package task2;

import java.util.Scanner;

public class Ucgen {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int kenar1;
        int kenar2;
        int kenar3;

        System.out.print("1.Kenar Giriniz=");
        kenar1 = scanner.nextInt();
        System.out.print("2.kenarı griniz=");
        kenar2 = scanner.nextInt();
        System.out.print("3.kenarı giriniz=");
        kenar3 = scanner.nextInt();

        if (kenar1 == kenar2 && kenar1 == kenar3)
            System.out.println("Eşkanar Üçgen");
        else if (kenar1 == kenar2 || kenar1 == kenar3 || kenar3 == kenar2)
            System.out.println("İkizkenar Üçgen");

        else System.out.println("Çeşitkenar Üçgen");

        scanner.close();


    }
}

