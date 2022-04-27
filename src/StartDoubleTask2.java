import java.util.Arrays;
import java.util.Scanner;

public class StartDoubleTask2 {
    public static void main(String[] args) {
        /*
Спросить у пользователя целое положительное число
Создать целочисленный массив такой же длины
С помощью цикла (for или while) заполнить этот массив по правилу:
Каждый элемент равен его индексу, умноженному на 11
После заполнения, вывести массив
Например, если пользователь введет 6, то должен получиться массив [0, 11, 22, 33, 44, 55]
 */
        Scanner sc = new Scanner(System.in);
        System.out.println("введите целое положительное число");
        int i = sc.nextInt();
        System.out.println(i);
        int[] ints = new int[i];
        System.out.println(Arrays.toString(ints));
        for (int index = 0; index < ints.length; index++) {
            ints[index] = index * 11;}
        System.out.println(Arrays.toString(ints));
    }
}
