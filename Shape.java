public class Shape {
    private String color="white";

    public  Shape(){}

    public Shape(String color){
        this.color=color;
    }
    public double area(){
        return 0.0;
    }
    public  double perimeter(){
        return 0.0;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                '}';
    }
    public void describe(){
        System.out.println("This is a shape" + this.color);

    }
    /*
    public void setColor(String color) {
        this.color = color;
    }
    public void describe(int sideA, int sideB){
        System.out.println("Side a is " + sideA + "sideB is " + sideB);
    }
    public void describe(int sideA){
        System.out.println("side a is" + sideA);
    }
    public void describe(double sideA){
        System.out.println("Radius  is " + sideA);
    }*/
}