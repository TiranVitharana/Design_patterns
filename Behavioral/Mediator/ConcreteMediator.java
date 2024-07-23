import java.util.ArrayList;
import java.util.List;

public class ConcreteMediator implements Mediator{

    private List<Student> students;
    public ConcreteMediator() {
        this.students = new ArrayList<Student>();
    }


    @Override
    public void sendMessage(String message, Student student) {
        for (Student s : students) {
            if (s != student) {
                s.receive(message);
            }
        } 
        System.out.println();
    }

    @Override
    public void addStudent(Student student) {
       students.add(student);
    }
    
}
