package pack02;

public class Otab extends Mobile {

	public Otab() {
	}

	public Otab(String mobileName, int batterySize, String osType) {
		super(mobileName, batterySize, osType);
	}

	public int operate(int time) { // 사용
		setBatterySize(getBatterySize()-(time*12));
		return getBatterySize();
	}

	public int charge(int time) { // 충전
		setBatterySize(getBatterySize()+(time*8));
		return getBatterySize();
	}
}