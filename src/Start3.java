import java.util.Scanner;

public class Start3 {
    public static void main(String[] args) {
//        Спросить у пользователя три целых числа a, b и c
//        В случае, если сумма a и b = с, вывести "a+b=c"
//        дополнил с "иначе"
        Scanner sc = new Scanner(System.in);
        System.out.println("введите целое число a");
        int a = sc.nextInt();
        System.out.println("введите целое число b");
        int b = sc.nextInt();
        System.out.println("введите целое число c");
        int c = sc.nextInt();
        if (a + b == c){
            System.out.println("a + b равно c");
        }else {
            System.out.println("a + b не равно c");
        }
    }
}
