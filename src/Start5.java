import java.util.Scanner;

public class Start5 {
    public static void main(String[] args) {
        System.out.println(" ����� ���� ����� ");
        System.out.println("������� ��� ����� �� �������");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        while (true) {
            if (a <= 0) {
                System.out.println("����� ������� ���������");
                break;
            }
        }
        int b = sc.nextInt();
        if (b <= 0) {
            System.out.println("����� ������� ���������");
        }
        System.out.println("����� ����� �����: " + (a + b));


    }
}
