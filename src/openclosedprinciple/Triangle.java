package openclosedprinciple;

public class Triangle extends Figure{
    @Override
    float getArea(float base, float height) {
        return (height * base)/2;
    }

    @Override
    float getPerimeter(float side1, float side2, float side3) {
        return side1 + side2 + side3;
    }
}
