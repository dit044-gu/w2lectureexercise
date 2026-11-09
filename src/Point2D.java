/*
  Normally you don't want multiple classes in one file
    but for the sake of the demo it's convenient to have them
    in one place.
 */

/*
  - A Point3D counts as a special case of a Point2D
  - A Point3D has all attributes and methods that a Point2D has
 */
class Point3D extends Point2D {
    //private int x;
    //private int y;
    private int z;

    public int getZ() {
        return z;
    }

    public Point3D(int x, int y, int z) {
        /*
          When I construct a Point3D,
           because a Point3D is an extension of a Point2D
          I first need to construct one of those.

          *Every* constructor of a subclass
           *must* start with a call to a constructor of the
           superclass

          If you don't, java automatically inserts a call
            to a zero-argument constructor:

            super();
         */
        super(x,y); // delegates to the superclass' constructor
                     // to instantiate the x and y
        this.z = z;
    }
}

public class Point2D {
    private int x;
    private int y;

    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    static void main() {
        Point3D p = new Point3D(0,1,2);
        p.getX(); // this method belongs to Point3D also because we inherited it
    }
}
