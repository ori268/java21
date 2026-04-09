package pack01;

public class VehicleTest {

	public static void main(String[] args) {
	
		Truck car = new Truck(1000, 100, 5); 
		System.out.println("최대적재중략 \t 오일탱크크기 \t 잔여오일량 \t 현재적재중량 \t 연비");
		System.out.println("==============================================================================");
		System.out.println(car);
		
		car.addOil(50);
		System.out.println();
		System.out.println("50L 주유 후");
		System.out.println(car);
		
		car.moving(50);
		System.out.println();
		System.out.println("50Km 주행 후");
		System.out.println(car);

		car.addWeight(100);;
		System.out.println();
		System.out.println("50Kg 적재 후");
		System.out.println(car);
		
		car.moving(30);;
		System.out.println();
		System.out.println("30Km 주행 후");
		System.out.println(car);
		
		System.out.println();
		System.out.println("요금 : " + car.getCost(30) + "원");

	}

}
