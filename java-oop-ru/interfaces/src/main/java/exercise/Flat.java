package exercise;

// BEGIN
public class Flat implements Home {
    private final double area;
    private final double balconyArea;
    private final int floor;

    public Flat(double area, int floor, double balconyArea) {
        this.area = area;
        this.floor = floor;
        this.balconyArea = balconyArea;
    }

    @Override
    public double getArea() {
        return area + balconyArea;
    }

    @Override
    public String toString() {
        return String.format("Квартира площадью %.1f метров на %d этаже", getArea(), floor);
    }

    @Override
    public int compareTo(Home another) {
        double thisArea = this.getArea();
        double anotherArea = another.getArea();

        if (thisArea > anotherArea) {
            return 1;
        } else if (thisArea < anotherArea) {
            return -1;
        } else {
            return 0;
        }
    }
}
// END
