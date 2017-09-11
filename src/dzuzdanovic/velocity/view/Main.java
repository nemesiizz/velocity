package dzuzdanovic.velocity.view;

import dzuzdanovic.velocity.scanner.VelocityScanner;


public class Main {
		
	public static void main(String ar[]) {
		
		try {
			VelocityScanner vs = new VelocityScanner();
			vs.startScanner();
			
		} catch (Exception e) {
			
			System.out.print(e.toString());
			e.printStackTrace();
			
		}
		
	}
}