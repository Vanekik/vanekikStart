public class Start6 {
    public static void main(String[] args) {
        // �������� �����
        int i = 9;
        switch (i) {
            case 1:
                System.out.println("�����������");
                break;
            case 2:
                System.out.println("�������");
                break;
            case 3:
                System.out.println("�����");
                break;
            case 4:
                System.out.println("�������");
                break;
            case 5:
                System.out.println("�������");
                break;
            case 6:
                System.out.println("�������");
                break;
            case 7:
                System.out.println("�����������");
                break;
            default:
                System.out.println("������ ������������ ���� ������");
        }
        // �������

        int[] intArrey = new int[]{5, 10, 15, 20, 25};
        System.out.println("intArray length: " + intArrey.length);
        System.out.println("������ ������� �������: " + intArrey[2]);
        System.out.println("������ ������� �� ���������: " + intArrey[0]);
        intArrey [0] = 100;
        System.out.println("������ ������� ����� ���������: " + intArrey[0]);

        // �����
        int q = 5;
        while (q <= 100){
            System.out.println(q);
            q = q +5;
        }

    }
}
