package ss7_new_abstract_class_and_interface.exersice.e1_interface;

import java.util.Scanner;

public class Rectangle extends Figure implements Resizable{
    private double row;
    private double col;
    Scanner scanner = new Scanner(System.in);

    public double getRow() {
        return row;
    }

    public void setRow(double row) {
        this.row = row;
    }

    public double getCol() {
        return col;
    }

    public void setCol(double col) {
        this.col = col;
    }

    public  Rectangle() {
    }
    public Rectangle(double col,double row){
        this.col = col;
        this.row = row;
    }


    @Override
    public double getArea() {
        return col*row;
    }

    @Override
    public double getPerimeter() {
        return col*2+row*2;
    }



    @Override
    public void resize(double percent) {
        System.out.println("Old rectangle || row: "+getRow()+" || col : "+getCol()+" || Area: "+getArea()+" || Perimeter: "+getPerimeter());
        setCol(col+col/100*percent);
        setRow(row + row/100*percent);
        System.out.println("The percentage: "+percent);
        System.out.println("Rectangle changed");
        System.out.println("New rectangle || Row: "+getRow()+ " || Col: "+getCol()+" || Area: "+getArea()+" || Perimeter: "+getPerimeter());
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                " || Row:" + row +
                " || Col:" + col +
                " || Area: "+getArea()+
                " || Perimeter: "+getPerimeter()+
                '}';
    }
}
