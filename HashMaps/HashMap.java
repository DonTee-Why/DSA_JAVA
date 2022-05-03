package HashMaps;

import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;

class HashMap{
  private ArrayList<KeyValuePair>[] data;
  int currentLength;

  HashMap(int size){
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
    ArrayList<KeyValuePair>[] pair = data;
    String[] keys = new String[currentLength];
    
    return keys;
  }
  
}