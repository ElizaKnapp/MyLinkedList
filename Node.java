public class Node {
  private String data;
  private Node next, prev;

  public Node(String value){
    data = value;
  }

  public String getData() {
    return data;
  }
  public String setData(String value) {
    temp = data;
    data = value;
    return temp;
  }

  public String getNext() {
    return next;
  }
  public String setNext(String value) { //returns the removed value
    temp = next;
    next = value;
    return temp;
  }

  public String getPrev() {
    return prev;
  }
  public String setPrev(String value) { //returns the removed value
    temp = prev;
    prev = value;
    return temp;
  }
  //write get/set methods for all three instance variables.
}
