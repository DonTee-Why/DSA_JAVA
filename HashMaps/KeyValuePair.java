package HashMaps;


class KeyValuePair{
  private String key;
  private String value;

  KeyValuePair(String key, String value){
    this.key = key;
    this.value = value;
  }

  public String getKey(){
    return this.key;
  }

  public String getValue(){
    return this.value;
  }
}