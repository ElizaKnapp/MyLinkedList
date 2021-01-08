public class ETester {
  public static void main(String[] args) {

    /*
    MyLinkedList words = new MyLinkedList();

    //add 0-9 in order
    for(int i = 0; i < 10; i++){
      words.add(i+"");
    }
    //insert 0x - 9x before each value 0-9
    for(int i = 0; i < 10; i++){
      words.add(2*i,i+"x");
    }
    //check the head/tail add
    words.add(0,"head");
    words.add(words.size(),"tail");

    try{
      words.add(-1,"");
      System.out.println("ERROR! Added to negative index");
    }catch(IndexOutOfBoundsException e){

    }

    try{
      words.add(words.size()+1,"");
      System.out.println("ERROR! Added to (size + 1) index");
    }catch(IndexOutOfBoundsException e){

    }

    System.out.println("Your result:\n"+words+" "+words.size());
    System.out.println("expected:\n[head, 0x, 0, 1x, 1, 2x, 2, 3x, 3, 4x, 4, 5x, 5, 6x, 6, 7x, 7, 8x, 8, 9x, 9, tail] 22");
    System.out.println("\nYour result:\n"+words.toStringReversed()+" "+words.size());
    System.out.println("expected:\n[tail, 9, 9x, 8, 8x, 7, 7x, 6, 6x, 5, 5x, 4, 4x, 3, 3x, 2, 2x, 1, 1x, 0, 0x, head] 22");

    //Specific Edge Cases on add:
    MyLinkedList tester = new MyLinkedList();
    tester.add("hello");
    tester.add(0, "first");
    tester.add(2, "last");
    System.out.println(tester.toString());

    */

    //testing extend
      //size = 0

      /*
      MyLinkedList size0 = new MyLinkedList();
        //case other.size == 0
        MyLinkedList size0T = new MyLinkedList();
        size0.extend(size0T);
        System.out.println("both below should be empty");
        System.out.println(size0.toString());
        System.out.println(size0T.toString());
        // case other.size = 1
        MyLinkedList size1T = new MyLinkedList();
        size1T.add("element1");
        size0.extend(size1T);
        System.out.println("1- element 2- empty");
        System.out.println(size0.toString());
        System.out.println(size1T.toString());
        // case other.size = 2
        MyLinkedList size2T = new MyLinkedList();
        size2T.add("element1");
        size2T.add("element2");
        size0.remove(0);
        size0.extend(size2T);
        System.out.println("1- element 1 and 2");
        System.out.println(size0.toString());
        System.out.println(size2T.toString());
        // case other.size = 2
        MyLinkedList size3T = new MyLinkedList();
        size3T.add("element1");
        size3T.add("element2");
        size3T.add("element3");
        size0.remove(0);
        size0.remove(0);
        size0.extend(size3T);
        System.out.println("1- element 1 and 2 and 3");
        System.out.println(size0.toString());
        System.out.println(size3T.toString());

        */
      MyLinkedList size3 = new MyLinkedList();
      size3.add("1");
      size3.add("2");
      size3.add("3");
      //case other.size == 0
      MyLinkedList size0T = new MyLinkedList();
      size3.extend(size0T);
      System.out.println("3 and 0");
      System.out.println(size3.toString());
      System.out.println(size0T.toString());
      // case other.size = 1
      MyLinkedList size1T = new MyLinkedList();
      size1T.add("4");
      size3.extend(size1T);
      System.out.println("4 and 0");
      System.out.println(size3.toString());
      System.out.println(size1T.toString());
      // case other.size = 2
      MyLinkedList size2T = new MyLinkedList();
      size2T.add("5");
      size3.extend(size2T);
      System.out.println("5 and 0");
      System.out.println(size3.toString());
      System.out.println(size2T.toString());
      // case other.size = 2
      MyLinkedList size3T = new MyLinkedList();
      size3T.add("6");
      size3.extend(size3T);
      System.out.println("6 and 0");
      System.out.println(size3.toString());
      System.out.println(size3T.toString());




















  }
}
