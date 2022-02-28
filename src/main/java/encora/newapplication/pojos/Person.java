package encora.newapplication.pojos;

import java.util.Arrays;
import java.util.Date;

public class Person {

    private String name;

    private String[] pronouns;

    private int age;

    private char sex;

    private Job job;

    private Job[] jobs;

    private boolean tenure;

    private boolean[][] array2d;

    private String[][][] array3d;

    private Date hireDate;

    public Person() {}

    public Person(String name, String[] pronouns, int age, char sex, Job job, Job[] jobs, boolean tenure, boolean[][] array2d,
        String[][][] array3d, Date hireDate) {
        this.name = name;
        this.pronouns = pronouns;
        this.age = age;
        this.sex = sex;
        this.job = job;
        this.jobs = jobs;
        this.tenure = tenure;
        this.array2d = array2d;
        this.array3d = array3d;
        this.hireDate = hireDate;
    }

    @Override public String toString() {
        return "Person{" +
            "name='" + name + '\'' +
            ", pronouns=" + Arrays.toString(pronouns) +
            ", age=" + age +
            ", sex=" + sex +
            ", job=" + job +
            ", jobs=" + Arrays.toString(jobs) +
            ", tenure=" + tenure +
            ", array2d=" + Arrays.toString(array2d) +
            ", array3d=" + Arrays.toString(array3d) +
            ", hireDate=" + hireDate +
            '}';
    }
}