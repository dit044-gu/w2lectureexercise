import javax.swing.*;
import java.awt.*;
import java.util.*;

public class DrawPolygons extends Component {
    private ArrayList<Drawable> polygons;

    public DrawPolygons() {
        polygons = new ArrayList<>(10);

        this.polygons.add(new Square(new Point(100,100), "square"));
        this.polygons.add(new Triangle(new Point(150,150), "triangle"));
        this.polygons.add(new Rectangle(new Point(100,200), "rectangle"));
    }

    @Override
    public void paint(Graphics g) {
        /*
          This loop follows the DIP by
           depending on the *abstraction* called Polygon,
           not on the concrete subclasses of Polygon
         */
        for (int i = 0; i < polygons.size(); i++) {
            polygons.get(i).paint(g);
        }
    }

    static void main() {
        JFrame frame = new JFrame();
        DrawPolygons polygons = new DrawPolygons();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(30,30,300,300);
        frame.add(polygons);
        frame.setVisible(true);
    }
}