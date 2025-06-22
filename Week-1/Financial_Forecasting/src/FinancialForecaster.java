public class FinancialForecaster {

    /**
     * Calculates the future value of an investment using a recursive approach.
     *
     * @param currentValue The current value of the investment.
     * @param growthRate   The periodic growth rate (e.g., 0.05 for 5%).
     * @param periods      The number of periods to forecast into the future.
     * @return The predicted future value.
     */
    public static double calculateFutureValueRecursive(double currentValue, double growthRate, int periods) {
        // 1. Base Case: If there are no more periods to forecast,
        // the future value is the current value.
        if (periods == 0) {
            return currentValue;
        }
        // 2. Recursive Step:
        // Calculate the value after one period.
        double nextValue = currentValue * (1 + growthRate);
        // Recursively call the function for the remaining periods with the new current value.
        return calculateFutureValueRecursive(nextValue, growthRate, periods - 1);
    }

    public static void main(String[] args) {
        System.out.println("Exercise 7: Financial Forecasting");
        System.out.println("----------------------------------");

        double initialInvestment = 1000.0; // Initial amount
        double annualGrowthRate = 0.05;   // 5% annual growth
        int yearsToForecast = 5;         // Forecast for 5 years

        System.out.printf("Initial Investment: $%.2f%n", initialInvestment);
        System.out.printf("Annual Growth Rate: %.2f%%%n", annualGrowthRate * 100);
        System.out.printf("Years to Forecast: %d%n", yearsToForecast);

        double futureValue = calculateFutureValueRecursive(initialInvestment, annualGrowthRate, yearsToForecast);
        System.out.printf("Predicted Future Value after %d years: $%.2f%n%n", yearsToForecast, futureValue);

        // Another example: 0 periods
        double testValue = 500.0;
        int zeroPeriods = 0;
        double futureValueZeroPeriods = calculateFutureValueRecursive(testValue, annualGrowthRate, zeroPeriods);
        System.out.printf("Forecasting $%.2f with %.2f%% growth for %d periods: $%.2f%n",
                testValue, annualGrowthRate * 100, zeroPeriods, futureValueZeroPeriods);

        // Another example: 1 period
        int onePeriod = 1;
        double futureValueOnePeriod = calculateFutureValueRecursive(testValue, annualGrowthRate, onePeriod);
        System.out.printf("Forecasting $%.2f with %.2f%% growth for %d period: $%.2f%n",
                testValue, annualGrowthRate * 100, onePeriod, futureValueOnePeriod);
    }
}