/*
Braulio Carrion
Ms. Krasteva
04/15/19
This program runs a search method. The method passes an array and the number
that needs to be searched in its parameters.
If the array is empty then the number isnt found
if the last value in the array is the number then its true
else the last number is removed and the method is called again with a smaller
array size, eliminating the last value that was check
*/
import java.util.*;

public class Searching {
    ArrayList<Integer> numArr;

    public Searching() {
        numArr = new ArrayList<Integer>();
        numArr.add(2);
        numArr.add(5);
        numArr.add(1);
    }

    public boolean searchItem(ArrayList arr, int num) {
        if (arr.isEmpty()) {
            return false;
        }
        if ((int) arr.get(arr.size()-1) == num) {
            return true;
        } else {
            arr.remove(arr.size()-1);
            return searchItem(arr, num);
        }
    }

    public static void main(String[] args) {
        Searching s = new Searching();
        System.out.println("Status: " + s.searchItem(s.numArr, 5));
    }
}
