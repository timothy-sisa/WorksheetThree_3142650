package griffith;

/**
 * Name: TIMOTHY SISA
 * Student Number: 3142650
 * 
 * This class represents a Circle shape.
 * It extends the abstract Shape class and implements area and perimeter calculations.
 */
public class Circle extends Shape {
    private double radius;
    
    /**
     * Constructor for Circle
     * @param name The name of the circle
     * @param radius The radius of the circle
     */
    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }
    
    /**
     * Gets the radius of the circle
     * @return The radius of the circle
     */
    public double getRadius() {
        return radius;
    }
    
    /**
     * Sets the radius of the circle
     * @param radius The new radius for the circle
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    /**
     * Calculates the area of the circle using the formula π * r²
     * @return The area of the circle
     */
    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }
    
    /**
     * Calculates the perimeter (circumference) of the circle using the formula 2 * π * r
     * @return The perimeter of the circle
     */
    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
    
    /**
     * Returns a string representation of the circle
     * @return A string containing the circle's name and radius
     */
    @Override
    
    public String toString() {
        return "Shape name: " + getName() + ", Radius: " + radius;
    }

}
