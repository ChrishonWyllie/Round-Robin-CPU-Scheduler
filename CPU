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
//This is the main method
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;

public class CPU 
{
    public static void main(String[] args)
    {
        LinkedUnbndQueue<process> readyQueue = new LinkedUnbndQueue<process>();
        Scanner keyboard = new Scanner(System.in);
        process p1 = new process();
            process p2 = new process();
            process p3 = new process();
            process p4 = new process();
            process p5 = new process();

            System.out.print("Enter the burst time for p1: ");
            int p1BurstTime = keyboard.nextInt();
            p1.setBurstTime(p1BurstTime);
            p1.setCreationTime();
            p1.getCreationTime();

            System.out.print("Enter the burst time for p2: ");
            int p2BurstTime = keyboard.nextInt();
            p2.setBurstTime(p2BurstTime);
            p2.setCreationTime();
            p2.getCreationTime();

            System.out.print("Enter the burst time for p3: ");
            int p3BurstTime = keyboard.nextInt();
            p3.setBurstTime(p3BurstTime);
            p3.setCreationTime();
            p3.getCreationTime();

            System.out.print("Enter the burst time for p4: ");
            int p4BurstTime = keyboard.nextInt();
            p4.setBurstTime(p4BurstTime);
            p4.setCreationTime();
            p4.getCreationTime();

            System.out.print("Enter the burst time for p5: ");
            int p5BurstTime = keyboard.nextInt();
            p5.setBurstTime(p5BurstTime);
            p5.setCreationTime();
            p5.getCreationTime();
            
        for(int i = 1; i<5; i++)
        {
            p1.setBurstTime(p1BurstTime);
            p1.setCreationTime();
            
            p2.setBurstTime(p2BurstTime);
            p2.setCreationTime();
            
            p3.setBurstTime(p3BurstTime);
            p3.setCreationTime();
            
            p4.setBurstTime(p4BurstTime);
            p4.setCreationTime();
            
            p5.setBurstTime(p5BurstTime);
            p5.setCreationTime();
            System.out.println();
            System.out.println("Round Robin simulator attempt number: " + i);
            System.out.println("Please enter the time quantum for this run");
            int timeQuantum = keyboard.nextInt();

            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();



            int numProcessesBefore =0;
            int waitingTime = 0;
            int numContextSwitches = 0;
            double avgWaitingTime = 0;
            int numProcesses = 5;
            int totalBurstTime = (p1.getBurstTime() + p2.getBurstTime() + 
                                 p3.getBurstTime() + p4.getBurstTime() + p5.getBurstTime());        
            while(p1.getBurstTime() > 0 || p2.getBurstTime() > 0 || p3.getBurstTime() > 0 || 
                    p4.getBurstTime() > 0 || p5.getBurstTime() > 0)
            {
                //FOR P1
                readyQueue.enqueue(p1);
                p1.setArrivalTime(waitingTime);
                p1.getArrivalTime();
                if(p1.getBurstTime() > 0)
                {
                    p1.setBurstTime(p1.getBurstTime() - timeQuantum);
                    numContextSwitches++;
                    System.out.println("The burst time for P1 is now: " + p1.getBurstTime());
                }
                else
                    if(p1.getBurstTime() <= 0)
                    {
                        p1.setCompletionTime(waitingTime);
                        System.out.println("This process has completed at: " + p1.getCompletionTime());
                        int p1TurnAroundTime = waitingTime;
                        System.out.println("The turnaround time of this process was: " + p1TurnAroundTime);
                    }                
                waitingTime = (numProcessesBefore*timeQuantum);
                System.out.println("The waiting time for P1 was: " + (waitingTime));
                System.out.println();
                

                //FOR P2
                readyQueue.enqueue(p2);
                p2.setArrivalTime(waitingTime);
                p2.getArrivalTime();
                if(p2.getBurstTime() > 0)
                {
                    p2.setBurstTime(p2.getBurstTime() - timeQuantum);
                    numContextSwitches++;
                    System.out.println("The burst time for P2 is now: " +p2.getBurstTime());
                    readyQueue.dequeue();
                }
                else
                    if(p2.getBurstTime() <= 0)
                    {
                        p2.setCompletionTime(waitingTime);
                        System.out.println("This process has completed at: " + p2.getCompletionTime());
                        int p2TurnAroundTime = waitingTime;
                        System.out.println("The turnaround time of this process was: " + p2TurnAroundTime);
                    }
                numProcessesBefore++;
                waitingTime = (numProcessesBefore*timeQuantum);
                System.out.println("The waiting time for P2 was: " + (waitingTime));
                System.out.println();
                
                
                
                
                //FOR P3
                readyQueue.enqueue(p3);
                p3.setArrivalTime(waitingTime);
                p3.getArrivalTime();
                if(p3.getBurstTime() > 0)
                {
                    p3.setBurstTime(p3.getBurstTime() - timeQuantum);
                    numContextSwitches++;
                    System.out.println("The burst time for P3 is now: " +p3.getBurstTime());
                    readyQueue.dequeue();
                }
                else
                    if(p3.getBurstTime() <= 0)
                    {
                        p3.setCompletionTime(waitingTime);
                        System.out.println("This process has completed at: " + p3.getCompletionTime());
                        int p3TurnAroundTime = waitingTime;
                        System.out.println("The turnaround time of this process was: " + p3TurnAroundTime);
                    }
                numProcessesBefore++;
                waitingTime = (numProcessesBefore*timeQuantum);
                System.out.println("The waiting time for P3 was: " + (waitingTime));
                System.out.println();
                
                
                
                
                //FOR P4
                readyQueue.enqueue(p4);
                p4.setArrivalTime(waitingTime);
                p4.getArrivalTime();
                if(p4.getBurstTime() > 0)
                {
                    p4.setBurstTime(p4.getBurstTime() - timeQuantum);
                    numContextSwitches++;
                    System.out.println("The burst time for P4 is now: " +p4.getBurstTime());
                    readyQueue.dequeue();
                }
                else
                    if(p4.getBurstTime() <= 0)
                    {
                        p4.setCompletionTime(waitingTime);
                        System.out.println("This process has completed at: " + p4.getCompletionTime());
                        int p4TurnAroundTime = waitingTime;
                        System.out.println("The turnaround time of this process was: " + p4TurnAroundTime);
                    }
                numProcessesBefore++;
                waitingTime = (numProcessesBefore*timeQuantum);
                System.out.println("The waiting time for P4 was: " + (waitingTime));
                System.out.println();
                
                
                
                
                
                //FOR P5
                readyQueue.enqueue(p5);
                p5.setArrivalTime(waitingTime);
                p5.getArrivalTime();
                if(p5.getBurstTime() > 0)
                {
                    p5.setBurstTime(p5.getBurstTime() - timeQuantum);
                    numContextSwitches++;
                    System.out.println("The burst time for P5 is now: " +p5.getBurstTime());
                    readyQueue.dequeue();
                }
                else
                    if(p5.getBurstTime() <= 0)
                    {
                        p5.setCompletionTime(waitingTime);
                        System.out.println("This process was completed at: " + p5.getCompletionTime());
                        int p5TurnAroundTime = waitingTime;
                        System.out.println("The turnaround time of this process was: " + p5TurnAroundTime);
                    }
                numProcessesBefore++;
                waitingTime = (numProcessesBefore*timeQuantum);
                System.out.println("The waiting time for P5 was: " + (waitingTime));
                System.out.println();
           }
            
                avgWaitingTime = (waitingTime)/(double)numProcesses;
                System.out.println("The total number of context switches for this run was: " +numContextSwitches);
                System.out.println("The average waiting time for this run was: " + avgWaitingTime);  
                
                System.out.println();
                System.out.println();
                System.out.println("<=================================================================================>");
                System.out.println("<=================================================================================>");
                System.out.println("<=================================================================================>");
                System.out.println();
                System.out.println();
        }
    }   
}
