//this is the class that represents originator

public class TextEditor {
    private StringBuilder text;

    public TextEditor() {
        this.text = new StringBuilder();
    }
    
    public void type(String words) {
        text.append(words);
    }

    public String getText() {
        return text.toString();
    }

    public Memento save() {
        return new Memento(text.toString());
    }

    public void restore(Memento memento) {
        text = new StringBuilder(memento.getState());
    }
    
}
