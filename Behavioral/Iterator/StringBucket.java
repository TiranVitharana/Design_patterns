import java.util.ArrayList;
import java.util.List;

public class StringBucket implements Container{
    private List<String> arrayList;
    private int count;

    public StringBucket() {
        this.arrayList =  new ArrayList<String>();
        this.count = 0;
    }

    public void store(String element) {
        arrayList.add(element);
        count++;
        System.out.println("Word inserted");
    }

    public List<String> getArrayList() {
        return arrayList;
    }

    
    public Iterator getIterator() {
        return new BucketIterator();
    }

    public int getCount() {
        return count;
    }


    private class BucketIterator implements Iterator{
        private int idx;
        
    
        public BucketIterator() {
          
            this.idx = 0;
        }
        public boolean hasNext() {
            return count>idx;
                
          
            
        }
    
        public Object getNext() {
            return arrayList.get(idx++);
            
        }
    }
}
