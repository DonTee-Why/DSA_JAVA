package Arrays;

public class ReverseString{

  // Using String Class
  public String reverse(String string){
    String reverse = "";
    for(int i = string.length() - 1; i >= 0; i--){
      reverse += string.charAt(i);
    }
    return reverse;
  }

  // Using StringBuilder Class
  public String reverseUsingStringBuilder(String string){
    StringBuilder reverse = new StringBuilder();
    for(int i = string.length() - 1; i >= 0; i--){
      reverse.append(string.charAt(i));
    }
    return reverse.toString();
  }

}