import java.util.Collections;
import java.util.LinkedList;
public class LinkedListClass {
    
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<Integer>();
        numbers.add(19);
        numbers.add(2);
        numbers.add(34);
        numbers.add(24);
        numbers.add(15);
        numbers.add(86);

        for (Integer i : numbers) {
            System.out.println(i);
        }

        numbers.addFirst(99);
        numbers.addLast(88);
        for (Integer i : numbers) {
            System.out.println(i);
        }
        numbers.removeFirst();
        Collections.sort(numbers, Collections.reverseOrder());
        for (Integer i : numbers) {
            System.out.print(i + " ");
        }
    }
}
