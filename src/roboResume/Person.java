package roboResume;

import java.util.ArrayList;

public class Person {

    private String fullName;
    private String email;
    private String phoneNumber;
    private ArrayList<Education>allEducations;
    private ArrayList<Experience>allExperiences;

    public Person() {
        allEducations = new ArrayList<>();
    }

    public Person(String name, String email, String phoneNumber, ArrayList<Education> allEducations) {
        this.fullName = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.allEducations = allEducations;
        allEducations = new ArrayList<>();
    }

    public String getName() {
        return fullName;
    }

    public void setName(String name) {
        this.fullName = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public ArrayList<Education> getAllEducations() {
        return allEducations;
    }

    public void setAllEducations(ArrayList<Education> allEducations) {
        this.allEducations = allEducations;
    }

    public ArrayList<Experience> getAllExperiences() {
        return allExperiences;
    }

    public void setAllExperiences(ArrayList<Experience> allExperiences) {
        this.allExperiences = allExperiences;
    }
}
