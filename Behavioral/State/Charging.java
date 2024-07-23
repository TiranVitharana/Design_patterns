public class Charging implements State{
    public void pressButton(Context context) {
        System.out.println("Phone is charging");
        context.setState(new Locked());
        
    } 
}
