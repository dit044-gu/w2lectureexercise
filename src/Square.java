import java.awt.*;

public class Square extends Polygon {
    public Square(Point centerPoint, String name) {
        super(centerPoint, name);
    }

    @Override
    public void paint(Graphics g) {
        Point currentCenter = this.getCenterPoint();
        g.drawRect(currentCenter.x -10, currentCenter.y -10, 20, 20);
    }
}
