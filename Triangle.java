package Lessons8;

public class Triangle implements Shape{
    String shapeName="Triangle";
    int degree = 60;
    @Override
    public void Name() {
        System.out.println("ShapeName = " + shapeName+", Degree = "+degree);
    }


}
