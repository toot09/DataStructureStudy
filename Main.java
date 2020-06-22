import java.util.*;

class Main {
  public static void main(String[] args) {
    
    LinkedList numbers = new LinkedList();

    numbers.addFirst(10);
    numbers.addLast(30);
    numbers.insert(1,20);
    numbers.insert(1,21);
    numbers.insert(1,22);
    System.out.println(numbers);
    numbers.removeFirst();
    System.out.println(numbers);
    numbers.removeMiddle(3);
    System.out.println(numbers);
    System.out.println(numbers.indexOf(20));

    LinkedList.ListIterator it = numbers.listIterator();
    while(it.hasNext()) {
      int test = (int)it.next();
      System.out.println(test);
      if(test==22) {
        it.add(11);
      }
      if(test==21) {
        it.remove();
      }
    }
    System.out.println(numbers);

    /* ArrayList Practice Start!!!!

    ArrayList numbers = new ArrayList();
    numbers.addLast(1);
    numbers.addLast(2);
    //numbers.printList();
    //System.out.println("++++++++++++++++++");
    numbers.insert(1,11);
    //numbers.printList();
    //System.out.println("++++++++++++++++++");
    numbers.addFirst(0);
    //numbers.printList();
    //System.out.println(numbers);
    numbers.remove(1);
    System.out.println(numbers);
    //System.out.println(numbers.size());
    //System.out.println(numbers.indexOf(33));
    //System.out.println(numbers.indexOf(130));

    ArrayList.ListIterator li = numbers.listIterator();
    while(li.hasNext()){
      int value = (int)li.next();
      if(value == 11){
        li.insert(35);
      }
    }
    System.out.println(numbers);

    ArrayList Practice End!!! */
  }
}