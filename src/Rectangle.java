import java.awt.*;

public class Rectangle extends Polygon {
    public Rectangle(Point centerPoint, String name) {
        super(centerPoint, name);
    }

    @Override
    public void paint(Graphics g) {
        Point currentCenter = this.getCenterPoint();
        g.drawRect(currentCenter.x -20, currentCenter.y -10, 40, 20);
    }
}
