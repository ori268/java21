package pack02;

public class Ltab extends Mobile {

	public Ltab() {
	}

	public Ltab(String mobileName, int batterySize, String osType) {
		super(mobileName, batterySize, osType);
	}

	public int operate(int time) { // 사용
		setBatterySize(getBatterySize()-(time*10));
		return getBatterySize();
	}

	public int charge(int time) { // 충전
		setBatterySize(getBatterySize()+(time*10));
		return getBatterySize();
	}
	
}
