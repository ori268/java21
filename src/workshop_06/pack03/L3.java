package pack03;

public class L3 extends Car implements Temp {

	public L3(String name, String engine, int oilTank, int oilSize, int distance) {
		super(name, engine, oilTank, oilSize, distance);
	}

	@Override
	public void go(int distance) {   // 주행
		setOilSize(getOilSize()-(distance/10));
		setDistance(distance);
	}

	@Override
	public void setOil(int oilSize) {  // Oil 충전
		setOilSize(getOilSize() + oilSize);
	}
	
	public int getTempGage() {  // 엔진온도 측정
		return getDistance() / 10;
	}

	
	
	
}
