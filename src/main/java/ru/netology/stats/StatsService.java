package ru.netology.stats;


public class StatsService {

    //Сумма продаж сумарно
    public long sum(long[] sales) {
        long sumSales = 0;
        for (long saleMonth : sales) {
            sumSales += saleMonth;
        }
        return sumSales;
    }

    //Средняя сумма продаж в месяц
    public long averageSales(long[] sales) {
        long month = sales.length;
        long avgSales = sum(sales) / month;
        return avgSales;
    }

    //Номер месяца, в котором был пик продаж
    public int maxMonth(long[] sales) {
        long maxSales = sales[0];
        long numberMonth = 0;
        long maxMonth = 0;
        for (long saleMonth : sales) {
            numberMonth += 1;
            if (saleMonth > maxSales) {
                maxSales = saleMonth;
                maxMonth = numberMonth;
            }
        }
        return (int) maxMonth;
    }

    //Номер месяца, в котором был минимум продаж
    public int minMonth(long[] sales) {
        long minSales = sales[0];
        long numberMonth = 0;
        long minMonth = 0;
        for (long saleMonth : sales) {
            numberMonth += 1;
            if (saleMonth < minSales) {
                minSales = saleMonth;
                minMonth = numberMonth;
            }
        }
        return (int) minMonth;
    }

    //Кол-во месяцев, в которых продажи были ниже среднего
    public int monBelow(long[] sales) {
        long monthLessAvg = 0;
        for (long sale : sales) {
            if (sale < averageSales(sales)) {
                monthLessAvg += 1;
            }
        }
        return (int) monthLessAvg;
    }

    //Кол-во месяцев, в которых продажи были выше среднего
    public int monHigher(long[] sales) {
        long monthOverAvg = 0;
        for (long sale : sales) {
            if (sale < averageSales(sales)) {
                monthOverAvg += 1;
            }
        }
        return (int) monthOverAvg;
    }
}
