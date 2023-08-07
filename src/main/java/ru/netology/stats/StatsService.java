package ru.netology.stats;

public class StatsService {
    public int calcSumSales(int[] sales) {
        int sum = 0;
        for (int sale: sales) {
            sum += sale;
        }
        return sum;
    }
    public int averageSales(int[] sales) {

        int average = calcSumSales(sales) / sales.length;

        return average;
    }

    public int getMaxSales(int [] sales) {
        int maxMonth = 0; //номер месяца с максимальными продажами среди просмотренных ранее
        for (int i = 0 ; i < sales.length; i++){
            if (sales[i] >= sales[maxMonth]){
                maxMonth = i; //запомним его как максимальный
            }
        }
        return maxMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int getMinSales(int [] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }
        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int salesBelowAverage(int[] sales){
        int monthBelowAverage = 0; // количество месяцев с низкими продажами
        for (int sale : sales) {
            if (sale < averageSales(sales)){
                monthBelowAverage++;
            }
        }
        return monthBelowAverage;
    }

    public int salesAboveAverage(int[] sales){
        int monthAboveAverage = 0; // количество месяцев с низкими продажами
        for (int sale : sales) {
            if (sale > averageSales(sales)){
                monthAboveAverage++;
            }
        }
        return monthAboveAverage;
    }
}
