package openclosedprinciple;

public class Rectangle extends Figure{
    @Override
    float getArea(float length, float width) {
        return length * width;
    }

    @Override
    float getPerimeter(float c, float width, float length) {
        c = 2;
        return (2*(length * width));
    }
}
