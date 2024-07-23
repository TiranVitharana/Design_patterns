public class ShippingContainer {    //This is the helper class with common methods
    private String id;
    private double weight;
    private String destport;
    private int deadline;


    

    public ShippingContainer(String id, double weight, String destport, int deadline) {
        this.id = id;
        this.weight = weight;
        this.destport = destport;
        this.deadline = deadline;
    }
    public String getId() {
        return id;
    }
    public double getWeight() {
        return weight;
    }
    public String getDestport() {
        return destport;
    }
    public int getDeadline() {
        return deadline;
    }

    public void show() {
        System.out.println("["+id+"] "+weight+" KG TO:"+destport+" IN "+deadline+ " DAYS");
    }
    
}
