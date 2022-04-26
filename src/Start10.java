import java.util.Scanner;

public class Start10 {
    public static void main(String[] args) {
//        int j = 100;
//        System.out.println(j);
//        j = ++j;
//        System.out.println(j);
//        j++;
//        System.out.println(j);
//        ++j;
//        System.out.println(j);
//        int j = 1;
//        int sum = 0;

//            sum += k;
//        for (int k = 30; k >= 2; k -= 2) {
//            System.out.println(k);
//        }
//        for (int k = 0; k <= 10; k++) {
//            System.out.println("привет мир");
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("введите число, на сколько лет вы хотите рассчитать прибыль");
//        int n = scanner.nextInt();

//        for (int k = 0; k < n; k++) {
//            System.out.println("Цикл работает " + (k + 1) + " раз");

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double balance = 100000;
        double mnozh = 1 + 11 / 100.0;
        for(int k = 0; k < n ; k++)
        {
            balance *= mnozh;
            System.out.println("После " + (k + 1) + " лет: " + balance + " рублей");
        }
        System.out.println(balance);
        System.out.println(100000*Math.pow(1.11,n));
    }
}

