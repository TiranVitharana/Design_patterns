public class ConcreteHandlerA extends BaseHandler{

    public void handleRequest (int request) {
        if (request <=10) {
            System.out.println("Request Handled by HandlerA");
        }
        else if (this.getNextHandler() != null){
            this.getNextHandler().handleRequest(request);
        }
    }
}
