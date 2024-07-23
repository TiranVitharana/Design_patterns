public class Director {
    private CarBuilder builder;

    public Director(CarBuilder builder) {
        this.builder = builder;
    }

    public void constructSportCar() {
        builder.buildEngine();
        builder.buildWheels();
        builder.buildBody();
    }

    public void constructLuxuryCar() {
        builder.buildEngine();
        builder.buildWheels();
        builder.buildBody();
    }
}
