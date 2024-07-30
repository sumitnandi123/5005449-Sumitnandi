//Concept of recursion:Recursion is a technique where a function calls itself in order to solve smaller instances of the same problem. It simplifies certain problems by breaking them down into smaller, more manageable subproblems. Each recursive call should bring the solution closer to a base case, which terminates the recursion.
public class FinancialForecasting {

    public static double calculateFutureValue(double initialValue, double growthRate, int periods) {
        if (periods == 0) {
            return initialValue;
        }
        
        double previousValue = calculateFutureValue(initialValue, growthRate, periods - 1);
    
        return previousValue * (1 + growthRate);
    }

    public static void main(String[] args) {
        double initialValue = 1000.0; // Initial investment
        double growthRate = 0.05; // Growth rate
        int periods = 10; // Number of periods 

        double futureValue = calculateFutureValue(initialValue, growthRate, periods);

        System.out.println("Future Value: " + futureValue);
    }
}
//time complexity:O(n), where n is the number of periods. Each period results in a single recursive call.
//Optimization:To avoid excessive computation and improve efficiency, we can use memoization. Memoization stores the results of expensive function calls and reuses them when the same inputs occur again.