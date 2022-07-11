package _4_class_object.practive.p1;

public class Rectangle {
    double weigh,heigh ;
    public Rectangle(){};
    public Rectangle(double weigh, double heigh){
        this.weigh = weigh;
        this.heigh = heigh;
    }
    public double Dientich(){
        return weigh*heigh;
    }
    public double Chuvi(){
        return 2*(weigh+heigh);
    }
    public String hcn(){
        return "Rectangle{"+"rộng = " + weigh + ". cao = " + heigh + "}";
    }
}
