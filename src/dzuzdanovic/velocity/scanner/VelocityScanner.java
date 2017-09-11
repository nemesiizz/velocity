package dzuzdanovic.velocity.scanner;

import java.util.Scanner;

import dzuzdanovic.velocity.controller.Util;

public class VelocityScanner {
	
	public  void startScanner() {
		
		Util utility;
		utility = new Util();
		
		try (Scanner scanner = new Scanner(System.in)) {
			
			scanner.useDelimiter("\n");
			System.out.println("Please enter the velocities");
			while (scanner.hasNext()) {

				String s = scanner.next();
				if (!(s.equals(" "))) {
					String trimmed = s.trim();
					try {
						float i = Float.valueOf(trimmed);
						utility.addVelocity(i);
					} catch (NumberFormatException e) {
						System.out.println("That was not a float!");
					}
				} else {
					break;
				}
			}
			scanner.close();
			
			int sumOfSecondsDriven = utility.getSumOfSecondsDriven();
			float maxVelocity = utility.getMaxVelocity();
			float avgVelocity = utility.getAverageVelocity();
			float sumAbove100 = utility.getSumVelAbove100();
			int intervalsAbove100 = utility.getIntervalsAbove100();
			
			System.out.println("Number of seconds driven: " + sumOfSecondsDriven);
			System.out.println("Max velocity: " + maxVelocity);
			System.out.println("Average velocity: " + avgVelocity);
			System.out.println("Sum of velocities above 100 km/h in min: " + sumAbove100);
			System.out.println("Number of intervals of velocities above 100 km/h: " + intervalsAbove100 );
			
		} catch (Exception e) {
			System.out.print(e.toString());
		}
	}

}