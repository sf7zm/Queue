import java.util.Deque;
public class DequeAdapter {
    private Deque<Integer> dq;

    public DequeAdapter(Deque<Integer> d){
        dq = d;
    }
    public void wrapHalf() {
        int size = dq.size();
        for (int i = 0; i < size / 2; i++) 
            dq.addFirst(dq.removeLast());
    }
}
