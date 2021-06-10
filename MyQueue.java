// PURPOSE: This file implements a queue using the generic type <E>.
//

public class MyQueue<E> {

    // INSTANCE VARIABLES

    //write code here
    protected MyStack<E> stack1;
    protected MyStack<E> stack2;



    // CONSTRUCTOR

    public MyQueue(){

        //write code here
       stack1 = new MyStack<E>();
       stack2 = new MyStack<E>();
    }

    // ACCESSOR METHODS

    // METHOD: isEmpty
    // PURPOSE: Return true if the queue is empty.
    public boolean isEmpty() {
        //is empty
        boolean result = false;
        if (stack1.isEmpty() == true && stack2.isEmpty()==true)
        {
            result = true;
        }
        return result;
    }

    // ACTION METHODS

    // METHOD: transferStacks
    // PURPOSE: Move the content from stack1 to stack2 such that its
    // order on stack2 is reverse from what it was on stack1.
    protected void transferStacks() throws EmptyStackQueueException {
        //write code here
            stack2.push(stack1.pop());

    }

    // METHOD: enqueue
    // PURPOSE: Add elem to the front of the queue.
    public void enqueue(E elem) {
        stack1.push(elem);
        //size++;
    }

    // METHOD: dequeue
    // PURPOSE: Return the element at the front of the queue and remove
    // it from the queue.
    public E dequeue() throws EmptyStackQueueException {
        //write code here
        E result = null;
        if (stack2.isEmpty()) //stack2 is not empty
        {

            while (!stack1.isEmpty())
            {
                this.transferStacks();
            }

        }
        if (!stack2.isEmpty())
        {
            result = stack2.pop();
        }
        return result;

    }
}


