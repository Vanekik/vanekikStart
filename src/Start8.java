import java.util.Scanner;

public class Start8 {
    public static void main(String[] args) {
        /*
        �������� � ������������ ��� ����� ����� a,b � c
        ������� "��", ���� ���������� ����������� � ������ ���������
        ������� "���", ���� �� ����������
        (����������� ���������� ���� ����� ����� ���� ������ ������ ������� �������)
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("�������� �� ��������� �����������");
        System.out.println("������� ��� ����� �����");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (((a + b > c) && (a + c > b)) && (b + c > a)){
            System.out.println("��");
        }else {
            System.out.println("���");
        }
    }
}
