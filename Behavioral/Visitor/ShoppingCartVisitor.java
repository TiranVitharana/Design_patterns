public class ShoppingCartVisitor implements Visitor{

    @Override
    public void visit(Book book) {
        int cost = book.getPrice();
        System.out.println( "Book ISBN:" + book.getIsbn() + " cost = " + cost);
    }

    @Override
    public void visit(Fruit fruit) {
        int cost = fruit.getPricePerKg() * fruit.getWeight();
        System.out.println(fruit.getName() + " cost = " + cost);
    }


}
