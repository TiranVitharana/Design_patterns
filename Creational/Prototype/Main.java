public class Main {
    public static void main (String args[]) {
        Shape rect1 = new Rectangle(2,4,"Black");
        Shape rectClone = rect1.clone();
        System.out.println(rect1.equals(rectClone));
        System.out.println(rectClone.getX());
        System.out.println(rectClone.getY());
        System.out.println(rectClone.getColor());


        Shape cir1 = new Circle(6,6,"White");
        Shape cirClone = cir1.clone();
        System.out.println(cir1.equals(cirClone));
        System.out.println(cirClone.getX());
        System.out.println(cirClone.getY());
        System.out.println(cirClone.getColor());
    }
}
