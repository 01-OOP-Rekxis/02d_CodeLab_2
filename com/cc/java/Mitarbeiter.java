package com.cc.java;

public class Mitarbeiter {
    private String familyName;
    private String firstName;
    private String role;
    private int yearOfEntry;

    public Mitarbeiter(String familyName, String firstName, String role, int yearOfEntry) {
        this.familyName = familyName;
        this.firstName = firstName;
        this.role = role;
        this.yearOfEntry = yearOfEntry;
    }

    public String getInfo(String role) {
        if (role == "Personalmanagerin") {
            return "Mitarbeiter Name: " + this.familyName +
                    ", Vorname: " + this.firstName +
                    ", Rolle: " + this.role +
                    ", Eintrittsjahr: " + this.yearOfEntry;
        } else {
            return "Kein Zugriff";
        }
    }

    public String getRole() {
        return role;
    }

}
