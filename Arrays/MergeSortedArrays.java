package Arrays;

public class MergeSortedArrays{

  MergeSortedArrays(){
    
  }
  
  public static int[] merge(int[] firstArray, int[] secondArray){
    int mergedArrayLength = firstArray.length + secondArray.length;
    int[] mergedArray = new int[mergedArrayLength];
    int i = 0, j = 0, k = 0;
    
    while(i < firstArray.length && j < secondArray.length){
      if(firstArray[i] < secondArray[j]){
        mergedArray[k] = firstArray[i];
        i++;
      }else{
        mergedArray[k] = secondArray[j];
        j++;
      }
      k++;
    }

    while(i < firstArray.length){
      mergedArray[k] = firstArray[i];
      i++;
      k++;
    }
    
    while(j < secondArray.length){
      mergedArray[k] = secondArray[i];
      i++;
      k++;
    }
    
    return mergedArray;
  }
}