public class TestCylinder {
	public static void main (String[] args) {
		// Declare and allocate a new instance of cylinder
		Cylinder c1 = new Cylinder();
		
		System.out.println("Cylinder:"+" radius="+ c1.getRadius()
				+ " height=" + c1.getHeight()
				+ " base area=" + c1.getArea()
				+ " volume=" + c1.getVolume());


		// Declare and allocate a new instance of cylinder, specifying Height
		Cylinder c2 = new Cylinder(5.0);
		
		System.out.println("Cylinder:"
				+ " radius=" + c2.getRadius()
				+ " height=" + c2.getHeight()
				+ " base area=" + c2.getArea()
				+ " volume=" + c2.getVolume());
		
		// Declare and allocate a new instance of cylinder specifying radius and height
		Cylinder c3 = new Cylinder(5.0, 10.0);
	
		System.out.println("Cylinder:"
				+ " radius=" + c3.getRadius()
				+ " height=" + c3.getHeight()
				+ " base area=" + c3.getArea()
				+ " volume=" + c3.getVolume());

		// Creating the instance of Circle class and the Cylinder Class
		Circle circle1 = new Circle();
		Cylinder cylinder4 = new Cylinder();
		System.out.println("Area of the Circle is " + circle1.getArea());
		System.out.println("Area of the Cylinder is " + cylinder4.getArea());
	}

}