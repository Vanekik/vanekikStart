import java.util.Scanner;
/*
�������� � ������������ ���� ����� ����� ���� int
� ������� ����� while ������� ������� �� ��� ����� "���� while"
 */

public class Start2 {
    public static void main(String[] args) {
        System.out.println("������� �����");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n > 0) {
            System.out.println("���� while");
            n -= 1;
        }
    }
}