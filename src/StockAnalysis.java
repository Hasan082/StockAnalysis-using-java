import java.util.ArrayList;

public class StockAnalysis {

    // Calculate the average stock price
    public static float calculateAveragePrice(float[] prices) {
        float sum = 0;
        for (float price : prices) {
            sum += price;
        }
        return sum / prices.length;
    }

    // Find the maximum stock price
    public static float findMaximumPrice(float[] prices) {
        float maxPrice = prices[0];
        for (float price : prices) {
            if (price > maxPrice) {
                maxPrice = price;
            }
        }
        return maxPrice;
    }

    // Determine the occurrence count of a specific price
    public static int countOccurrences(float[] prices, float targetPrice) {
        int count = 0;
        for (float price : prices) {
            if (price == targetPrice) {
                count++;
            }
        }
        return count;
    }

    // Compute the cumulative sum of stock prices
    public static ArrayList<Float> computeCumulativeSum(ArrayList<Float> prices) {
        ArrayList<Float> cumulativeSum = new ArrayList<>();
        float sum = 0;
        for (float price : prices) {
            sum += price;
            cumulativeSum.add(sum);
        }
        return cumulativeSum;
    }

    public static void main(String[] args) {
        // Given array of stock prices
        float[] pricesArray = { 10.5f, 12.2f, 11.8f, 13.5f, 15.2f, 14.6f, 12.9f, 13.7f, 14.3f, 15.1f };

        // Given ArrayList of stock prices
        ArrayList<Float> pricesArrayList = new ArrayList<>();
        pricesArrayList.add(10.5f);
        pricesArrayList.add(12.2f);
        pricesArrayList.add(11.8f);
        pricesArrayList.add(13.5f);
        pricesArrayList.add(15.2f);
        pricesArrayList.add(14.6f);
        pricesArrayList.add(12.9f);
        pricesArrayList.add(13.7f);
        pricesArrayList.add(14.3f);
        pricesArrayList.add(15.1f);

        // Calculate and print the average stock price
        System.out.println("Average Stock Price: " + calculateAveragePrice(pricesArray));

        // Find and print the maximum stock price
        System.out.println("Maximum Stock Price: " + findMaximumPrice(pricesArray));

        // Determine and print the occurrence count of a specific price
        float targetPrice = 14.6f;
        System.out.println("Occurrence Count of " + targetPrice + ": " + countOccurrences(pricesArray, targetPrice));

        // Compute and print the cumulative sum of stock prices
        ArrayList<Float> cumulativeSum = computeCumulativeSum(pricesArrayList);
        System.out.println("Cumulative Sum of Stock Prices: " + cumulativeSum);
    }
}
