import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StackImpl implements Stack{

    public static Logger LOGGER = Logger.getLogger(StackImpl.class.getName());

    private List<Integer> list = new ArrayList<Integer>();
    private int top = 0;

    @Override
    public void push(int i) {
        LOGGER.log(Level.INFO, String.format("method push. top = %d", top));
        list.add(top, i);
        top++;
    }

    @Override
    public int pop() {
        top--;
        LOGGER.log(Level.INFO, String.format("method pop. top = %d", top));
        int element = list.get(top);
        list.remove(top);

        return element;
    }

    @Override
    public boolean empty() {
        return list.isEmpty();
    }

    @Override
    public int size() {
        return top;
    }
}
