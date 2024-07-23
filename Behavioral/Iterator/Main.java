public class Main {
    public static void main(String args[]) {

        NumberBox nbox = new NumberBox(10);
        nbox.store(1); nbox.store(3); nbox.store(5);
        nbox.store(6); nbox.store(8); nbox.store(10);
        nbox.store(12); nbox.store(13);
        nbox.store(112); nbox.store(135);

        Iterator iter = nbox.getIterator();
        while(iter.hasNext()) {
        System.out.println(iter.getNext());
        }
        System.out.println(nbox.getCount());


        StringBucket sbin = new StringBucket();

        sbin.store("apple"); sbin.store("hp"); sbin.store("asus");
        sbin.store("dell"); sbin.store("acer"); sbin.store("lenovo");
        sbin.store("ewis"); sbin.store("toshiba");

        
        Iterator iter2 = sbin.getIterator();
        while(iter2.hasNext()) {
        System.out.println(iter2.getNext());
        }
        System.out.println(sbin.getCount());
    } 
}
