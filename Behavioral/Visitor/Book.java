public class Book implements ItemElement{

    private int price;
    private String isbn;

    
    public Book(int price, String isbn) {
        this.price = price;
        this.isbn = isbn;
    }


    public int getPrice() {
        return price;
    }


    public String getIsbn() {
        return isbn;
    }


    @Override
    public void accept(Visitor visitor) {
       visitor.visit(this);
    }

}
