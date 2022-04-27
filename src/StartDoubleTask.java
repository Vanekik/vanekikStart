import java.util.Arrays;

public class StartDoubleTask {
    public static void main(String[] args) {
        /*
Создать массив дробных чисел double длиной 5 с именем doubles
Вывести массив с помощью Arrays.toString()
Заполнить по очереди все элементы с помощью операции получения элемента по индексу
Вывести массив с помощью Arrays.toString()
Изменить первый элемент на 1.00001, последний элемент на -0.189
Вывести массив с помощью Arrays.toString()
 */

        double[] doubles = new double[5];
        System.out.println(Arrays.toString(doubles));
        System.out.println("первый элемент  doubles перед изменением: " + doubles[0]);
        doubles[0] = 1.1; // присваиваем значение первому элементу
        System.out.println("второй элемент  doubles перед изменением: " + doubles[1]);
        doubles[1] = 2.2; // присваиваем значение второму элементу
        System.out.println("третий элемент  doubles перед изменением: " + doubles[2]);
        doubles[2] = 3.3; // присваиваем значение третьему элементу
        System.out.println("четвертый элемент  doubles перед изменением: " + doubles[3]);
        doubles[3] = 4.4; // присваиваем значение четвертому элементу
        System.out.println("пятый элемент  doubles перед изменением: " + doubles[4]);
        doubles[4] = 5.5; // присваиваем значение пятому элементу
        System.out.println("первый элемент  doubles после изменения: " + doubles[0]);
        System.out.println("второй элемент  doubles после изменения: " + doubles[1]);
        System.out.println("третий элемент  doubles после изменения: " + doubles[2]);
        System.out.println("четвертый элемент  doubles после изменения: " + doubles[3]);
        System.out.println("пятый элемент  doubles после изменения: " + doubles[4]);
        System.out.println(Arrays.toString(doubles)); // весь массив целиком
        doubles[0] = 1.00001; // меняем значение первого элемента
        doubles[4] = -0.189;  // меняем значение пятого элемента
        System.out.println("массив doubles после всех изменений " + Arrays.toString(doubles));


    }
}
