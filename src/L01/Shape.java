package L01;

public class Shape {
    private String type;
    private double area;
    private double perimeter;

    public Shape(String shapeType, double shapeArea, double shapePeri) {
        type = shapeType;
        area = shapeArea;
        perimeter = shapePeri;
    }

    public double shapeArea() {
        return area;
    }

    public double shapePerimeter() {
        return perimeter;
    }

    //returns true if the area is greater than 5000 square units
    public boolean isBigShape() {
        return (area > 5000);
    }
}

