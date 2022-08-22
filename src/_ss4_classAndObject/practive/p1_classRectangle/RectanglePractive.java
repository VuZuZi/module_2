package _ss4_classAndObject.practive.p1_classRectangle;

public class RectanglePractive {
    double weightP, heightP;



    public RectanglePractive(){}
    public RectanglePractive(double weightP, double heightP) {
        this.weightP = weightP;
        this.heightP = heightP;
    }
    public double getArea(){
        return this.heightP*this.weightP;
    }
    public double getPerimeter(){
        return 2*(this.weightP+this.heightP);
    }
    public String display(){
        return "The Rectanggle have \n"+
                "Weight: "+this.weightP+" || Height: "+this.heightP+"\n"+
                "Area: "+getArea()+"\n"+
                "Perimeter: "+getPerimeter();
    }
}
