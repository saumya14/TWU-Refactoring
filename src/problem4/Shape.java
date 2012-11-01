package problem4;

public class Shape
{
    public static final int TYPE_LINE = 0;
    public static final int TYPE_RECTANGLE = 1;
    public static final int TYPE_CIRCLE = 2;

    int shapeType;

    //starting point of the line.
    //lower left corner of the rectangle.
    //center of the circle.

    Point p1;
    //ending point of the line.
    //upper right corner of the rectangle.
    //not used for the circle.

    Point p2;

    int radius;

    public int getShapeType() {
        return shapeType;
    }

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    public int getRadius() {
        return radius;
    }
}
