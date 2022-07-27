package ss6_inheritance.testTinhKeThua;

public class Employee extends Humans{
    private double tienthuong;
    private double tienphat;
//    private Object getTotal;

    public Employee(){};

    public Employee(double tienthuong, double tienphat) {
        this.tienthuong = tienthuong;
        this.tienphat = tienphat;
    }

    public Employee(String name, int age, double expen, int dateWork, double tienthuong, double tienphat) {
        super(name, age, expen, dateWork);
        this.tienthuong = tienthuong;
        this.tienphat = tienphat;
    }

    public double getTienthuong() {
        return tienthuong;
    }

    public void setTienthuong(double tienthuong) {
        this.tienthuong = tienthuong;
    }

    public double getTienphat() {
        return tienphat;
    }

    public void setTienphat(double tienphat) {
        this.tienphat = tienphat;
    }
    public double total(){
        double total;
        total = super.getExpen()*super.getDateWork()+getTienthuong()-getTienphat();
        return total;
    }
    public void getTotal(){
        System.out.println("Employee: "+getName());
        System.out.println("Tuổi: "+getAge());
        System.out.println("Tiền lương hàng ngày: " + getExpen());
        System.out.println("Số ngày làm việc: "+getDateWork());
        System.out.println("Tổng tiền thưởng: "+getTienthuong());
        System.out.println("Tổng tiền phạt: "+getTienphat());
//        System.out.println("Total: "+( (getExpen() * getDateWork()) + (getTienthuong() - getTienphat())));
        System.out.println("Total: "+total());
    }


    public static void main(String[] args) {
        Employee h1 = new Employee("Vũ",20,5,1,5,1);
        h1.getTotal();
    }
}
