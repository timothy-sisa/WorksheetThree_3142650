package griffith;

/**
 * Name: TIMOTHY SISA
 * Student Number: 3142650
 * This is an abstract class representing a geometric shape.
 * It provides common properties and methods for all shapes.
 */
public abstract class Shape {
    private String name;
    
    /**
     * Constructor for Shape
     * @param name The name of the shape
     */
    public Shape(String name) {
        this.name = name;
    }
    
    /**
     * Gets the name of the shape
     * @return The name of the shape
     */
    public String getName() {
        return name;
    }
    
    /**
     * Sets the name of the shape
     * @param name The new name for the shape
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * Abstract method to calculate the area of the shape
     * @return The area of the shape
     */
    public abstract double area();
    
    /**
     * Abstract method to calculate the perimeter of the shape
     * @return The perimeter of the shape
     */
    public abstract double perimeter();
    
    /**
     * Returns a string representation of the shape
     * @return A string containing the shape's name
     */
    @Override
    public String toString() {
        return "Shape: " + name;
    }
}
