package roboResume;

import java.util.ArrayList;

public class Education {
    private String School;
    private String year;
    private String degree;
    private String major;


    public Education() {
    }

    public Education(String school, String year, String degree, String major) {
        School = school;
        this.year = year;
        this.degree = degree;
        this.major = major;
    }


    public String getSchool() {
        return School;
    }

    public void setSchool(String school) {
        School = school;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}
