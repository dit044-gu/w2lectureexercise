import java.awt.*;

public class Triangle extends Polygon {
    public Triangle(Point centerPoint, String name) {
        super(centerPoint, name);
    }

    @Override
    public void paint(Graphics g) {
        Point currentCenter = this.getCenterPoint();
        g.drawLine(currentCenter.x, currentCenter.y-10, currentCenter.x-10, currentCenter.y+10);
        g.drawLine(currentCenter.x-10, currentCenter.y+10,
                    currentCenter.x+10, currentCenter.y+10);
        g.drawLine(currentCenter.x+10, currentCenter.y+10, currentCenter.x, currentCenter.y-10);
    }
}
