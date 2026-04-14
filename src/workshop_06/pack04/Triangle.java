package pack04;

public class Triangle extends Shape implements Resize {

	public Triangle() {
	}

	public Triangle(int width, int height, String colors) {
		super(width, height, colors);
	}

	@Override
	public double getArea() {
		return (double) getWidth() * getHeight() / 2;
	}

	@Override
	public void setResize(int size) {
		setHeight(getHeight() + size);
	}

}
