package com.company.thirdtask.model;

/**
 * This class is used to process all data from controller.
 *
 * @author Serhii Muzhylivskyi
 * */
public class Model {

    private String firsName;
    private String lastName;
    private String phoneNumber;

    public String getFirsName() {
        return firsName;
    }

    public void setFirsName(String firsName) {
        this.firsName = firsName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return lastName + " " + firsName.charAt(0) + ".";
    }
}
