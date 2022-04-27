package models.moderntester.basic;

import java.util.List;

public class Form {
    private String firstName;
    private String lastName;
    private String email;
    private String gender;
    private int age;
    private int experience;
    private List<String> professions;
    private String continent;
    private List<String> commands;
    private String filePath;
    private String additionalInfo;

    public Form() {
    }

    public Form(String firstName, String lastName, String email, String gender, int age, int experience, List<String> professions, String continent, List<String> commands, String filePath, String additionalInfo) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
        this.age = age;
        this.experience = experience;
        this.professions = professions;
        this.continent = continent;
        this.commands = commands;
        this.filePath = filePath;
        this.additionalInfo = additionalInfo;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public int getExperience() {
        return experience;
    }

    public List<String> getProfessions() {
        return professions;
    }

    public String getContinent() {
        return continent;
    }

    public List<String> getCommands() {
        return commands;
    }

    public String getFilePath() {
        return filePath;
    }

    public String getAdditionalInfo() {
        return additionalInfo;
    }
}
