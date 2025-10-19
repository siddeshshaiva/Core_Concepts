package Grooming;

public class AlertSystem {
    public static void main(String[] args) {
        int[] pulse = {72, 75, 120, 125, 80};

        // Step 1: Calculate average
        double sum = 0;
        for (int p : pulse) sum += p;
        double avg = sum / pulse.length;

        // Step 2: Check only for one pair that both deviate
        for (int i = 3; i < pulse.length; i++) {
            boolean prevDev = Math.abs(pulse[i - 1] - avg) / avg > 0.2;
            boolean currDev = Math.abs(pulse[i] - avg) / avg > 0.2;

            if (prevDev && currDev) {
                System.out.println("Alert Raised at Hour " + i + " and " + (i + 1));
                break; // stop after first alert
            }
        }
    }
}


