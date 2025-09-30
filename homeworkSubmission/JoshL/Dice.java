//This is the first problem of the homework: 
  class Point {
    private double x;
    private double y;

    // No-arg constructor
    public Point() {
        this.x = 0;
        this.y = 0;
    }

    // Constructor with arguments
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Move the point
    public void move(double dx, double dy) {
        this.x += dx;
        this.y += dy;
    }

    // Distance between two points (no Math.pow)
    public double distance(Point other) {
        double dx = this.x - other.x;
        double dy = this.y - other.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}


//This is the second problem:
class Dice {
    private int faceValue;

    // No-arg constructor
    public Dice() {
        faceValue = 1;
    }

    // Roll the dice
    public void roll() {
        faceValue = (int)(Math.random() * 6) + 1;
    }

    public int getFaceValue() {
        return faceValue;
    }
}

public class Main {
    public static void main(String[] args) {
        // --- Point test ---
        Point p1 = new Point();       // no-arg constructor
        Point p2 = new Point(3, 4);   // arg constructor

        System.out.println("Original points: " + p1 + " and " + p2);

        p1.move(2, 2);
        p2.move(-1, 1);

        System.out.println("Moved points: " + p1 + " and " + p2);
        System.out.println("Distance between points: " + p1.distance(p2));

        // --- Dice test ---
        Dice d1 = new Dice();
        Dice d2 = new Dice();

        d1.roll();
        d2.roll();

        System.out.println("Dice 1: " + d1.getFaceValue());
        System.out.println("Dice 2: " + d2.getFaceValue());
        System.out.println("Sum: " + (d1.getFaceValue() + d2.getFaceValue()));
    }
}
