class Circle extends Shape{
    
    
    public Circle(Circle source) {
        super(source);
    }

    public Circle(int x, int y, String color) {
        super(x, y, color);
        
    }

    public Shape clone () {
        return new Circle(this);
    }

}
