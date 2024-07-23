public class Rectangle extends Shape{
    private int width;
    private int height;
    
    
    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public Rectangle(Rectangle source) {
        super(source);
        this.width = source.width;
        this.height = source.height;
    }

    public Rectangle(int width, int height, String color) {
        super(width, height, color);
    
    }

    public Shape clone () {
        return new Rectangle(this);
    }

    
}
