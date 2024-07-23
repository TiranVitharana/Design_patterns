public class Main {
    public static void main(String args[]) {
        CarBuilder spbuilder = new SportCarBuilder(); 
        CarBuilder luxBuilder = new LuxaryCarBuilder();
        Director dir1 = new Director(spbuilder);
        Director dir2 = new Director(luxBuilder);

        dir1.constructSportCar();
        dir2.constructLuxuryCar();

        Car spc = spbuilder.getProduct();
        Car lxc = luxBuilder.getProduct();

        spc.showCarDetails();
        lxc.showCarDetails();

    }
}
