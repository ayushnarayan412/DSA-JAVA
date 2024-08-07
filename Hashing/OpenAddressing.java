package Hashing;

public class OpenAddressing {
  int arr[];
  int cap, size;

  OpenAddressing(int c) {
    cap = c;
    size = 0;
    for (int i = 0; i < cap; i++) {
      arr[i] = -1;
    }
  }

  int hash(int key) {
    return key % cap;
  }

  boolean search(int key) {
    int h = hash(key);
    int i = h;
    while (arr[i] != -1) {
      if (arr[i] == key) {
        return true;
      }
      i = (i + 1) % cap;
      if (i == h) {
        return false;
      }
    }
    return false;
  }

  boolean insert(int key){
    if(size==cap) return false;
    int i=hash(key);
    while(arr[i]!=-1 && arr[i]!=-2 && arr[i]!=key){
      i=(i+1)%cap;
    }
    if(arr[i]==key) return false;
    else{
      arr[i]=key;
      size++;
      return true;
    }
  }

  boolean delete(int key){
    int h=hash(key);
    int i=h;
    while(arr[i]!=-1){
      if(arr[i]==key){
        arr[i]=-2;
      return true; 
      }
      i=(i+1)%cap;
      if(i==h){
        return false;
      }
    }
    return false;
  }

  public static void main(String[] args) {
    OpenAddressing hash = new OpenAddressing(7);
    hash.insert(49);
    hash.insert(50);
    hash.insert(63);
    hash.insert(64);
    hash.insert(68);
    hash.insert(69);
    hash.insert(70);
    hash.insert(77);
    System.out.println(hash.search(77));
  }
}