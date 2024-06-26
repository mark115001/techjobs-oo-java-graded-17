package org.launchcode.techjobs.oo;

import javax.management.ValueExp;
import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job2 = new Job("Web Developer", new Employer("LaunchCode"), new Location("St. Louis"), new PositionType("Front-end developer"), new CoreCompetency("JavaScript"));
        Job job3 = new Job("Ice cream tester", new Employer(""), new Location("Home"), new PositionType("UX"), new CoreCompetency("Tasting ability"));
        Job job4 = new Job();
        Job job5 = new Job("Web Developer", new Employer("Google"), new Location("Home Office"), new PositionType("Java"), new CoreCompetency("Testing ability"));

        ArrayList<Job> jobs = new ArrayList<>();
        jobs.add(job1);
        jobs.add(job2);
        jobs.add(job3);
        jobs.add(job4);
        jobs.add(job5);

        for (Job job : jobs){
            System.out.println(job);
        }
    }

}
