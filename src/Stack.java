//Stack Implementation

/**
 * Created by kartik on 01/06/16.
 */
public class Stack {

    Object[] objects;
    Object top;
    int size=-1;

    public static void main(String[] args){
        Stack stack= new Stack();
        stack.createStack(10);

        // Adding objects to stack
        for(int i=0 ;i<10;i++) {
            stack.pushToStack(i+1);
        }

        stack.traverseStack();

        // pop 2 objects from stack
        stack.popFromStack();
        stack.popFromStack();

        stack.traverseStack();


        // push an object on stack
        stack.pushToStack(11);

        stack.traverseStack();

    }

    /**
     * traverse the stack
     */

    public void traverseStack(){
        for(int i=size;i>=0;i--) {
            display(objects[i].value);
        }
    }

    /**
     * create a stack of size i
     * @param i
     */
    public void createStack(int i){
        objects = new Object[i];
    }

    /**
     * check if the stack is full
     * @return
     */
    public  boolean isStackFull(){
       if(size+1==objects.length)
           return true;
        else
           return false;
    }

    /**
     * Push an object with int value to the stack
     * @param value
     */
    public void pushToStack(int value){
        if(!isStackFull()){
            size++;
            objects[size]= new Object(value);
            top = objects[size];
            System.out.println("Adding element "+top.value);
        }else{
            System.out.println("Stack is full");
        }
    }

    /**
     * Pop the last added object from the stack
     */

    public void popFromStack(){

        if(size!=-1){
            System.out.println("Popping element "+objects[size].value);
            objects[size]=null;
            size--;
        }

    }

    /**
     * Print the data value
     *
     * @param data
     */
    public void display(int data) {
            System.out.println(data);
    }
}

/**
 * Object class
 */


class Object {

    public int value;

    public Object(int value) {
        this.value=value;
    }
}
