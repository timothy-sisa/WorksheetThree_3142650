package griffith;

/**
 * * Name: TIMOTHY SISA
 * Student Number: 3142650
 * Represents a Right Angled Triangle, which extends Shape.
 */
public class RightAngledTriangle extends Shape {
    private double base;
    private double height;
    private double hypotenuse;

    /**
     * Constructor for Right Angled Triangle
     */
    public RightAngledTriangle(String name, double base, double height, double hypotenuse) {
        super(name);
        this.base = base;
        this.height = height;
        this.hypotenuse = hypotenuse;
    }

    @Override
    public double area() {
        return (base * height) / 2;
    }

    @Override
    public double perimeter() {
        return base + height + hypotenuse;
    }

    @Override
    public String toString() {
        return "Shape name: " + getName() + ", Base: " + base + ", Height: " + height + ", Hypotenuse: " + hypotenuse;
    }
}

