package Lessons8;

public class Circle implements Shape {
    String shapeName="Circle";
    int degree = 360;
    @Override
    public void Name() {
        System.out.println("ShapeName = " + shapeName+", Degree = "+degree);
    }
}
