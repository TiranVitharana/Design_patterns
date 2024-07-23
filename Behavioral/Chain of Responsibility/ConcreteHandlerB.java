public class ConcreteHandlerB extends BaseHandler{

    public void handleRequest (int request) {
        if (request > 10 && request <= 20) {
            System.out.println("Request Handled by HandlerB");
        }
        else if (this.getNextHandler() != null){
            this.getNextHandler().handleRequest(request);
        }
    }
}
