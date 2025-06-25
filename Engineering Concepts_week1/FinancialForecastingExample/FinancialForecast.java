package FinancialForecastingExample;

 public class FinancialForecast {

    // Recursive method to calculate future value
    public static double futureValue(double currentValue, double growthRate, int years) {
        if (years == 0) {
            return currentValue;
        }
        return futureValue(currentValue, growthRate, years - 1) * (1 + growthRate);
    }

    public static void main(String[] args) {
        double initialInvestment = 1000.0;
        double annualGrowthRate = 0.05; // 5% growth
        int forecastYears = 5;

        double result = futureValue(initialInvestment, annualGrowthRate, forecastYears);
        System.out.println("Forecasted Future Value: ₹" + result);
    }
}

