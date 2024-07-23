public class Main {
    public static void main(String args[]) {
        ConcreteHandlerA handlerA = new ConcreteHandlerA();
        ConcreteHandlerB handlerB = new ConcreteHandlerB();
        ConcreteHandlerC handlerC = new ConcreteHandlerC();

        handlerA.setNextHandler(handlerB);
        handlerB.setNextHandler(handlerC);

        handlerA.handleRequest(15);

    }
}
