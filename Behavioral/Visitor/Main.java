public class Main {
 public static void main(String args[]) {

    ItemElement[] items = new ItemElement[4];

    items[0] = new Book(20, "1234");
    items[1] = new Book(100, "5678");
    items[2] = new Fruit(10, 2, "Banana");
    items[3] = new Fruit(5, 5, "Apple");


    Visitor visitor = new ShoppingCartVisitor();
    for (ItemElement item : items) {
        item.accept(visitor);
    }
  
 }
}
