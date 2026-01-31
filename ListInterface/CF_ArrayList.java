package ListInterface;
import java.util.ArrayList;

class Data{
    public Integer num;
    public String name;
    Data(int _num, String _name, int _revenue) {
        this.num= _num;
        this.name= _name;
    }
}

// .add- adds the element at last.
// get- returns the elements at given index.
// remove- removes and return the element at given index.
// size- length of the list.
// set- Replace element at an index.
// isEmpty- Check if list is empty.
// contains- Check if element exists.
// indexOf(x)- Find first index of an element.

public class CF_ArrayList {
    static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        System.out.println(list.isEmpty());
        list.add(10);
        list.add(5);
        list.add(98);
        list.add(1,6); // adds 6 at index 1.
        System.out.println(list);
        System.out.println(list.get(1));
        list.remove(1);
        System.out.println(list);
        System.out.println(list.size());
        list.set(1, 6);
        System.out.println(list);
        System.out.println(list.isEmpty());
        System.out.println(list.contains(3));
        System.out.println(list.indexOf(6));
        System.out.println(list.indexOf(3));
    }
}
