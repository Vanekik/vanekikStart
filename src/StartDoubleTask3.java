import java.util.Arrays;
import java.util.Scanner;

public class StartDoubleTask3 {
    public static void main(String[] args) {
        /*
        Спросить у пользователя целое положительное число m
        Создать целочисленный массив длины m
        С помощью цикла (for или while) заполнить этот массив из ввода пользователя,
        т.е. спросить у пользователя целое число m раз и записать эти числа по очереди в массив
        Вывести массив с помощью Arrays.toString()
        Задание со "звёздочкой":
        рассчитать сумму элементов в массиве и вывести её
 */
        Scanner sc = new Scanner(System.in);
        System.out.println("введите целое положительное число");
        int m = sc.nextInt();
        int[] mas = new int[m];
        System.out.println(Arrays.toString(mas));
        for (int index = 0; index < mas.length; index++) {
            System.out.println("введите целое число");
            int i = sc.nextInt();
            mas[index] = i;
        }
        System.out.println("массив mas после внесенных изменений" + Arrays.toString(mas));
        int summa = 0;
        for (int i = 0; i < mas.length; i++) {
            summa = summa + mas[i];
        }
        System.out.println("сумма всех элементов в массиве: " +summa);
    }
}
