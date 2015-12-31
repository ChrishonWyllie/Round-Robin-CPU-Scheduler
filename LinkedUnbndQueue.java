/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSCI330ProjectOne;

/**
 *
 * @author Chrishon595
 */
public class LinkedUnbndQueue<T> implements unboundedQueueInterface<T>
{
  protected LLNode<T> front;   // reference to the front of this queue
  protected LLNode<T> rear;    // reference to the rear of this queue

  public LinkedUnbndQueue()
  {
    front = null;
    rear = null;
  }
  
  public LinkedUnbndQueue(int numNodes)
  {
      
  }

  public void enqueue(T element)
  // Adds element to the rear of this queue.
  { 
    LLNode<T> newNode = new LLNode<T>(element);
    if (rear == null)
      front = newNode;
    else
      rear.setLink(newNode);
    rear = newNode;
  }     

  public T dequeue()
  // Throws QueueUnderflowException if this queue is empty;
  // otherwise, removes front element from this queue and returns it.
  {
    if (isEmpty())
      throw new QueueUnderflowException("Dequeue attempted on empty queue.");
    else
    {
      T element;
      element = front.getInfo();
      front = front.getLink();
      if (front == null)
        rear = null;

      return element;
    }
  }

  public boolean isEmpty()
  // Returns true if this queue is empty; otherwise, returns false.
  {              
    if (front == null) 
      return true;
    else
      return false;
  }
}
