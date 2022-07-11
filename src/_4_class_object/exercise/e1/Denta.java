package _4_class_object.exercise.e1;

public class Denta {
        double a,b,c;
        public Denta(){};
        public Denta (double a, double b, double c){
            this.a = a;
            this.b = b;
            this.c = c;
        }
        double delta = b*b-4*a*c;
        public double getRot1(){
            return (-b-Math.sqrt(delta))/(2*a);
        }
        public double getRot2(){
            return (Math.sqrt(delta));
        }
}
