public class Main {
    public static void main(String args[]) {
        Logistics carLogistics = new CarLogistics();
        carLogistics.planDelivery();

        Logistics bikeLogistics = new BikeLogistics();
        bikeLogistics.planDelivery();
    }
}
