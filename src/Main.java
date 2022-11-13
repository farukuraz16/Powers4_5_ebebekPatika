import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner dat = new Scanner(System.in);//get value from user
        System.out.print("number pls?=");
        int num = dat.nextInt();
        int sum = 0;//for total value of numbers that approved

        System.out.println("the numbers of power up to 4= ");
        for (int i = 4; i < num; i *= 4) {
            System.out.println(i);
        }
        System.out.println("\nthe numbers of power up to 5= ");
        for (int i = 5; i < num; i *= 5) {
            System.out.println(i);
        }

    }
}
