package Stack;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack s = new Stack();
        //Push method : add object
        s.push("A");
        s.push("B");
        s.push("C");

        //Remove top object from stack
        System.out.println(s.pop());

        //return top element from stack without removing
        System.out.println(s.peek());

        //return is stack empty or not
        System.out.println(s.empty());

        //return position of element from top position. If element not present return -1
        System.out.println(s.search("C"));
    }
}
