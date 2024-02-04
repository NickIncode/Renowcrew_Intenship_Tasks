public class Cuboid extends Rectangle {
    private double height;

    public Cuboid(double length, double width, double height) {
        super(length, width);
        this.height = height;
    }

    // Getter and setter method for height
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // Method to calculate the volume of the cuboid
    public double calculateVolume() {
        return super.calculateArea() * height;
    }
}
