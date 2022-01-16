package ru.skypro;

import java.util.Arrays;

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
            if (maxSumDay < i) {
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

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println();

// Task 5
        int[][] matrix = new int[3][3];
        for (int i = 0; i < matrix.length; i++) {
                matrix[i][i] = 1;
                matrix[i][matrix.length - 1 - i] = 1;
        }
        for (int[] row : matrix) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
// Task 6

        int[] arr6 = {5, 8, 2, 3, 9};
        int[] arr6Copy = new int[5];
        System.out.println(Arrays.toString(arr6));
        for (int i = 0; i <= arr6.length - 1; i++)
            arr6Copy[i] = arr6[arr6.length - i - 1];
        System.out.println(Arrays.toString(arr6Copy));


// Task 7
        int[] arr7 = {5, 8, 2, 3, 9};
        int arr7Temp;
        System.out.println(Arrays.toString(arr7));
        for (int i = 0; i <= (arr7.length) / 2; i++) {
            arr7Temp = arr7[arr7.length - i - 1];
            arr7[arr7.length - i - 1] = arr7[i];
            arr7[i] = arr7Temp;
        }
        System.out.println(Arrays.toString(arr7));
// Task 8
        int[] arr8 = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        int sum1 = -2;
        boolean exitF = true;
        // System.out.println(Arrays.toString(arr8));
        for (int j = 0; j <= (arr8.length) / 2; j++) {
            for (int i = arr8.length - 1; i >= (arr8.length) / 2; i--) {
                if (arr8[j] + arr8[i] == sum1) {
                    System.out.println(arr8[j] + " " + arr8[i]);
                    exitF = false;
                }
                if (!exitF) break;
            }
        }


// Task 9
        //     int[] arr9 = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        //     int sum2 = -2;
        // Arrays.sort(arr8);
        //System.out.println(Arrays.toString(arr8));
        for (int j = 0; j <= (arr8.length) / 2; j++) {
            for (int i = arr8.length - 1; i >= (arr8.length) / 2; i--) {
                if (arr8[j] + arr8[i] == sum1)
                    System.out.println(arr8[j] + " " + arr8[i]);
            }
        }
    }

    // Рандом
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

}