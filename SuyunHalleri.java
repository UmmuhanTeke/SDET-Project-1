package task4;

import java.util.Scanner;

public class SuyunHalleri {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int sicaklik;

        System.out.print("Su sıcaklığı giriniz = ");
        sicaklik=scanner.nextInt();
        if (sicaklik<0)
            System.out.println("Su katı haldedir");
        else if ( sicaklik<=100 ) {
            System.out.println("Su sıvı haldedir");
        }else{
            System.out.println("Su gaz haldedir");
        }
        scanner.close();


    }
}
