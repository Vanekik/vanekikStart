public class Start6 {
    public static void main(String[] args) {
        // оператор свитч
        int i = 9;
        switch (i) {
            case 1:
                System.out.println("понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суббота");
                break;
            case 7:
                System.out.println("Воскресение");
                break;
            default:
                System.out.println("Указан неправильный день недели");
        }
        // массивы

        int[] intArrey = new int[]{5, 10, 15, 20, 25};
        System.out.println("intArray length: " + intArrey.length);
        System.out.println("третий элемент массива: " + intArrey[2]);
        System.out.println("первый элемент до изменения: " + intArrey[0]);
        intArrey [0] = 100;
        System.out.println("Первый элемент после изменения: " + intArrey[0]);

        // циклы
        int q = 5;
        while (q <= 100){
            System.out.println(q);
            q = q +5;
        }

    }
}
