package Stack;


class MyStack{
    private int[] arr;
    private int top;
    private int capacity;
    public MyStack(int size){
       arr = new int[size];
       capacity = size;
       top = -1;
    }
    public void push(int x) {
        // Your code here
        // Check if stack is full
        //if(arr.length > capacity){
         //   return;
        //}
        //for (int i =0; i<arr.length;i++){
          //  x = top;
            //top++;
        //}
        // Increment top
        // Add element
        /** for my first try i had somewhat good logic but i was confused on how to check if
         * the stack was empty and the second things was that i didnt need a loop because this
         * is a simple push operation
         * i also had the logic backwars, it should of been arr[top] = x;
         * and i wanna make sure to increment the top first
         */

        if(top >= capacity-1){
            System.out.println("Stack overflow!");
            return;
        }
        top++;
        arr[top] = x;
    }

    // Pop element from stack
    public int pop() {
        // Your code here
        // Check if stack is empty
        //if(top == null){//i had good logic but top cant be null. -1 means empty stack
            //REMEMBER top is an int meaning that its primative and primatives cant be null
            //System.out.println("Stack Empty!");
            //return;// return method needs a value, so we return -1
        //}
        if(top == -1){
            return -1;
        }
        int x = arr[top];
        top--;
        return x;
        // Get element at top
        // Decrement top
        // Return element
    }

    // Peek at top element
    public int peek() {
        if(top == -1){
            return -1;
        }
        // i almost had this one right -> return top;, here i am returning index not value
        return arr[top];// here i am returning value

        // Your code here
    }

    // Check if empty
    public boolean isEmpty() {
        return top == -1;
        // Your code here
    }

    // Get size
    public int size() {
        //return capacity; this one is also wrong
        //it should be
        return top +1;
        // Your code here
        /**Why `top + 1`?**
```
        Stack: [5, 10, 15], top = 2

        top = 2 (index of last element)
        But we have 3 elements (indices 0, 1, 2)
        So size = top + 1 = 2 + 1 = 3 ✅

        Empty stack: top = -1
        size = -1 + 1 = 0 ✅
         */
    }
}



public class StackwArray {
    public static void main(String[] args){
        MyStack stack = new MyStack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Size: " + stack.size());      // 3
        System.out.println("Peek: " + stack.peek());      // 30
        System.out.println("Pop: " + stack.pop());        // 30
        System.out.println("Size: " + stack.size());      // 2
        System.out.println("Is Empty: " + stack.isEmpty()); // false
    }
}
