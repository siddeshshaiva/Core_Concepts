package Grooming;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MostConsistentRainfallZone {

	private static double calculateMean(int[] data) {
		double sum = 0;
		for (int value : data) {
			sum += value;
		}
		return sum / data.length;
	}

	private static double calculateVariance(int[] data, double mean) {
		double sumOfSquaredDifferences = 0;
		for (int value : data) {
			double diff = value - mean;
			sumOfSquaredDifferences += (diff * diff);
		}
		return sumOfSquaredDifferences / data.length;
	}

	public static String findMostConsistentZone(Map<String, int[]> rainfallData) {
		if (rainfallData == null || rainfallData.isEmpty()) {
			return "No rainfall data available.";
		}
		String mostConsistentZone = null;
		double minVariance = Double.MAX_VALUE;
		for (Map.Entry<String, int[]> entry : rainfallData.entrySet()) {
			String zoneName = entry.getKey();
			int[] data = entry.getValue();
			if (data.length == 0) {
				continue;
			}
			double mean = calculateMean(data);
			double variance = calculateVariance(data, mean);
			if (variance < minVariance) {
				minVariance = variance;
				mostConsistentZone = zoneName;
			}
		}
		return mostConsistentZone;
	}

	public static void main(String[] args) {
		Map<String, int[]> rainfallData = new HashMap<>();
		rainfallData.put("Zone1", new int[] { 12, 13, 12, 13 });
		rainfallData.put("Zone2", new int[] { 20, 10, 25, 5 });
		String result = findMostConsistentZone(rainfallData);
		System.out.println("Sample Output: " + result);

	}
}
