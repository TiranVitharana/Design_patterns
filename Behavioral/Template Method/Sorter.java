public abstract class Sorter {          //This is the template class
    private Object[] buffer;
    private int size;

    public Sorter(Object[] buffer, int size) {
        this.buffer = buffer;
        this.size = size;
    }

    public void swap(int a, int b) {
        Object obj = buffer[a];
        buffer[a] = buffer[b];
        buffer[b] = obj;
    }

    public abstract int compare(Object objA, Object objB);

    //skelton method
    public void sort() {
        for(int i=1; i<size; i++){
            for(int j=0; j<size-i; j++){
                if (compare(buffer[j], buffer[j+1]) > 0) {
                    swap(j, j+1);
                }
            }
        }
    }
    
}
