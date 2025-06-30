import java.util.*;

public class FinancialForecast {
    public static List<Double> forecastRevenue(List<Double> pastRevenue, int windowSize, int futureMonths) {
        List<Double> forecast = new ArrayList<>();

        int n = pastRevenue.size();

        for (int i = 0; i < futureMonths; i++) {
            double sum = 0;
            int count = 0;

            for (int j = Math.max(0, n - windowSize); j < n; j++) {
                sum += pastRevenue.get(j);
                count++;
            }

            double avg = sum / count;
            forecast.add(avg);
            pastRevenue.add(avg);
            n++;
        }

        return forecast;
    }
}
