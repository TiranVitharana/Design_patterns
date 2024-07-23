public class ConcreteStudent implements Student{
    private Mediator mediator;
    private String name;
    public ConcreteStudent(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
        mediator.addStudent(this);
    }
    @Override
    public void send(String message) {
       System.out.println(name + " sending " + message );
       mediator.sendMessage(message, this);
       
    }

    @Override
    public void receive(String message) {
       System.out.println(name + " recieving " + message );
    }

}
