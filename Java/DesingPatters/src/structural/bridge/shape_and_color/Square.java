package structural.bridge.shape_and_color;

public class Square extends Shape {

    public Square(Color color){
        super(color);
    }

    @Override
    public void applyColor() {
        color.applyColor();
    }
}
