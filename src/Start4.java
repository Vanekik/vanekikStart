import java.util.Scanner;

public class Start4 {
    public static void main(String[] args) {
        short x = 2;
        int y = 3;
        long z = 6;
        System.out.println("����� �����: " + (x + y + z));
        System.out.println("������������ �����: " + x * y * z);
        System.out.println("��������� ���������: " + ((x + y) == z));
        System.out.println("������� �����: ");
        Scanner sc = new Scanner(System.in);
        int e = sc.nextInt();
        if (e > 0){
            System.out.println("������������� �����");
        }
        if (e < 0){
            System.out.println("������������� �����");
        }
        if (e == 0){
            System.out.println("����");
        }

    }
}
