package ru.netology.stats;

public class StatsService {
    public long sum(long[] sales) {
        long totalSale = 0;
        for (long sale : sales) {
            totalSale += sale;
        }
        return totalSale;
    }

    public long average(long[] sales) {
        return sum(sales) / 12;
    }
    public int maximum(long [] sales){
      int maximumMount = 0;
      long maximum = sales[0];
        for (int i = 0; i < sales.length; i++) {
            if (maximum <= sales[i]){
                maximum = sales[i];
                maximumMount = i;
            }
        }
        return maximumMount;
    }
    public int minimum(long [] sales){
        int minimumMount = 0;
        long minimum = sales[0];
        for (int i = 0; i < sales.length; i++) {
            if (minimum >= sales[i]){
                minimum = sales[i];
                minimumMount = i;
            }
        }
        return minimumMount;
    }
    public int mountLowerAverage(long[] sales){
        int counter = 0;
        long averageSale = average(sales);
        for (long sale: sales) {
            if (sale < averageSale){
                counter++;
            }
        }
        return counter;
    }
    public int mountAboveAverage(long[] sales){
        int counter = 0;
        long averageSale = average(sales);
        for (long sale: sales) {
            if (sale > averageSale){
                counter++;
            }
        }
        return counter;
    }
}