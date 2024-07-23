public class NumberBox implements Container{
    private int size, count;
    private int[] data;

    public int getCount() {
        return count;
    }
    
    public NumberBox(int size) {
        this.size = size;
        this.data = new int[size];
        count = 0;

    }
    public void setData(int[] data) {
        this.data = data;
    }

    public void store(int element) {
        if (count<size) {
            data[count] = element;
            count++;
            System.out.println(element + "inserted.");
        }
        else {
            System.out.println("Box is full!");
        }
    }

    public void getSize() {
        System.out.println(count);
    }

    public int[] getData() {
        return data;
    }

    public Iterator getIterator() {
        return new BoxIterator();
    }

    private class BoxIterator implements Iterator{
        private int idx;
     
    
        public BoxIterator() {
            this.idx = 0;
        }
        public boolean hasNext() {
            return  count>idx;
             
        }
    
        public Object getNext() {
    
            return data[idx++];
            
        }
    }
    
}
