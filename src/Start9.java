import java.util.Random;
import java.util.Scanner;

public class Start9 {
    public static void main(String[] args) {
//        узнать возраст, вводом года рождения и года который сейчас
        System.out.println("введите год Вашего рождения");
        int a;
        Scanner sc = new Scanner(System.in);
        while (true) {
            a = sc.nextInt();
            if (a > 1900) {
                break;
            } else {
                System.out.println("неверный ввод, попробуйте еще раз");
            }
        }
        System.out.println("какой сейчас год? ");
        int с;
        while (true) {
            с = sc.nextInt();
            if (с == 2022) {
                break;
            } else {
                System.out.println("неверный ввод, попробуйте еще раз");
            }
        }
        System.out.println("ваш возраст: " + (с - a));
    }
}
