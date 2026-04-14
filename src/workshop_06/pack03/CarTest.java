package pack03;

public class CarTest {

	public static void main(String[] args) {

		Car cars[] = new Car[2];
		cars[0] = new L3("L3", "1500", 50, 25, 0);
		cars[1] = new L5("L5", "2000", 70, 35, 0);

		System.out.println("vehicleName \t engineSize \t oilTank \t oilSize \t distance \t temperature");
		System.out.println(
				"-----------------------------------------------------------------------------------------------");

		for (int i = 0; i < cars.length; i++) {
			if (cars[i] instanceof L3) {
				L3 l3 = (L3) cars[i];
				System.out.println(l3.getName() + "\t\t   " + l3.getEngine() + "\t\t   " + l3.getOilTank() + "\t\t   "
						+ l3.getOilSize() + "\t\t   " + l3.getDistance() + "\t\t   " + l3.getTempGage());
			} else {
				L5 l5 = (L5) cars[i];
				System.out.println(l5.getName() + "\t\t   " + l5.getEngine() + "\t\t   " + l5.getOilTank() + "\t\t   "
						+ l5.getOilSize() + "\t\t   " + l5.getDistance() + "\t\t   " + l5.getTempGage());
			}
		}

		System.out.println();
		System.out.println("25주유");
		System.out.println("vehicleName \t engineSize \t oilTank \t oilSize \t distance \t temperature");
		System.out.println(
				"-----------------------------------------------------------------------------------------------");

		for (int j = 0; j < cars.length; j++) {
			cars[j].setOil(25);
			if (cars[j] instanceof L3) {
				L3 l3 = (L3) cars[j];
				System.out.println(l3.getName() + "\t\t   " + l3.getEngine() + "\t\t   " + l3.getOilTank() + "\t\t   "
						+ l3.getOilSize() + "\t\t   " + l3.getDistance() + "\t\t   " + l3.getTempGage());
			} else {
				L5 l5 = (L5) cars[j];
				System.out.println(l5.getName() + "\t\t   " + l5.getEngine() + "\t\t   " + l5.getOilTank() + "\t\t   "
						+ l5.getOilSize() + "\t\t   " + l5.getDistance() + "\t\t   " + l5.getTempGage());
			}
		}
		
		System.out.println();
		System.out.println("80주행");
		System.out.println("vehicleName \t engineSize \t oilTank \t oilSize \t distance \t temperature");
		System.out.println(
				"-----------------------------------------------------------------------------------------------");
		
		for (int k = 0; k < cars.length; k++) {
			cars[k].go(80);
			if (cars[k] instanceof L3) {
				L3 l3 = (L3) cars[k];
				System.out.println(l3.getName() + "\t\t   " + l3.getEngine() + "\t\t   " + l3.getOilTank() + "\t\t   "
						+ l3.getOilSize() + "\t\t   " + l3.getDistance() + "\t\t   " + l3.getTempGage());
			} else {
				L5 l5 = (L5) cars[k];
				System.out.println(l5.getName() + "\t\t   " + l5.getEngine() + "\t\t   " + l5.getOilTank() + "\t\t   "
						+ l5.getOilSize() + "\t\t   " + l5.getDistance() + "\t\t   " + l5.getTempGage());
			}
		}
		
		
		
		
		
	}

}
