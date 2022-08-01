package ru.netology.stats;

public class StatsService {
    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public long sumOfSales(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum = sum + sale;
        }
        return sum;
    }

    public long getAverage(long[] sales) {
        return sumOfSales(sales) / sales.length;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[mixMonth] - продажи в месяце mixMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    public long countWorseAverage (long[] sales) {
        int countWorseMonths = 0;
        for (long sale : sales) {
            if (sale < getAverage(sales)){
                countWorseMonths++;
            }
        }
        return countWorseMonths;
    }

    public long countBetterAverage (long[] sales) {
        int countBetterMonths = 0;
        for (long sale : sales) {
            if (sale > getAverage(sales)){
                countBetterMonths++;
            }
        }
        return countBetterMonths;
    }
}
