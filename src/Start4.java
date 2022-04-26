import java.util.Scanner;

public class Start4 {
    public static void main(String[] args) {
        short x = 2;
        int y = 3;
        long z = 6;
        System.out.println("сумма чисел: " + (x + y + z));
        System.out.println("произведение чисел: " + x * y * z);
        System.out.println("результат равенства: " + ((x + y) == z));
        System.out.println("введите число: ");
        Scanner sc = new Scanner(System.in);
        int e = sc.nextInt();
        if (e > 0){
            System.out.println("положительное число");
        }
        if (e < 0){
            System.out.println("отрицательное число");
        }
        if (e == 0){
            System.out.println("ноль");
        }

    }
}
