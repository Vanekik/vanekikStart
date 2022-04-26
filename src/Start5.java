import java.util.Scanner;

public class Start5 {
    public static void main(String[] args) {
        System.out.println(" сумма двух чисел ");
        System.out.println("введите два числа по очереди");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        while (true) {
            if (a <= 0) {
                System.out.println("число слишком маленькое");
                break;
            }
        }
        int b = sc.nextInt();
        if (b <= 0) {
            System.out.println("число слишком маленькое");
        }
        System.out.println("сумма чисел равна: " + (a + b));


    }
}
