package ss6_inheritance.exersice.e2_ClassPoint2dAndClassPoind3d;

public class Point3d extends Point2d {
    private float z = 0;

    public Point3d() {
    }

    ;

    public Point3d(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        super.setX(x);
        super.setY(y);
        this.z = z;
    }

    public float[] getXYZ() {
        return new float[]{super.getX(), super.getY(), z};
    }

    @Override
    public String toString() {
        return "Point3d{" +
                "x=" + super.getX() +
                ", y=" + super.getY() +
                ", z=" + z +
                '}';
    }
}
