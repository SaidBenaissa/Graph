/* CSE 373 
 * @Author 
 * d95wang@uw.edu, Derek Wang
 * eric95@uw.edu, Eric Eckert
 *
 * Class Priority Set extends Priority Queue. Like in a Priority Queue, elements are 
 * in sorted order. The priority set, like a set, does not allow duplicate elements.
 * This is a data structure to be used when we need a sorted list of non-repeating
 * elements.
 * 
 */


// Imports the java Priority Queue
import java.util.PriorityQueue;

public class PrioritySet<E> extends PriorityQueue<E> {
    
    // Overrides the offer method in the priority queue to ensure that no repeat
    // values can be added to the priority queue
    @Override
    public boolean offer(E e) {
        boolean added = false;
        if(!super.contains(e)) {
            added = super.offer(e);
        }
        return added;
    }
}