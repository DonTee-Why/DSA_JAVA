package Arrays;

class TestArray{
  private int length;
  private int currentSize;
  private String[] data;
  
  TestArray(){
    this.length = 0;
    this.currentSize = 1;
    this.data = new String[1];
  }

  public String get(int index){
    if(index > -1 && index < currentSize){
      return data[index];
    }
    return "Index out of bounds";
  }

  public void push(String item){
    if(length == currentSize){
      String[] tempArray = new String[currentSize * 2];
      for(int i = 0; i < data.length; i++){
        tempArray[i] = data[i];
      }
      data = tempArray;
      currentSize *= 2;
    }
    data[length] = item;
    length++;
  }
  
  public void pop(){
    if(currentSize > 0){
      length--;
    }
  }

  public void delete(int index){
    if(index > 0 && index > currentSize){
      if(index == currentSize - 1){
        pop();
      }
      for(int i = index; i < currentSize - 1; i++){
        data[index] = data[index +1];
      }
      currentSize--;
    }
    System.err.print("Index out of bounds");
  }
}