import java.awt.geom.Path2D;

public class HouseShape extends CompoundShape {

    public HouseShape(double x, double y, double width, double height) {
        // create the rectangle
        Path2D rectangle = new Path2D.Double();
        rectangle.moveTo(x, y);
        rectangle.lineTo(x + width, y);
        rectangle.lineTo(x + width, y + height);
        rectangle.lineTo(x, y + height);
        rectangle.closePath();

        // create the triangle
        Path2D triangle = new Path2D.Double();
        triangle.moveTo(x, y);
        triangle.lineTo(x + width / 2.0, y - height / 2.0);
        triangle.lineTo(x + width, y);
        triangle.closePath();

        // add the shapes to the house
        add(rectangle);
        add(triangle);
    }

}

