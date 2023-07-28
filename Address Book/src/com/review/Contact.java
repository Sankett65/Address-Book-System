package com.review;

import java.util.ArrayList;

public class Contact {
//    first and last names, address,
//    city, state, zip, phone number and
//    email...
     private String firstName;
    private String LastName;
    private  String address;
    private  int zip;
    private  int phoneNumber;
    private String email;

    public Contact(String firstName, String lastName, String address, int zip, int phoneNumber, String email) {
        this.firstName = firstName;
        LastName = lastName;
        this.address = address;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "AddressBook{Contact:-" +
                "firstName='" + firstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", address='" + address + '\'' +
                ", zip='" + zip + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                '}';
    }
}

class AdressBook{
    ArrayList<Contact> list = new ArrayList<>();
    public void addContact(Contact contact){
        list.add(contact);
    }

    public void setList(ArrayList<Contact> list) {
        this.list = list;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the Adress Book System.\n");
        AdressBook a = new AdressBook();
       Contact c = new Contact("Sanket","Jadhav","Dadar",400028,35426,"sanket@gmail.com");
         a.list.add(c);
        Contact c1 = new Contact("Swapnil","Jadhav","Matunga",400016,76527,"swapnil@gmail.com");
        a.list.add(c1);
        System.out.println(a.list);


    }

}
