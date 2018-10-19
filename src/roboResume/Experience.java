package roboResume;

import java.util.ArrayList;

public class Experience {

    private String campany;
    private String title;
    private String date;
    private ArrayList<Duty>allDuties;

    public Experience() {
        allDuties = new ArrayList<>();
    }

    public ArrayList<Duty> getAllDuties() {
        return allDuties;
    }

    public void setAllDuties(ArrayList<Duty> allDuties) {
        this.allDuties = allDuties;
    }

    public String getCampany() {
        return campany;
    }

    public void setCampany(String campany) {
        this.campany = campany;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

  public void addNewDuty(Duty duty){
      allDuties.add(duty);
  }
}
