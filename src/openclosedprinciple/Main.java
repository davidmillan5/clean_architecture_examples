package openclosedprinciple;

public class Main {
    public static void main(String[] args) {

        //open closed principle

        Rectangle rectangle = new Rectangle();
        System.out.println("rectangle area " + rectangle.getArea(3,6));

        System.out.println("rectangle perimeter " + rectangle.getPerimeter(2,3,4));

        Triangle triangle = new Triangle();
        System.out.println("triangle area " + triangle.getArea(3,2));
        System.out.println("triangle perimeter " + triangle.getPerimeter(2,3,4));
    }
}
