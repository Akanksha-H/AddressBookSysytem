package com.bl.addressbooksysytem;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    static ArrayList<UserContactInformation> infoArrayList = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("WELCOME TO THE ADDRESS_BOOK");

        System.out.println("Add new contact to the AddressBook: ");
        AddressBook addContact = new AddressBook();
        addContact.addContact();
    }

    public void addContact() {
        UserContactInformation user1 = new UserContactInformation();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name: ");
        user1.setFirstName(scanner.nextLine());

        System.out.print("Enter last name: ");
        user1.setLastName(scanner.nextLine());

        System.out.print("Enter locality name: ");
        user1.setLocality(scanner.nextLine());

        System.out.print("Enter city name: ");
        user1.setCity(scanner.nextLine());

        System.out.print("Enter state name: ");
        user1.setState(scanner.nextLine());

        System.out.print("Enter email: ");
        user1.setEmail(scanner.nextLine());

        System.out.print("Enter zip: ");
        user1.setZip(scanner.nextInt());

        System.out.print("Enter mobile number: ");
        user1.setNumber(scanner.nextLong());

        System.out.println("Details of User" + "\n" + "FirstName = " + user1.getFirstName() + "\n" + "LastName = "
                + user1.getLastName() + "\n" + "Locality = " + user1.getLocality() + "\n" + "City = " + user1.getCity()
                + "\n" + "State = " + user1.getState() + "\n" + "Email =" + user1.getEmail() + "\n" + "Zip ="
                + user1.getZip() + "\n" + "Number = " + user1.getNumber());

        infoArrayList.add(user1);
    }
}