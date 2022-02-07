package app.data;

import java.util.List;

import app.utils.Calculator;

public class MassVariationData {
	
	private List<Float> weights;
	private float average;
	private float allowedDeviationPercentage;
	private float upperLimit;
	private float lowerLimit;
	
	public MassVariationData(List<Float> data) {
		setData(data);
	}
	
	public void setData(List<Float> data) {
		this.weights = data;
		if (weights != null && getDataAmount() > 0) {
			average = Calculator.calculateAverage(data);
			allowedDeviationPercentage = Calculator.getMassVariationDeviation(average);
			upperLimit = Calculator.calculateUpperLimit(average, allowedDeviationPercentage);
			lowerLimit = Calculator.calculateLowerLimit(average, allowedDeviationPercentage);
		}
	}
	
	public int getDataAmount() {
		return weights.size();
	}
	
	public float getAllowedDeviationPercentage() {
		return allowedDeviationPercentage;
	}
	
	public float getAverage() {
		return average;
	}
	
	public float getLowerLimit() {
		return lowerLimit;
	}
	
	public float getUpperLimit() {
		return upperLimit;
	}
	
	public List<Float> getWeights() {
		return weights;
	}

}
