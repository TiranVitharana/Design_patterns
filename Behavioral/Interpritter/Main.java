public class Main {
    public static void main(String args[]) {
        Expression exp1 = new Add(new Number(5), new Number(10));
        Expression exp2 = new Add(new Number(2), new Number(3));

        Expression result = new Subtract(exp1, exp2);
        System.out.println(result.interprit());
    }
}
