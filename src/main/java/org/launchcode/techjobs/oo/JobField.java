package org.launchcode.techjobs.oo;

import java.util.Objects;

public class JobField {


    private int id;
    private static int nextId = 1;
    private String value;

    public JobField() {
        id = nextId;
        nextId++;
    }

    public JobField(String value) {
        this();
        this.value = value;
    }

//    //setters id, nextId, and value
//    public void setId(int id) {
//        this.id = id;
//    }

    public static void setNextId(int nextId) {
        JobField.nextId = nextId;
    }

    public void setValue(String value) {
        this.value = value;
    }

    //getters id, nextID, value
    public int getId() {
        return id;
    }

    public static int getNextId() {
        return nextId;
    }

    public String getValue() {
        return value;
    }

    // Custom toString, equals, and hashCode methods:

    @Override
    public String toString() {
        return value;
    }

//    @Override
//    public boolean equals(Object o) {  // Two objects are equal if they have the same id.
//        if (this == o) return true;
//        if (!(o instanceof Employer)) return false;
//        Employer employer = (Employer) o;
//        return getId() == employer.getId();
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JobField jobField = (JobField) o;
        return getId() == jobField.getId() && Objects.equals(getValue(), jobField.getValue());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }


}
