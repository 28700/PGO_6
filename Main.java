import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

interface Figure{
    abstract double getPerimeter();

    abstract double getArea();

    abstract String getType();
}
class Circle implements Figure{

    double radius;

    Circle(double r){
        radius = r;
    }



    @Override
    public double getPerimeter() {
        return 2*Math.PI*radius;
    }

    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }

    @Override
    public String getType() {
        return  "Circle";
    }
}

class Parallelogram implements Figure{

    double height, side, baseSide;

    Parallelogram(double bs,double s,double h){
        height = h;
        side = s;
        baseSide = bs;
    }

    @Override
    public double getPerimeter() {
        return 2*side + 2*baseSide;
    }

    @Override
    public double getArea() {
        return baseSide*height;
    }

    @Override
    public String getType() {
        return "Parallelogram";
    }
}

class Rectangle implements Figure{

    double sideA, sideB;

    Rectangle(double a,double b){
        sideA = a;
        sideB = b;
    }

    @Override
    public double getPerimeter() {
        return 2*sideA + 2*sideB;
    }

    @Override
    public double getArea() {
        return sideA*sideB;
    }

    @Override
    public String getType() {
        return "Rectangle";
    }
}

public class Main {
    public static void main(String[] args) {
        double radius = 3d;
        Figure circle = new Circle(radius);
        double baseSide = 10d;
        double side = 5d;
        double height = 8d;
        Figure parallelogram = new Parallelogram(baseSide, side, height);
        double sideA = 15d;
        double sideB = 10;
        Figure rectangle = new Rectangle(sideA, sideB);
        List<Figure> figures = new ArrayList<>(3);
        figures.add(circle);
        figures.add(parallelogram);
        figures.add(rectangle);
        for (Figure figure : figures) {
            System.out.println(figure.getType());
            System.out.println("Area: " + figure.getArea() + " units.");
            System.out.println("Perimeter: " + figure.getPerimeter() + " units.\n");
        }
    }
}