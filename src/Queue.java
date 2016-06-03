/**
 * Created by kartik on 03/06/16.
 */
public class Queue {

    Object[] objects ;
    int size = -1;


    public static void main(String[] args){

        Queue queue = new Queue();
        queue.createQueue(10);

        for (int i =0 ;i<10;i++){
            queue.addToQueue(i+1);
        }


        queue.traverseStack();
        queue.removeFromQueue();
        queue.removeFromQueue();

        queue.traverseStack();

        queue.addToQueue(11);
        queue.addToQueue(12);

        queue.removeFromQueue();

        queue.traverseStack();


    }

   /*
    * traverse the stack
    */

    public void traverseStack(){
        for(int i=size;i>=0;i--) {
            display(objects[i].value);
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

    public boolean isQueueFull(){
        if(size+1==objects.length)
            return true;
        else
            return false;
    }

    /**
     * create a queue of size i
     * @param i
     */
    public void createQueue(int i){
        objects = new Object[i];
    }

    public void removeFromQueue(){
        if(size!=-1){
            System.out.println("Popping element "+objects[0].value);
            for(int i=0;i<size;i++) {
                objects[i] = objects[i+1];
            }
            objects[size]=null;
            size--;
        }
    }

    public void addToQueue(int value){
        if(!isQueueFull()) {
            size++;
            objects[size] = new Object(value);
            System.out.println("Adding element "+objects[size].value);
        }else{
            System.out.println("Queue is full");
        }
    }



}


