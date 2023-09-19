import java.util.Scanner;

class Process {
    String name;
    int arrivalTime;
    int burstTime;
    int waitingTime;
    int turnaroundTime;
    int finishTime;

    public Process(String name, int arrivalTime, int burstTime) {
        this.name = name;
        this.arrivalTime = arrivalTime;
        this.burstTime = burstTime;
        this.waitingTime = 0;
        this.turnaroundTime = 0;
        this.finishTime = 0;
    }
}

public class FCFS_Scheduling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of processes: ");
        int n = scanner.nextInt();

        Process[] processes = new Process[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Process " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.next();
            System.out.print("Arrival Time: ");
            int arrivalTime = scanner.nextInt();
            System.out.print("Burst Time: ");
            int burstTime = scanner.nextInt();
            processes[i] = new Process(name, arrivalTime, burstTime);
        }

        // Sort the processes by arrival time (FCFS)
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (processes[j].arrivalTime > processes[j + 1].arrivalTime) {
                    // Swap the processes
                    Process temp = processes[j];
                    processes[j] = processes[j + 1];
                    processes[j + 1] = temp;
                }
            }
        }

        int currentTime = 0;
        double totalWaitingTime = 0;
        double totalTurnaroundTime = 0;

        System.out.println("\nFCFS Scheduling Order:");
        for (int i = 0; i < n; i++) {
            Process currentProcess = processes[i];
            System.out.println("Executing " + currentProcess.name);
            if (currentTime < currentProcess.arrivalTime) {
                currentTime = currentProcess.arrivalTime;
            }
            currentProcess.waitingTime = currentTime - currentProcess.arrivalTime;
            currentProcess.finishTime = currentTime + currentProcess.burstTime;
            currentProcess.turnaroundTime = currentProcess.waitingTime + currentProcess.burstTime;

            totalWaitingTime += currentProcess.waitingTime;
            totalTurnaroundTime += currentProcess.turnaroundTime;

            System.out.println("Finish " + currentProcess.name + ", Waiting Time: " + currentProcess.waitingTime
                    + ", Turnaround Time: " + currentProcess.turnaroundTime + ", Finish Time: " + currentProcess.finishTime);

            currentTime = currentProcess.finishTime;
        }

        double averageWaitingTime = totalWaitingTime / n;
        double averageTurnaroundTime = totalTurnaroundTime / n;
        System.out.println("\nAverage Waiting Time: " + averageWaitingTime);
        System.out.println("Average Turnaround Time: " + averageTurnaroundTime);

        scanner.close();
    }
}
