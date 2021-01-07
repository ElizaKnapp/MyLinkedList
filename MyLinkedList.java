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
   if (index < 0 || index > size) {
     throw new IndexOutOfBoundsException("Index out of bounds");
   }
   Node toAdd = new Node(value);
   if (size == 0) { //empty list
     start = toAdd;
     end = toAdd;
   }
   else if (index == 0) {  //head node switch
     Node holder = new Node(start.getData()); //aka the og start
     start.setPrev(toAdd); //original start now points back to toAdd
     start = toAdd; //start becomes toAdd
     start.setNext(holder);  //next to start becomes old start
   }
   else if (index == size) { //tail node switch
     Node holder = end;
     end.setNext(toAdd);
     end = toAdd;
     end.setPrev(holder);
   }
   else {  //all other nodes
     Node theOneMovedRight = findNode(index);
     theOneMovedRight.setPrev(toAdd); //so now it has a reference to the new added ones
     Node theOneMovedLeft = findNode(index - 1);
     theOneMovedLeft.setNext(toAdd);
     toAdd.setNext(theOneMovedRight);
     toAdd.setPrev(theOneMovedLeft);
   }
   size++;
 }

 public String get(int index) {
   if (index < 0 || index >= size) {
     throw new IndexOutOfBoundsException("Index out of bounds");
   }
   Node found = findNode(index);
   return found.getData();
 }

 public String set(int index, String value) {
   if (index < 0 || index >= size) {
     throw new IndexOutOfBoundsException("Index out of bounds");
   }
   Node replaced = findNode(index);
   String holder = replaced.getData();
   replaced.setData(value);
   return holder;
 }

 public String toString() {
   String outline = "[";
   Node travel = start;
   for (int i = 0; i < size; i++) {
     if (i == size - 1) outline += travel.getData();
     else outline += travel.getData() + ", ";
     travel = travel.getNext();
   }
   return outline + "]";
 }
 //Any helper method that returns a Node object MUST BE PRIVATE!
 private Node findNode(int index) {
   //returns node at given index
   Node travel = start.getNext();
   if (index == 0) return start;
   if (index == size - 1) return end;
   else {
     int i = 1;
     while (i < index) {
       travel = travel.getNext();
       i++;
     }
     return travel;
   }
 }
}
