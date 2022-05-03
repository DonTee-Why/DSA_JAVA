import Arrays.*;
import HashMaps.*;
import java.util.Arrays;

class Main {
  public static void main(String[] args) {
    // Reverse String
    String greet = "Hello World";
    ReverseString reverseString = new ReverseString();
    ReverseString stringBuilderReverse = new ReverseString();
    
    System.out.println(reverseString.reverse(greet));
    System.out.println(stringBuilderReverse.reverseUsingStringBuilder(greet));

    // Merge sorted arrays
    int[] mergedArray = MergeSortedArrays.merge(new int[]{0,3,4,31}, new int[]{4,6,30});
    System.out.println(Arrays.toString(mergedArray));

    
    HashMap hashTable = new HashMap(5);
    hashTable.set("grapes", "1200");
    hashTable.set("apples", "100");
    hashTable.set("apple", "1500");
    hashTable.set("banana", "1600");
    hashTable.set("oranges", "1090");
    System.out.println("value for key grapes: " + hashTable.get("grapes"));
    System.out.println("value for key apples: " + hashTable.get("apples"));
    System.out.println("value for key apple: " + hashTable.get("apple"));
    System.out.println("list of keys: " + Arrays.toString(hashTable.keys()));
    }
}