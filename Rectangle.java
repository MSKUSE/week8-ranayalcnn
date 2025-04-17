import java.util.Objects;

public class Rectangle extends Shape {
    private  int sideA=0,sideB=0;

    public Rectangle(int sideA, int sideB) {

        this.sideA = sideA;
        this.sideB = sideB;
    }

    public Rectangle(String color, int sideA, int sideB) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public void describe() {
        super.describe();
        System.out.println("side a is " + sideA + "side b is" + sideB);
    }

    @Override
    public boolean equals(Object obj) {
        Rectangle r=(Rectangle) obj;
        if(this.sideA==r.sideA && this.sideB==r.sideB && this.color==r.color){
            return true;
        }
        else{
            return false;
        }
        //return super.equals(obj);
    }


     /*
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return sideA == rectangle.sideA && sideB == rectangle.sideB;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sideA, sideB);
    }

      */
}