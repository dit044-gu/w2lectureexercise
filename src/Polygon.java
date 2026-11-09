import java.awt.*;

/*
  You can't directly call the constructors of an abstract class
  It exists mainly as a template for subclasses
 */
public abstract class Polygon implements Drawable {
    private Point centerPoint;
    private String name;

    public Polygon(Point centerPoint, String name) {
        this.centerPoint = centerPoint;
        this.name = name;
    }

    public Point getCenterPoint() {
        return centerPoint;
    }

    public String getName() {
        return name;
    }

    /* I can declare that a method should exist without implementing it */
//    public abstract void paint(Graphics g);
}
