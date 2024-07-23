public class Main {
    public static void main(String args[]) {
        TextEditor editor = new TextEditor();
        TextEditorHistory history = new TextEditorHistory();


        editor.type("Hello there!");
        history.save(editor.save());


        editor.type("I'm Tiran");
        history.save(editor.save());

        editor.type("Nice to see you");
        history.save(editor.save());


        System.out.println("Current Text: " + editor.getText());

        editor.restore(history.undo());
        System.out.println("After undo: " + editor.getText());

        editor.restore(history.undo());
        System.out.println("After second undo: " + editor.getText());

        editor.restore(history.undo());
        System.out.println("After third undo: " + editor.getText());
    }
}
