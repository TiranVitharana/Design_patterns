public class LuxaryCarBuilder implements CarBuilder{

    Car luxuryCar = new Car();
    @Override
    public void buildEngine() {
        luxuryCar.setEngine("Petrol");
    }

    @Override
    public void buildWheels() {
        luxuryCar.setWheels("Fiat");
    }

    @Override
    public void buildBody() {
        luxuryCar.setBody("Metal");
    }

    @Override
    public Car getProduct() {
        return luxuryCar;
    }

}
