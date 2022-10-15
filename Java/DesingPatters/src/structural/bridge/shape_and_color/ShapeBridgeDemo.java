package structural.bridge.shape_and_color;

public class ShapeBridgeDemo {

    public static void main(String[] args){

        Color redColor = new Red();
        Shape square = new Square(redColor);
        square.applyColor();

        Color blue = new Blue();
        Shape circle = new Circle(blue);
        circle.applyColor();

        Color green = new Green();
        Shape greenCircle = new Circle(green);

        Shape greenSquare = new Square(green);

        greenCircle.applyColor();
        greenSquare.applyColor();

    }
}
