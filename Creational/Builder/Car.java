public class Car {
    private String engine;
    private String wheels;
    private String body;


    public void setEngine(String engine) {
        this.engine = engine;
    }
    public void setWheels(String wheels) {
        this.wheels = wheels;
    }
    public void setBody(String body) {
        this.body = body;
    }

    public void showCarDetails() {
        System.out.println("Car Details : \n" + "engine : " + this.engine + "\n" + "wheels : " + this.wheels + "\n" + "body : " + this.body + "\n" );
    }
}
