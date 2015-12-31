# Round-Robin-CPU-Scheduler

Chrishon Wyllie
CSCI 330 – Round Robin CPU scheduler
This document will act as a readme file for the Round Robin-based CPU scheduler.

•	Introduction: a brief description of the problem and its goals;
•	Implantation: a brief description of how to implement the RR scheduling algorithm and the queues involved to measure the performance criteria 
•	Empirical evaluation: a detailed description of your simulation, performance metrics
•	Analysis of the results
•	Conclusion 

Under normal circumstances, when a CPU schedules a process to run, it completes the process instructions in a single run. While this may seem beneficial, this method quickly loses its advantages when multiple processes are scheduled to run. If there are n processes, it will take very long for the nth process to begin. This may cause issues when a process relies on instructions of another process to continue running. To fix this issue, I have simulated a Round-Robin CPU scheduler. The goal of this method is to allow some instructions of each process to execute without finishing completely. Each program is allowed to take turns using the computer’s resources for a given amount of time. This is known as a time-slice or time quantum. The goal of this Round Robin CPU scheduler is to allow n processes to complete a user-determined amount of instructions by taking the time quantum into account. 
The RR scheduling algorithm and the queues involved measure the performance criteria by saving the burst time of each created process and the time quantum of each run.  Both variables will be determined by the user’s input.  Once these have been established, the creation time of each process is timestamped and the process is enqueued into the ready queue and runs for the time-slice specified. Once this time is up, the process is dequeued and the original burst time is decremented by the value of the time-slice.  While each process enters and leaves the queue, a running total of the waiting time for each succeeding process is kept up to date.  Additionally, the time of arrival of each process into the ready queue is timestamped.  This continues until the burst time of each process reaches zero, indicating that the process has finished execution.  At this point, the completion time of each process is timestamped. In the end, the number of times that a process is dequeued is totaled in order to imitate the number of context switches and the average waiting time for the system is computed.
This is an empirical evaluation of my simulation:

When entering 3 as the time quantum for the first run (Assuming there were supposed to be 5 as specified on the assignment sheet) and the burst times of 4, 7, 6, 8 and 5 for p1, p2, p3, p4 and p5 respectively, the creation time of each process was printed out, the arrival time, new burst time and waiting times were computed. On the first pass, the updated burst times for the five processes were 1, 4, 3, 5 and 2. The waiting time for each process was 0, 3, 6, 9 and 12 as expected since the time quantum or time-slice was a static number. The program looped through until the processes finished execution and repeated the aforementioned tasks.

In conclusion, my code performs as expected and correctly simulates the Round Robin-based CPU scheduler.
