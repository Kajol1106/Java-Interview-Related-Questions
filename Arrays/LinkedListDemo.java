package Arrays;

class Node {
    int data;
    Node next;
}

public class LinkedListDemo {
    public static void main(String[] args) {
        //creating nodes
         Node head = new Node();
         Node middle = new Node();
         Node end = new Node();

         //assigning value for nodes
         head.data = 10;
         middle.data = 15;
         end.data = 59;

         //creating linked list using next as a reference
         head.next = middle;
         middle.next = end;
         end.next = null;

         //traversing and printing the list
         Node temp = head;
         while(temp != null) {
             System.out.println(temp.data);
             temp = temp.next;
         }

//        LinkedList<Integer> list = new LinkedList<>();
//        list.add(12);
//        list.add(13);
//        list.add(16);
//        System.out.println(list);
    }
}
