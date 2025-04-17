public class testShape {
    public static void main(String[] args){
        Shape square=new Shape("blue");
        Rectangle r1 =new Rectangle("white",3,4);
        Rectangle r2 =new Rectangle("blue",3,4);
        square.describe();
        System.out.println(r1.equals(r1.getColor()));
        System.out.println(r1.equals(r2));
    }
}