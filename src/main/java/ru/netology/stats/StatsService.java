package ru.netology.stats;

public class StatsService {


    public int calculateSum(int[] purchases) {
        int sum = 0;
        for (int value : purchases) {
            sum += value;
        }
        return sum;
    }

    public static int calculateAverageSum(int[] purchases) {
        int months = 12;
        int sum = 0;
        int average = 0;
        for (int value : purchases) {
            sum += value;
            average = sum / months;
        }
        return average;
    }

    public static int salesMaximumMonth(int[] purchases) {
        int max = purchases[0];
        int monthCounter = 0;
        int month = 0;
        for (int num : purchases) {
            monthCounter++;
            if (max <= num) {
                max = num;
                month = monthCounter;
            }
        }
        return month;
    }

    public static int salesMinimumMonth(int[] purchases) {

        int min = purchases[0];
        int monthCounter = 0;
        int month = 0;
        for (int num : purchases) {
            monthCounter++;
            if (min >= num) {
                min = num;
                month = monthCounter;
            }
        }
        return month;
    }

    public static int calculateMonthOverAverageSum(int[] purchases) {
        int quantity = 0;
        int average = calculateAverageSum(purchases);
        int month = 0;
        for (int num : purchases) {
            if (num > average) {
                ;
                quantity = quantity + 1;
            }
        }
        return quantity;
    }

    public static int calculateMonthUnderAverageSum(int[] purchases) {
        int quantity = 0;
        int average = calculateAverageSum(purchases);

        int month = 0;
        for (int num : purchases) {
            if (num < average) {
                quantity = quantity + 1;
            }
        }
        return quantity;
    }
}


