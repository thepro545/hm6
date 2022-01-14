package ru.skypro;


public class Main {

    public static void main(String[] args) {

// Task 1
        int[] arr = generateRandomArray();
        int sumMonth = 0;
        for (int i : arr) {
            sumMonth += i;
        }
        System.out.println("Сумма трат за месяц составила " + sumMonth + " рублей");

// Task 2
        int maxSumDay = 90_000;
        int minSumDay = 201_000;
        for (int i : arr) {
            if ( maxSumDay < i) {
                maxSumDay = i;
            }
            if (minSumDay > i)
                minSumDay = i;
        }
        System.out.println("Минимальная сумма трат за день составила " + minSumDay + " рублей. Максимальная сумма трат за день составила " + maxSumDay + " рублей");

// Task 3

        float avgSumMonth;
        avgSumMonth = sumMonth / arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + avgSumMonth + " рублей");

// Task 4

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);

        }

    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

}