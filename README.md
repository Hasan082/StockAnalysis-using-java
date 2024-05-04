## Stock Analysis Project

---

### Description:

The Stock Analysis project is designed to provide various functionalities for analyzing stock data. It includes methods to calculate the average stock price, find the maximum stock price, determine the occurrence count of a specific price, and compute the cumulative sum of stock prices.

---

**Features:**

1. **Calculate Average Stock Price:**
   - Method: `calculateAveragePrice(float[] prices)`
   - Description: Calculates the average price of the stocks given an array of stock prices.

2. **Find Maximum Stock Price:**
   - Method: `findMaximumPrice(float[] prices)`
   - Description: Finds the maximum price among all the stocks given an array of stock prices.

3. **Determine Occurrence Count of a Specific Price:**
   - Method: `countOccurrences(float[] prices, float targetPrice)`
   - Description: Determines the number of times a target price occurs in the array of stock prices.

4. **Compute Cumulative Sum of Stock Prices:**
   - Method: `computeCumulativeSum(ArrayList<Float> prices)`
   - Description: Computes the cumulative sum of stock prices given an ArrayList of stock prices.

---

**Usage:**

1. **Calculate Average Stock Price:**
   ```java
   float[] prices = {10.5f, 12.2f, 11.8f, 13.5f, 15.2f, 14.6f, 12.9f, 13.7f, 14.3f, 15.1f};
   float averagePrice = StockAnalysis.calculateAveragePrice(prices);
   System.out.println("Average Stock Price: " + averagePrice);
   ```

2. **Find Maximum Stock Price:**
   ```java
   float[] prices = {10.5f, 12.2f, 11.8f, 13.5f, 15.2f, 14.6f, 12.9f, 13.7f, 14.3f, 15.1f};
   float maxPrice = StockAnalysis.findMaximumPrice(prices);
   System.out.println("Maximum Stock Price: " + maxPrice);
   ```

3. **Determine Occurrence Count of a Specific Price:**
   ```java
   float[] prices = {10.5f, 12.2f, 11.8f, 13.5f, 15.2f, 14.6f, 12.9f, 13.7f, 14.3f, 15.1f};
   float targetPrice = 14.6f;
   int occurrenceCount = StockAnalysis.countOccurrences(prices, targetPrice);
   System.out.println("Occurrence Count of " + targetPrice + ": " + occurrenceCount);
   ```

4. **Compute Cumulative Sum of Stock Prices:**
   ```java
   ArrayList<Float> prices = new ArrayList<>();
   prices.add(10.5f);
   prices.add(12.2f);
   // Add more stock prices as needed...
   ArrayList<Float> cumulativeSum = StockAnalysis.computeCumulativeSum(prices);
   System.out.println("Cumulative Sum of Stock Prices: " + cumulativeSum);
   ```

---

**Note:**

- Ensure that the input arrays/lists of stock prices are not null and contain at least one element.
- Feel free to customize the input data and use the provided methods in your stock analysis projects.