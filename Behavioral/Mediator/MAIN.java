public class MAIN {
    public static void main (String args[]) {
        Mediator mediator = new ConcreteMediator();
        Student student1 = new ConcreteStudent(mediator, "Malik");
        Student student2 = new ConcreteStudent(mediator, "Chamindu");
        Student student3 = new ConcreteStudent(mediator, "Tiran");
        Student student4 = new ConcreteStudent(mediator, "Tanisha");


        student1.send("Cod gahanawada?");
        student2.send("Pissuda ubata dan ba");
        student3.send("Match 2k gahala nawattamu");
        student4.send("Cod delete una bn");
    }

    
}
