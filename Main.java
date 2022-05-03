import Arrays.*;
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
    }
}