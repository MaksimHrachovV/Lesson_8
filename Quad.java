package Lessons8;

public class Quad implements Shape {
    String shapeName="Quad";
    int degree = 90;
    @Override
    public void Name() {
        System.out.println("ShapeName = " + shapeName+", Degree = "+degree);
    }
}
