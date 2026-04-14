package pack04;

import pack03.L3;

public class ShapeTest {

	public static void main(String[] args) {
		Shape shape[] = new Shape[6];
		shape[0] = new Triangle(7, 5, "blue");
		shape[1] = new Rectangle(4, 6, "blue");
		shape[2] = new Triangle(6, 7, "red");
		shape[3] = new Rectangle(8, 3, "red");
		shape[4] = new Triangle(9, 8, "white");
		shape[5] = new Rectangle(5, 7, "white");

		System.out.println("기본정보");

		for (int i = 0; i < shape.length; i++) {
			if (shape[i] instanceof Triangle) {
				Triangle tri = (Triangle) shape[i];
				System.out.println("Triangle \t" + tri.getArea() + "\t" + tri.getColors());
			} else if(shape[i] instanceof Rectangle) {
				Rectangle rec = (Rectangle) shape[i];
				System.out.println("Rectangle \t" + rec.getArea() + "\t" + rec.getColors());
			}
		}
		
		for (Shape obj : shape) {
			// obj에 저장된 실제 객체가 Resize의 자식이기도 하기 때문에,
			//아래와 같이 Casting 할 수 있다.
			Resize size = (Resize) obj;
			size.setResize(5);
		}
		
		
		System.out.println();
		System.out.println("사이즈 변경 후 정보");
		for (int j = 0; j < shape.length; j++) {
			if (shape[j] instanceof Triangle) {
				Triangle tri = (Triangle) shape[j];
				System.out.println("Triangle \t" + tri.getArea() + "\t" + tri.getColors());
			} else if(shape[j] instanceof Rectangle) {
				Rectangle rec = (Rectangle) shape[j];
				System.out.println("Rectangle \t" + rec.getArea() + "\t" + rec.getColors());
			}
		}

	}

}
