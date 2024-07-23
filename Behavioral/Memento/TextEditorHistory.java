import java.util.ArrayList;
import java.util.List;

public class TextEditorHistory {
    private List<Memento> mementoList = new ArrayList<Memento>();

    public void save(Memento memento) {
        mementoList.add(memento);
    }

    public Memento undo() {
        if (mementoList.size() >0) {
            Memento mem =  mementoList.get(mementoList.size()-1);
            mementoList.remove(mementoList.size()-1);
            return mem;
        } 
        return null;
    }
}


