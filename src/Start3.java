import java.util.Scanner;

public class Start3 {
    public static void main(String[] args) {
//        �������� � ������������ ��� ����� ����� a, b � c
//        � ������, ���� ����� a � b = �, ������� "a+b=c"
//        �������� � "�����"
        Scanner sc = new Scanner(System.in);
        System.out.println("������� ����� ����� a");
        int a = sc.nextInt();
        System.out.println("������� ����� ����� b");
        int b = sc.nextInt();
        System.out.println("������� ����� ����� c");
        int c = sc.nextInt();
        if (a + b == c){
            System.out.println("a + b ����� c");
        }else {
            System.out.println("a + b �� ����� c");
        }
    }
}
