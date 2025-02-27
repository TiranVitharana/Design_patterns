abstract class Shape {

    private int x;
    private int y;
    private String color;
    public abstract Shape clone();

    public Shape(int x, int y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getColor() {
        return color;
    }

    public Shape (Shape source) {
        this.x = source.x;
        this.y = source.y;
        this.color = source.color;
    }

    

}
