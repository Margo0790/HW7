package ru.netology.stats;

public class StatService {
    // расчет суммы всех продаж за год
    public long calculateTotalSum(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum = sum + sale;

        }
        return sum;
    }

    // средняя сумма продаж в месяц
    public long calculateAverageSum(long[] sales) {
        long sum = calculateTotalSum(sales);

        return sum / sales.length;

    }

    //пик продаж с указанием месяца
    public int findMaxSalesMonth(long[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }


    //фиаско продаж с указанием месяца
    public int findMinSalesMonth(long[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    //продажи ниже среднего по кол-ву месяцев

    public int calculateBelowAverage(long[] sales) {
        long average = calculateAverageSum(sales);
        int count = 0;
        for (long sale : sales) {
            if (sale < average) {
                count++;
            }
        }
        return count;
    }

    //продажи выше среднего по количеству месяцев
    public int calculateUpperAverage(long[] sales) {
        long average = calculateAverageSum(sales);
        int count = 0;
        for (long sale : sales) {
            if (sale > average) {
                count++;
            }
        }
        return count;
    }
}