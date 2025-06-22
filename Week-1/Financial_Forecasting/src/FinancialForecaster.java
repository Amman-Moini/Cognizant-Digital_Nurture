public class FinancialForecaster {
    public static double calculateFutureValueRecursive(double currentValue, double growthRate, int periods) {
        if (periods == 0) {
            return currentValue;
        }
        double nextValue = currentValue * (1 + growthRate);
        return calculateFutureValueRecursive(nextValue, growthRate, periods - 1);
    }

    public static void main(String[] args) {
        System.out.println("Exercise 7: Financial Forecasting");
        System.out.println("----------------------------------");

        double initialInvestment = 1000.0; 
        double annualGrowthRate = 0.05;   
        int yearsToForecast = 5;         

        System.out.printf("Initial Investment: $%.2f%n", initialInvestment);
        System.out.printf("Annual Growth Rate: %.2f%%%n", annualGrowthRate * 100);
        System.out.printf("Years to Forecast: %d%n", yearsToForecast);

        double futureValue = calculateFutureValueRecursive(initialInvestment, annualGrowthRate, yearsToForecast);
        System.out.printf("Predicted Future Value after %d years: $%.2f%n%n", yearsToForecast, futureValue);

        double testValue = 500.0;
        int zeroPeriods = 0;
        double futureValueZeroPeriods = calculateFutureValueRecursive(testValue, annualGrowthRate, zeroPeriods);
        System.out.printf("Forecasting $%.2f with %.2f%% growth for %d periods: $%.2f%n",
                testValue, annualGrowthRate * 100, zeroPeriods, futureValueZeroPeriods);

        int onePeriod = 1;
        double futureValueOnePeriod = calculateFutureValueRecursive(testValue, annualGrowthRate, onePeriod);
        System.out.printf("Forecasting $%.2f with %.2f%% growth for %d period: $%.2f%n",
                testValue, annualGrowthRate * 100, onePeriod, futureValueOnePeriod);
    }
}
