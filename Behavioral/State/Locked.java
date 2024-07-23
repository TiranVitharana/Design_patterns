public class Locked implements State{
    public void pressButton(Context context) {
        System.out.println("This is lock screen");
        context.setState(new Unlocked());
    } 
}
