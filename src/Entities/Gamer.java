package Entities;

import Concrete.GamerManager;

public class Gamer extends GamerManager {

    private Long nationalityId;
    private String name;
    private String lastName;
    private int birthYear;

    public Gamer(long nationalityId, String name, String lastName, int birthYear) {
        super();

        this.nationalityId = nationalityId;
        this.name = name;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }

    public long getNationalityId() {
        return nationalityId;
    }

    public void setNationalityId(long nationalityId) {
        this.nationalityId = nationalityId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }
}
