import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] numbers1 = new int[3];
        numbers1[0] = 1;
        numbers1[1] = 2;
        numbers1[2] = 3;
        float[] numbers2 = {1.57f, 7.654f, 9.986f};
        int[] numbers3 = {43, 56, 76, 87};
    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] numbers1 = new int[3];
        numbers1[0] = 1;
        numbers1[1] = 2;
        numbers1[2] = 3;
        float[] numbers2 = {1.57f, 7.654f, 9.986f};
        int[] numbers3 = {43, 56, 76, 87};
        System.out.print(Arrays.toString(numbers1));
        System.out.println();
        System.out.print(Arrays.toString(numbers2));
        System.out.println();
        System.out.print(Arrays.toString(numbers3));
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] numbers1 = new int[3];
        numbers1[0] = 1;
        numbers1[1] = 2;
        numbers1[2] = 3;
        for (int i = numbers1.length - 1; i >= 0; i--) {
            System.out.print(numbers1[i] + ((i > 0) ? ", " : ""));
        }
        System.out.println();
        float[] numbers2 = {1.57f, 7.654f, 9.986f};
        for (int i = numbers2.length - 1; i >= 0; i--) {
            System.out.print(numbers2[i] + ((i > 0) ? ", " : ""));
        }
        System.out.println();
        int[] numbers3 = {43, 56, 76, 87};
        for (int i = numbers3.length - 1; i >= 0; i--) {
            System.out.print(numbers3[i] + ((i > 0) ? ", " : ""));
        }
        System.out.println();
    }
    public static void task4() {
        System.out.println("Задача 4");
        int[] numbers1 = new int[3];
        numbers1[0] = 1 + 1;
        numbers1[1] = 2;
        numbers1[2] = 3 + 1;
        for (int i = 0; i < numbers1.length; i++) {
                System.out.println((numbers1[i]));
            }
        }
    }


