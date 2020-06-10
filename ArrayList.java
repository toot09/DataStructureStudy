import java.util.*;

class ArrayList{

  private int size = 0;
  private Object[] elementation = new Object[100];

  // 객체 호출 시, String 형태로 return 하는 toString
  public String toString(){
    String str = "[";
    for(int i = 0 ; i <= size-1 ; i++){
      str += elementation[i];
      if(i<size-1){
        str += ",";  
      }
    }
    return str += "]";
  }

  // 특정 index 값 return
  public Object get(int index){
    return elementation[index];
  }

  // 제일 마지막 add
  public boolean addLast(Object element){
    elementation[size] = element;
    //System.out.println(elementation[size]);
    size++;
    return true;
  }

  // 제일 처음 add
  public boolean addFirst(Object element){
    return insert(0, element);
  }

  // 중간 insert
  public boolean insert(int index, Object element){
    for(int i = size-1 ; index <= i ; i--){  
      elementation[i+1] = elementation[i];
    }
    elementation[index] = element;
    size++;
    return true;
  }

  // index data 삭제
  public boolean remove(int index){
    for(int i = index ; i <= size - 2 ; i++){
      elementation[i] = elementation[i+1];
    }
    size--;
    elementation[size] = null;
    return true;
  }

  // 첫 데이터 삭제
  public boolean removeFirst(){
    return remove(0);
  }

  // 마지막 데이터 삭제
  public boolean removeLast(){
    return remove(size-1);
  }

  // Object의 크기
  public int size(){
    return size;
  }

  // 찾는값중 가장 빠른 index 찾기
  public Object indexOf(Object element){
    for(int i=0 ; i<=size-1 ; i++){
      if(elementation[i].equals(element)){
        return i;
      }
    }
    return -1;
  }

  // Iterator 객체 메소드
  public ListIterator listIterator(){
    return new ListIterator();
  }

  // ListIterator class 선언
  class ListIterator {
    private int listIndex = 0;
    
    // 부모객체의 elementation의 다음값
    public Object next(){
      return elementation[listIndex++];
    }

    // elementation의 다음값이 있는지 확인

  }

}