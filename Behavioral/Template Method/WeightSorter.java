public class WeightSorter extends Sorter{

    public WeightSorter(Object[] buffer, int size) {
        super(buffer, size);

    }
    @Override
    public int compare(Object objA, Object objB) {
        ShippingContainer scA, scB;

        scA = (ShippingContainer) objA;
        scB = (ShippingContainer) objB;

        if (scA.getWeight()>scB.getWeight()) {
            return 1;
        }
        else if (scA.getWeight()<scB.getWeight()) {
            return -1;
        } 
        else {
            return 0;
        } 
    }
    
    
}
