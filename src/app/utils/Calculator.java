package app.utils;

import java.util.List;

public class Calculator {
	
	public static float calculateAverage(List<Float> data) {
		float sum = 0;
		for (int i = 0; i < data.size(); i++) {
			sum += data.get(i);
		}
		return sum / (float) data.size();
	}
	
	public static float getMassVariationDeviation(float averageWeight) {
		if (averageWeight <= 80) {
			return 0.1f;
		} else if (averageWeight >= 250) {
			return 0.05f;
		} else {
			return 0.075f;
		}
	}
	
	public static float calculateUpperLimit(float average, float deviationPercentage) {
		return average + (deviationPercentage * average);
	}
	
	public static float calculateLowerLimit(float average, float deviationPercentage) {
		return average - (deviationPercentage * average);
	}

}
