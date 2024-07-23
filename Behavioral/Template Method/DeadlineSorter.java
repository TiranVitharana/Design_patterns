public class DeadlineSorter extends Sorter{

    public DeadlineSorter(Object[] buffer, int size) {
        super(buffer, size);

    }
    @Override
    public int compare(Object objA, Object objB) {
        ShippingContainer scA, scB;

        scA = (ShippingContainer) objA;
        scB = (ShippingContainer) objB;

        if (scA.getDeadline()>scB.getDeadline()) {
            return 1;
        }
        else if (scA.getDeadline()<scB.getDeadline()) {
            return -1;
        } 
        else {
            return 0;
        } 
    }
    
}
