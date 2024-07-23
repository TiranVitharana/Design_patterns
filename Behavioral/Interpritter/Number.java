public class Number implements Expression{
    private int number;

    public Number(int number) {
        this.number = number;
    }

    @Override
    public int interprit() {
        return this.number;
    }
    
}
