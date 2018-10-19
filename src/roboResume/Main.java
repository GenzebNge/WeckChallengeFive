package roboResume;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        String addNePerson = "";
        do {
            ArrayList<Education> allEducations = new ArrayList<>();
            ArrayList<Experience> allExperiences = new ArrayList<>();
            ArrayList<Duty> allDuties = new ArrayList<>();
            ArrayList<Skill>allSkills = new ArrayList<>();

            Scanner keyBord = new Scanner(System.in);
            // Education newEducation = new Education();
            System.out.println("Enter Name: ");
            String inputName = keyBord.nextLine();
            System.out.println("Enter Email: ");
            String inputEmail = keyBord.nextLine();
            System.out.println("Enter Phone Number: ");
            String inputPhoneNumber = keyBord.nextLine();

            String yesOrNo = "";

            System.out.println("Enter Education ");

            do {
                Education newEducation = new Education();
                System.out.println("Enter School ");
                String mySchool = keyBord.nextLine();
                newEducation.setSchool(mySchool);
                System.out.println("Enter Graduation Year ");
                String year = keyBord.nextLine();
                newEducation.setYear(year);
                System.out.println("Enter degree ");
                String myDegree = keyBord.nextLine();
                newEducation.setDegree(myDegree);
                System.out.println("Enter your major ");
                String myMajor = keyBord.nextLine();
                newEducation.setMajor(myMajor);
                System.out.println("Do you want to add More Education ");
                yesOrNo = keyBord.nextLine();

                allEducations.add(newEducation);

            } while (yesOrNo.equalsIgnoreCase("yes"));


            System.out.println("Please add your work experiences below ");

            do {
                Experience newExperience = new Experience();
                Duty myDuty = new Duty();
                System.out.println("Enter Campany name ");
                String campany = keyBord.nextLine();
                newExperience.setCampany(campany);
                System.out.println("Enter Title ");
                String title = keyBord.nextLine();
                newExperience.setTitle(title);
                System.out.println("Enter Date ");
                String date = keyBord.nextLine();
                newExperience.setDate(date);


                    String option = "";
                    do {
                        Duty aDuty = new Duty();
                        System.out.println("Duty");
                        String duty = keyBord.nextLine();
                        aDuty.setDescription(duty);
                        allDuties.add(aDuty);
                        newExperience.addNewDuty(aDuty);
                        System.out.println("Do you want to add more duties? yse/no");
                        option = keyBord.nextLine();
                    } while (option.equalsIgnoreCase("yes"));



                allExperiences.add(newExperience);
                System.out.println("Do you want to add other experience? yes/No");
                yesOrNo = keyBord.nextLine();
            } while (yesOrNo.equalsIgnoreCase("yes"));


            System.out.println("Enter any skill that you have ");
            String userAnser ="";
            do {
                Skill newSkil = new Skill();
                System.out.println("Enter Skill");
                String addSkill = keyBord.nextLine();
                newSkil.setSkillSet(addSkill);
                System.out.println("Enter your level on this Skill");
                String addLevel = keyBord.nextLine();
                newSkil.setSkillLebel(addLevel);
                allSkills.add(newSkil);
                System.out.println("Do you want to add more Skills? Yes/No");
                userAnser = keyBord.nextLine();
            }while (userAnser.equalsIgnoreCase("yes"));



            Person newPerson = new Person(inputName, inputEmail, inputPhoneNumber, allEducations);
            System.out.println("Personal Informations: " + "\nName: " + newPerson.getName() + "\nEmail: " + newPerson.getEmail() + "\nPhone Number: " + newPerson.getPhoneNumber());
            System.out.println("\nEducational Bagraound: ");

            for (Education myEducations : allEducations) {
                System.out.println(myEducations.getDegree() + " in " + myEducations.getMajor() + "\n" + myEducations.getSchool() + " , " + myEducations.getYear());
            }
            System.out.println("\nExperinces");
            for (Experience myExperience : allExperiences) {
                System.out.println(myExperience.getTitle() + "\n" + myExperience.getCampany() + " , " + myExperience.getDate());
                int count = 1;
                for (Duty myDuties : myExperience.getAllDuties()){
                    System.out.println("Duty"+ count + "- " + myDuties.getDescription());
                    count++;
                }
            }
            System.out.println("\nSkills");
            for (Skill mySkills :allSkills){
                System.out.println(mySkills.getSkillSet() + " : " + mySkills.getSkillLebel());
            }
            System.out.println("Do you want to Generate an other Resume");
            addNePerson = keyBord.nextLine();
        }while (addNePerson.equalsIgnoreCase("yes"));
    }

    private static Duty addDutyForExperience(Scanner keyBord, Duty newDuty, ArrayList<Duty>allDuties) {
        Duty foundDuty = null;
        String yap ="";
        do {
            System.out.println("Enter Duty");
            String inputDuty = keyBord.nextLine();
            newDuty.setDescription(inputDuty);
            allDuties.add(newDuty);
            System.out.println("Do you want to add More Duty? Yap/No");
            yap = keyBord.nextLine();

        }while (yap.equalsIgnoreCase("yes"));
        return  foundDuty;
    }
}
