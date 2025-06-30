import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Double> pastRevenue = new ArrayList<>(Arrays.asList(1000.0, 1200.0, 1300.0, 1500.0, 1700.0));

        System.out.print("Enter the number of months to forecast: ");
        int months = sc.nextInt();

        System.out.print("Enter window size : ");
        int window = sc.nextInt();

        List<Double> forecast = FinancialForecast.forecastRevenue(pastRevenue, window, months);

        System.out.println("\nForecast for next " + months + " months:");
        for (int i = 0; i < forecast.size(); i++) {
            System.out.printf("Month %d: %.2f\n", i + 1, forecast.get(i));
        }
    }
}
