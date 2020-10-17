public class Cylinder extends Circle {
	private double height;

	//Constructor with default color, radius and height
	public Cylinder() {
		super();
		height = 1.0;
	}
	//Constructor with default radius, color but given height
	public Cylinder(double height) {
		super();
		this.height = height;
	}
	//Constructor with default color, but given radius, height
	public Cylinder(double radius, double height) {
		super(radius);
		this.height = height;
	}
	// A public method for retrieving the height
	public double getHeight(){
		return height;
	}

	// A public method for retrieving the height
	//If the methods are not found java will automatically search in the super class
	// use superclass method getArea() to get the base area
	public double getVolume(){
		return super.getArea()*this.height;
	}

	// Surface area of the Cylinder
	@Override
	public  double getArea(){
		return (2*Math.PI*super.getRadius()*this.height) + (2*super.getArea());
	}

	@Override
	public  String toString(){
		return  "Cylinder: subclass of " + super.toString() + " height=" + height;
	}

}