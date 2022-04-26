import java.util.Scanner;
/*
Спросить у пользователя одно целое число типа int
С помощью цикла while вывести столько же раз фразу "Цикл while"
 */

public class Start2 {
    public static void main(String[] args) {
        System.out.println("введите число");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n > 0) {
            System.out.println("Цикл while");
            n -= 1;
        }
    }
}