package dzuzdanovic.velocity.controller;

import java.util.ArrayList;
import java.util.Collections;

public class Util {
	
	ArrayList<Float> velocities = new ArrayList<Float>();
	
	 public void addVelocity (float f){
		 velocities.add(f);
	 }
	
	public int getSumOfSecondsDriven() {
		int sumOfSecondsDriven = velocities.size();
		return sumOfSecondsDriven;
	}
	
	public float getMaxVelocity () {
		float maxVelocity = Collections.max(velocities);
		return maxVelocity;	
	}
	
	public float getAverageVelocity() {
		float sum = 0;
		for (float i : velocities) {
			sum+=i;
		}
		float avgVelocity = sum / velocities.size();
		return avgVelocity;
	}
	
	public float getSumVelAbove100() {
		float sum = 0;
		for (float i : velocities) {
			if (i > 100) {
				sum+=i;
			}
		}
		float sumAbove100 = sum/60;
		return sumAbove100;
	}
	
	public int getIntervalsAbove100() {
		ArrayList<Float> velocitiesAbove100 = new ArrayList<Float>();
		for (float i : velocities) {
			if (i > 100) {
				velocitiesAbove100.add(i);
			}
		}
		int intervalsAbove100 = velocitiesAbove100.size();
		return intervalsAbove100;
	}
}
