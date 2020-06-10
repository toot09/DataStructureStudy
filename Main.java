
class Main {
  public static void main(String[] args) {
    
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
    System.out.println(li.next());
    System.out.println(li.next());
    System.out.println(li.next());
    System.out.println(li.next());

  }
}