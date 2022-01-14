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

// Task 5  - Не доделал

        int[][] gameField = new int[3][3];
        for (int i = 0; i < gameField.length; i++) {
            for (int j = 0; j < gameField[0].length; j++) {
                if ((i + j) % 2 == 0) gameField[j][i] = 1;
                System.out.print(gameField[j][i] + " ");
            }
            System.out.println();
        }

//        int[][] matrix = new int[3][3];
//        for (int[] row : matrix) {
//            for (int column : row) {
//                // if (row[column] == row.length-1 || )
//                //          if (row[column] % 2 == 0 && (matrix[] + row[column]) %2 == 0)
//                column = 2;
//                System.out.print(column + " ");
//            }
//
//
//            System.out.println();
//        }
// Task 6 - Не доделал

//        int[] arr5 = {5, 8, 2, 3, 9};
//        int[] arr5Copy = Arrays.copyOf(arr5, arr5.length);
//        System.out.println(Arrays.toString(arr5));
//        for (int j = 0; j <= arr5.length - 1; j++) {
//            for (int i = arr5Copy.length - 1; i >= 0; i--) {
//                arr5Copy[i] = arr5[j];
//            }
//        }
//
//        System.out.println(Arrays.toString(arr5Copy));


// Task 7- Не доделал
//        int[] arr4 = {5, 8, 2, 3, 9};
//        int arr4T1 = arr4[0];
//        System.out.println(Arrays.toString(arr4));
//        for (int j = 0; j <= arr4.length - 1; j++) {
//            for (int i = arr4.length - 1; i >= 0; i--) {
//                arr4T1 = arr4[i];
//                arr4[i] = arr4[j];
//                arr4[j] = arr4T1;
//                //  System.out.print(arr4T1);
//
//            }
//        }
//        System.out.println(Arrays.toString(arr4));
// Task 9
        int[] arr8 = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        int sum1 = -2;
        Arrays.sort(arr8);
        System.out.println(Arrays.toString(arr8));
        for (int j = 0; j <= (arr8.length - 1)/ 2; j++) {
            for (int i = arr8.length - 1; i >= 0; i--) {
                if (arr8[j] + arr8[i] == sum1) {
                    System.out.println(arr8[j] + " " + arr8[i]);
                    break;
                }
            }
        }
// Task 8
        int[] arr9 = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        int sum2 = -2;
       System.out.println(Arrays.toString(arr9));
        for (int j = 0; j <= (arr9.length - 1) / 2; j++) {
            for (int i = arr9.length - 1; i >= 0; i--) {
                if (arr9[j] + arr9[i] == sum2) {
                    System.out.println(arr9[j] + " " + arr9[i]);
                    return;
                }
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