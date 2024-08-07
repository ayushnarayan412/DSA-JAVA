package Hashing;

import java.util.*;

public class myHashChaining {
  int bucket;
  ArrayList<LinkedList<Integer>> table;

  myHashChaining(int b) {
    bucket = b;
    table = new ArrayList<LinkedList<Integer>>();
    for (int i = 0; i < b; i++) {
      table.add(new LinkedList<Integer>());
    }
  }

  void insert(int key) {
    int i = key % bucket;
    table.get(i).add(key);
  }

  void remove(int key) {
    int i = key % bucket;
    table.get(i).remove((Integer) i);
  }

  boolean search(int key) {
    int i = key % bucket;
    return table.get(i).contains(key);
  }

  public static void main(String[] args) {
    myHashChaining hash = new myHashChaining(7);
    hash.insert(70);
    hash.insert(56);
    hash.insert(71);
    hash.insert(9);
    hash.insert(72);
    System.out.println(hash.search(7));
  }

}
