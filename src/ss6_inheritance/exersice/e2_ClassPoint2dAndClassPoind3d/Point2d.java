package ss6_inheritance.exersice.e2_ClassPoint2dAndClassPoind3d;

import java.util.Arrays;

public class Point2d {
    private float x = 0;
    private float y = 0;

    public Point2d(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY() {
        return new float[]{getX(), getY()};
    }


    Point2d() {
    }

    @Override
    public String toString() {
        return "Point2d{" +
                "x=" + x +
                ", y=" + y +
                ", arr=" + Arrays.toString(getXY())
               ;
    }
}
