

public class LinkedList{

  private Node head;
  private Node tail;
  private int size = 0;

  class Node {
    private Object data;
    private Node next;

    public Node(Object input){
      this.data = input;
      this.next = null;
    }

    public String toString(){
      return String.valueOf(this.data);
    }

  }

  // Insert first Node
  public void addFirst(Object input) {
    Node newNode = new Node(input);
    newNode.next = head;
    head = newNode;
    if(size == 0){
      tail = head;
    }
    size++;
  }

  //Insert last Node
  public void addLast(Object input) {
    Node newNode = new Node(input);
    if(size == 0) {
      addFirst(input);
    }
    tail.next = newNode;
    tail = newNode;
    size++;
  }

  //Find Node
  Node find(int idx) {
    Node x = head;
    for(int i=0;i<idx;i++){
      x = x.next;
    }
    return x;
  }
  
  //Insert in the middle Node
  public void insert(int index,Object input) {
    if(size == 0){
      addFirst(input);
    } else if(size == index) {
      addLast(input);
    } else {
      Node beforeNode = find(index-1);
      Node afterNode = find(index);
      Node newNode = new Node(input);
      beforeNode.next = newNode;
      newNode.next = afterNode;
      size++;
    }
  }

  // Print toString
  public String toString(){
    String result = "[";
    Node x = head;
    for(int i=0 ; i<size-1 ; i++) {
      result += x.data;
      result += ",";
      x = x.next;
    }
    result += x.data;
    result += "]";
    return result;
  }

  // Remove FirstNode
  public void removeFirst() {
    Node temp = head;
    head = temp.next;
    temp = null;
    size--;
  }

  // Remove Middle of Node
  public void removeMiddle(int index) {
    if(index == 0) {
      removeFirst();
    }
    Node frontNode = find(index-1);
    Node removeNode = frontNode.next;
    frontNode.next = removeNode.next;
    removeNode = null;
    size--;
    if(index == size-1) {
      tail = frontNode;
    }
  }

  // return LinkedList size
  public int size() {
    return size;
  }

}