package Lessons8;

public class Pentagon implements Shape {
    String shapeName="Hexagon";
    int degree = 108;
    @Override
    public void Name() {
        System.out.println("ShapeName = " + shapeName+", Degree = "+degree);
    }
}
