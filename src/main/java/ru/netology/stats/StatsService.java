package ru.netology.stats;

public class StatsService {
            public int calculateSum ( int[] purchases){
            int sum = 0;
            for (int value : purchases) {
                sum += value;
            }
            return sum;
        }
        public int averageSum ( int[] purchases ){
            int months = 12;
            int sum = 0;
            int average = 0;
            for (int value : purchases) {
                sum += value;
                average = sum / months;
            }
            return average;
        }
//        public int maxMonth(int[] purchases){
//            int month = 0;
//            int max=0;
//            for (int value: purchases) {
//                month = month + 1;
//                max=

        }






