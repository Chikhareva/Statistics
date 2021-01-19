package ru.netology.stats;

public class StatsService {

//    public static int[] purchases() {
//        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
//        return purchases;
//    }

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
//        int[] salesStats = purchases();
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
//        int[] salesStats = purchases();
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
//        int monthCounter= 0;
        int month = 0;
        for (int num : purchases) {
//            month = month + 1;
//            monthCounter++;
            if (num > average) {
//                num=average;
                quantity = quantity + 1;
            }
            return quantity;


        }
//        for (int i = 0; i < purchases.length; i++)
//            if (average < purchases[i])
//                quantity++;
        return quantity;
    }

    public static int calculateMonthUnderAverageSum(int[] purchases) {
        int quantity = 0;
        for (int i = 0; i > purchases.length; i++)
            if (calculateAverageSum(purchases) < purchases[i])
                quantity++;
        return quantity;
    }

}


