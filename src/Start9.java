import java.util.Random;
import java.util.Scanner;

public class Start9 {
    public static void main(String[] args) {
//        ������ �������, ������ ���� �������� � ���� ������� ������
        System.out.println("������� ��� ������ ��������");
        int a;
        Scanner sc = new Scanner(System.in);
        while (true) {
            a = sc.nextInt();
            if (a > 1900) {
                break;
            } else {
                System.out.println("�������� ����, ���������� ��� ���");
            }
        }
        System.out.println("����� ������ ���? ");
        int �;
        while (true) {
            � = sc.nextInt();
            if (� == 2022) {
                break;
            } else {
                System.out.println("�������� ����, ���������� ��� ���");
            }
        }
        System.out.println("��� �������: " + (� - a));
    }
}
