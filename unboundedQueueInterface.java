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
public interface unboundedQueueInterface<T> extends queueInterface<T> 
{
   void enqueue(T element);
   //adds element to the rear of this queue.
}
