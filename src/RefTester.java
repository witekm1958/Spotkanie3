import java.awt.*;

public class RefTester {
    public static void main(String[] args) {
        Point pt1, pt2;

        pt1 = new Point(100,100); // przypisanie referencji do zmiennej pt1
        pt2 = pt1; // przypisanie referencji pt1 do zmiennej pt2
        pt1.x = 200;
        pt2.y = 200;

        System.out.println("Punkt1:" + pt1.x + "," + pt1.y);
        System.out.println("Punkt2:" + pt2.x + "," + pt2.y);
    }
}
