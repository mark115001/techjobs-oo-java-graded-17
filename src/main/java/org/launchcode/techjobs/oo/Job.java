package org.launchcode.techjobs.oo;

import org.hamcrest.core.IsNot;

import java.util.Objects;

import static java.util.Objects.isNull;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the  ---Completed
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name != "" ? name : "Data not available";
        this.employer = !(employer.toString().isEmpty()) ? employer : new Employer("Data not available");
        this.location = !(location.toString().isEmpty()) ? location: new Location("Data not available");
        this.positionType = !(positionType.toString().isEmpty()) ? positionType : new PositionType("Data not available");
        this.coreCompetency = !(coreCompetency.toString().isEmpty()) ? coreCompetency : new CoreCompetency("Data not available");
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields ---Completed
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job that = (Job) o;
        return id == that.id;
    }

    @Override
    public String toString() {

        String outPut = "\n" + "ID: " + id + "\n" +
                    "Name: " + name + "\n" +
                    "Employer: " + employer + "\n" +
                    "Location: " + location + "\n" +
                    "Position Type: " + positionType + "\n" +
                    "Core Competency: " + coreCompetency + "\n";
        return outPut;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public int jobCheckOnly() {
        if (name == "" && employer.equals("") && location.equals("") && positionType.equals("") && coreCompetency.equals("")) {
            return 1; //only ID found
        } else {
            return 0; //more than just ID found
        }
    }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID ---Completed
    //  and id.

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public Location getLocation() {
        return location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }
}
