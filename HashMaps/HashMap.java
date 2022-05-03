package HashMaps;

import java.util.*;

public class HashMap{
  public ArrayList<KeyValuePair>[] data;
  int currentLength;

  public HashMap(int size){
    data = new ArrayList[size];
    currentLength = 0;
  }

  private int hash(String key){
    int hash = 0;
    for (int i = 0; i < key.length(); i++) {
        hash = (hash + key.codePointAt(i) * i) % data.length;
    }
    return hash;
  }

  public void set(String key, String value){
    int address = hash(key);
    System.out.println("Hash value for " + key + ": " + address);
    if (data[address] == null){
      ArrayList<KeyValuePair> arrayAddress = new ArrayList<>();
      data[address] = arrayAddress;
      currentLength++;
    }
    KeyValuePair pair = new KeyValuePair(key, value);
    data[address].add(pair);
  }

  public String get(String key){
    int address = hash(key);
    ArrayList<KeyValuePair> bucket = data[address];
    if(bucket != null){
      for(KeyValuePair pair: bucket){
        if(pair.getKey().equals(key)){
          return pair.getValue();
        }
      }
    }
    return null;
  }

  public String[] keys(){
    ArrayList<KeyValuePair>[] bucket = data;
    ArrayList<String> keys = new ArrayList<String>();
    String[] keysArray = new String[keys.size()];
    int count = 0;
    for(ArrayList<KeyValuePair> pairs : bucket){
      if(pairs != null){
          for(KeyValuePair pair : pairs){
            keys.add(pair.getKey());
            count++;
          }
      }
    }
    return keys.toArray(keysArray);
  }
  
}