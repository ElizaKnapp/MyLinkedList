public class MyLinkedList {
 private int size;
 private Node start,end;

 public MyLinkedList(){
   size = 0;
 }

 public int size() {
   return size;
 }

 public boolean add(String value) {
   Node addedVal = new Node(value);
   if (size == 0) {
    start = addedVal;
    end = addedVal;
   }
   else {
     addedVal.setPrev(end);
     end.setNext(addedVal);
     end = addedVal;
   }
   size++;
   return true;
 }

 public void add(int index, String value) {

 }

 public String get(int index);
 public String set(int index, String value);
 public String toString();
 //Any helper method that returns a Node object MUST BE PRIVATE!
 private Node findNode(int index) {
   //returns node at given index
   Node travel = start.getNext();
   if (index == 0) return start;
   if (index == size) return end;
   else {
     Node holder = travel.getNext();
     int i = 1;
     while (i <= index) {
       holder = travel.getNext();
       travel = holder;
       i++;
     }
     return travel;
   }
 }

}
