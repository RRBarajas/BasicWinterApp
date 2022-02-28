package encora.newapplication.pojos;

import java.util.Arrays;

public class Job {

    private String title;

    private double salary;

    private byte someByte;

    private int[] someArray;

    private String[] directs;

    private Person manager;

    public Job() {}

    public Job(String title, double salary, byte someByte, int[] someArray, String[] directs,
        Person manager) {
        this.title = title;
        this.salary = salary;
        this.someByte = someByte;
        this.someArray = someArray;
        this.directs = directs;
        this.manager = manager;
    }

    @Override public String toString() {
        return "Job{" +
            "title='" + title + '\'' +
            ", salary=" + salary +
            ", someByte=" + someByte +
            ", someArray=" + Arrays.toString(someArray) +
            ", directs=" + Arrays.deepToString(directs) +
            //                ", manager=" + manager +
            '}';
    }
}