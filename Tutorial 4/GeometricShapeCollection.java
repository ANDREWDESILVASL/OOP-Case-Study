import java.util.ArrayList;
import java.util.Scanner;

public class GeometricShapeCollection implements ShapeCollection {
    private ArrayList<GeometricObject> shapeList;
    private int numObject;

    public GeometricShapeCollection(int listLength) {
        this.numObject = listLength;
        shapeList = new ArrayList<GeometricObject>();
    }

    public void addShape(GeometricObject shape) {
        if (shapeList.size() < numObject){
            shapeList.add(shape);
        } else {
            System.out.println("No more space in the list");
        }
    }

    @Override
    public void printShapeList() {
        for(int i = 0; i < shapeList.size(); i++){
            if (shapeList.get(i).getShape().equals("Circle")) {
                System.out.println("Shape = Circle, Area = " + shapeList.get(i).getArea() + " , Perimeter = " + shapeList.get(i).getPerimeter());
            }
            else if (shapeList.get(i).getShape().equals("Rectangle")) {
                System.out.println("Shape = Rectangle, Area = " + shapeList.get(i).getArea() + " , Perimeter = " + shapeList.get(i).getPerimeter());
            } else {
                System.out.println("Shape = Square, Area = " + shapeList.get(i).getArea() + " , Perimeter = " + shapeList.get(i).getPerimeter());
            }
        }
    }

    @Override
    public boolean runMenu() {
        boolean exit = false;
        System.out.println("To Add a new shape press 1");
        System.out.println("To print the list of the shape press 2");
        System.out.print("To exit press 3 : ");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice){
            case 1:
                System.out.println("Press 1 if you want to add a Circle");
                System.out.println("Press 2 if you want to add a Rectangle");
                System.out.print("Press 3 if you want to add a Square : ");

                int choice2 = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Enter the color of your shape");
                String colour = scanner.nextLine();

                System.out.println("Is it filled? (y/n)");
                String isFilled = scanner.nextLine();
                boolean filled = false;

                if (isFilled.equals("y")) {
                    filled = true;
                } else if (isFilled.equals("n")) {
                    filled = false;
                } else {
                    System.out.println("Please enter y or n, if the shape is filled or ot respectively");
                }
                switch (choice2) {
                    case 1:
                        //it is a circle
                        System.out.println("Insert the radius : ");
                        int radius = scanner.nextInt();
                        Circle c = new Circle(filled,colour,radius);
                        this.addShape(c);
                        break;
                    case 2:
                        //it is a rectangle
                        System.out.println("Insert the length of the Rectangle : ");
                        double length = scanner.nextDouble();
                        System.out.println("Insert the width of the rectangle : ");
                        double width = scanner.nextDouble();
                        Rectangle r = new Rectangle(filled,colour,length,width);
                        this.addShape(r);
                        break;
                    case 3:
                        //it is a square
                        System.out.println("Insert the side of the square : ");
                        double side = scanner.nextDouble();
                        Square s = new Square(filled,colour,side);
                        this.addShape(s);
                        break;
                }
                break;
            case 2:
                this.printShapeList();
                break;
            case 3:
                exit = true;
                break;
        }
        return exit;
    }

    public static void main(String[] args) {
        //Create a parking
        ShapeCollection sys = new GeometricShapeCollection(10);
        boolean exit = false;

        while (!exit) {
            exit = sys.runMenu();
        }
    }
}
