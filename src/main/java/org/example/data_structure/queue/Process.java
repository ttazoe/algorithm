package org.example.data_structure.queue;


import lombok.Data;

@Data
public class Process {
    String name;
    int time;

    public Process(String name, int time) {
        this.name = name;
        this.time = time;
    }

    public Process subtractTime(int processingTime) {
        int updatedTime = time - processingTime;
        if (updatedTime < 0) {
            updatedTime = 0;
        }
        return new Process(name, updatedTime);
    }

    public boolean isCompleted(){
        return time == 0;
    }

    @Override
    public String toString() {
        return "Process{" +
                "name='" + name + '\'' +
                ", time=" + time +
                '}';
    }
}
