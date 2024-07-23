public class SportCarBuilder implements CarBuilder{

    Car sportCar = new Car();
    @Override
    public void buildEngine() {
        sportCar.setEngine("V8");
    }

    @Override
    public void buildWheels() {
        sportCar.setWheels("Michelen");
    }

    @Override
    public void buildBody() {
        sportCar.setBody("Fiber");
    }

    @Override
    public Car getProduct() {
        return sportCar;
    }

}
