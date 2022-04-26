import java.util.Scanner;

public class Start8 {
    public static void main(String[] args) {
        /*
        Спросить у пользователя три целых числа a,b и c
        Вывести "Да", если существует треугольник с такими сторонами
        Вывести "Нет", если не существует
        (треугольник существует если сумма любых двух сторон больше третьей стороны)
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("проверка на возможный треугольник");
        System.out.println("введите три целых числа");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (((a + b > c) && (a + c > b)) && (b + c > a)){
            System.out.println("Да");
        }else {
            System.out.println("Нет");
        }
    }
}
