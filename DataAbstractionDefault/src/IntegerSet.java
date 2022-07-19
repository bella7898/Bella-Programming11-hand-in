import java.util.ArrayList;

public class IntegerSet {
    ArrayList<Integer> nums;

    IntegerSet() {
        nums = new ArrayList<>();
    }

    //Requires: int
    //Modifies: this
    //Effects: inserts integer into set unless it's already there, in which case do nothing
    public void insert(Integer num) {
        if (!nums.contains(num)) {
            nums.add(num);
        }
    }

    //Requires: int
    //Modifies: this
    //Effects: if the integer is in the set remove it, otherwise do nothing
    public void remove(Integer num) {
        if (nums.contains(num)) {
            nums.remove(num);
        }
    }

    //Effects: returns the size of the integer set
    public int size() {
        return nums.size();
    }

    //Requires: int
    //Effects: returns true if num is in set, otherwise returns false
    public boolean contains(Integer num) {
        return nums.contains(num);
    }
}
