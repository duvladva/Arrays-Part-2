import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        System.out.println();
        task2();
        System.out.println();
        task3();
        System.out.println();
        task4();
    }

    public static int[] generateRandomArray() {// Объявить метод «сгенерироватьМассив»
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        System.out.println("Задача 1. Напишите программу для вычисления суммы всех трат за месяц");
        int[] arr = generateRandomArray();
        System.out.println("Модель бухгалтерской книги - массив случайных чисел: ");
        System.out.println(Arrays.toString(arr));
        int totalCosts = 0;
        for (int i = 0; i < arr.length; i++) {
            totalCosts+=arr[i];}
        System.out.println("Сумма всех трат за месяц равна: "+totalCosts);
        }
    public static void task2() {
        System.out.println("Задача 2. Найти минимальную и максимальную трату за день.");
        int[] arr = generateRandomArray();
        System.out.println("Модель бухгалтерской книги - массив случайных чисел: ");
        System.out.println(Arrays.toString(arr));
        int minCost = 200_000;
        int maxCost = 100_000;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<minCost){minCost=arr[i];}
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>maxCost){maxCost=arr[i];}
        }
        System.out.println("Минимальная сумма трат за день составила "+minCost+" рублей");
        System.out.println("Максимальная сумма трат за день составила "+maxCost+" рублей");
    }
    public static void task3() {
        System.out.println("Задача 3. Вычислить какую в среднем сумму за день компания тратила в течение 30 дней.");
        int[] arr = generateRandomArray();
        System.out.println("Модель бухгалтерской книги - массив случайных чисел: ");
        System.out.println(Arrays.toString(arr));
        double totalCosts = 0;
        for (int i = 0; i < arr.length; i++) {
            totalCosts+=arr[i];}
        double averageCostAtDay = totalCosts / arr.length;
        System.out.println("Средняя сумма трат за месяц составила "+averageCostAtDay+" рублей.");
    }
    public static void task4() {
        System.out.println("Задача 4. Напишите код, который выводит фамилии и имена сотрудников в корректном виде. ");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1; i >= 0 ; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}
