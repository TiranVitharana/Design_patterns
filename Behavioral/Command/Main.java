public class Main {
    public static void main(String args[]) {

        Light light = new Light() ;

        Command lightOn = new LightOnCommand(light);
        Command lightOff = new LightOffCommand(light);

        ReemoteController remote = new ReemoteController();

        remote.setCommand(lightOn);
        remote.pressButton();

        remote.setCommand(lightOff);
        remote.pressButton();


    }
}
