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
import java.util.Date;
import java.text.SimpleDateFormat;

//This class acts as the process creator.
public class process 
{
    protected int burstTime;
    protected String creationTime;
    protected int completionTime;
    protected int arrivalTime;
    
    //This is the constructor for the process.
    public process(int burstTime)
    {
        this.burstTime = burstTime;
    }
    
    public process()
    {
        
    }
    public process(int burstTime, String creationTime, int completionTime, int arrivalTime)
    {
        this.burstTime = burstTime;
        this.creationTime = creationTime;
        this.completionTime = completionTime;
        this.arrivalTime = arrivalTime;
    }
    
    //This will set the burstTime for each process.
    public void setBurstTime(int burstTime)
    {
        this.burstTime = burstTime;
    }
    
    //This will return the burstTime of each process.
    public int getBurstTime()
    {
        return burstTime;
    }
    
    //This will set the time at which the process is created.
    //The current up-to-date time.
    public void setCreationTime()
    {
        creationTime = new SimpleDateFormat("MM/dd/yyyy HM:mm:ss").format(new Date());
    }
    
    //This will return the creation time.
    public void getCreationTime()
    {
        System.out.println("The creation time of this process is: " +creationTime);
    }
    
    //This will set the time at which the process has completed
    //its task.
    public void setCompletionTime(int completionTime)
    {
        this.completionTime = completionTime;
    }
    
    //This will return the completion time.
    public int getCompletionTime()
    {
        return completionTime;
    }
    
    //This will set the time of arrival of a prcoess into a ready queue.
    public void setArrivalTime(int arrivalTime)
    {
        this.arrivalTime = arrivalTime;    
    } 
    //This will return the time at which the process arrives into the ready queue.
    public void getArrivalTime()
    {
        System.out.println("This process has arrived in the ready queue at: " + arrivalTime);
    }

}
