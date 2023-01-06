package Lessons8;

public class Hexagon implements Shape {
    String shapeName="Hexagon";
    int degree = 120;
    @Override
    public void Name() {
        System.out.println("ShapeName = " + shapeName+", Degree = "+degree);
    }
}
