import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
//        ������� 2 �������, ���� � ������ �������, ������ � ��������
//        � ������� �� �� �����
        int[] ints = new int[]{1,2,3,4,5};
        double[] doubles = new double[]{1.1,2.2,3.3};
        System.out.println("ints length " + ints.length);
        System.out.println("doubles length " + doubles.length);
//        System.out.println(ints);
//        System.out.println(doubles);
        System.out.println("������ ints " + Arrays.toString(ints));
        System.out.println("������ doubles " + Arrays.toString(doubles));
        System.out.println("������ ������� � ������� doubles " + doubles[1]);

        ints[0] = 100;
        ints[1] = 200;
        ints[2] = 300;
        ints[3] = 400;
        ints[4] = 500;
        System.out.println("������ ����� ��������� " + Arrays.toString(ints));
        System.out.println("������ ������� � ������� ints " + ints[2]);

    }
}
