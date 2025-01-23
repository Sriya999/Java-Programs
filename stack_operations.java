import java.util.*;//collections framework importing stack class
class stack_operations{
    public static void main(String[] args) {
        //push, pop, peek, empty, and search.
        Stack<Integer>s=new Stack<>();
        //push operation
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println("Stack before operations: "+s);
        //pop operation
        System.out.println("Pop element: "+s.pop()); 
        //top-peek element in stack  
        System.out.println("Peek Element:"+s.peek());  
        //search element 
        System.out.println("search Element found at  index: "+s.search(1));
         
        //empty
        System.out.println("is Empty: "+s.isEmpty());
        System.out.println("Stack: "+s); 
        

    }
}