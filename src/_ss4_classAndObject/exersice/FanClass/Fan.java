package _ss4_classAndObject.exersice.FanClass;

public class Fan {
    public String slow = "slow";
    public String medium = "medium";
    public String fast = "fast";
    public int num;
    private boolean status;
    private int speed;
    private double radius;
    private String color = "blue";

    public String getSlow() {
        return slow;
    }

    public int getNum() {
        return num;
    }



    public void fan(){
        this.status = false;

    };

    public void setSlow(String slow) {
        this.slow = slow;
    }

    public boolean isStatus() {
        return status;
    }

    public Fan(boolean status, int speed, double radius, String color) {
        this.status = status;
        this.speed = speed;
        this.radius = radius;
        this.color = color;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
        if (speed == 1){
            setSlow(slow);
        }else if (speed == 2){
            setSlow(medium);
        }else if (speed == 3){
            setSlow(fast);
        }else {
            setStatus(false);
        }
    }

    public String getSpeed() {
        return getSlow();
    }



    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Fan() {
        status = false;
    }

    public double getRadius() {
        return radius = 5;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
