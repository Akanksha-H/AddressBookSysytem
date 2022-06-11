package com.bl.addressbooksysytem;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    static ArrayList<UserContactInformation> infoArrayList = new ArrayList<>();
    static final int EDIT_CONTACT = 1;
    static final int DELETE_CONTACT = 2;

    public static void main(String[] args) {
        System.out.println("WELCOME TO THE ADDRESS_BOOK");

        System.out.println("Add new contact to the AddressBook: ");
        AddressBook addContact = new AddressBook();
        addContact.addContact();

        System.out.println("Enter the choice 1: Edit Contact 2: Delete Contact");
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();

        switch (option) {
            case EDIT_CONTACT:
                AddressBook editContact1 = new AddressBook();
                editContact1.editContact();
                break;

            case DELETE_CONTACT:
                AddressBook deleteContact = new AddressBook();
                deleteContact.deleteContact();
                break;
        }
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

    void editContact() {
        UserContactInformation contactInfo = new UserContactInformation();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name  : ");
        String firstName = scanner.next();
        for (int i = 0; i < infoArrayList.size(); i++) {
            if (firstName.equals(infoArrayList.get(i).getFirstName())) {
                contactInfo = infoArrayList.get(i);
            } else {
                System.out.println("Put valid data");
            }
            System.out.println("Enter value of data you want to edit. 1:Name 2:Last Name 3:Locality 4:City 5:State 6:Email 7:Zip 8:Mobile");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter new name: ");
                    contactInfo.setFirstName(scanner.next());
                    break;

                case 2:
                    System.out.print("Enter new last name: ");
                    contactInfo.setLastName(scanner.next());
                    break;

                case 3:
                    System.out.print("Enter new  locality name: ");
                    contactInfo.setLocality(scanner.next());
                    break;

                case 4:
                    System.out.print("Enter new city name: ");
                    contactInfo.setCity(scanner.next());
                    break;

                case 5:
                    System.out.print("Enter new state name: ");
                    contactInfo.setState(scanner.next());
                    break;

                case 6:
                    System.out.print("Enter new email: ");
                    contactInfo.setEmail(scanner.next());
                    break;

                case 7:
                    System.out.print("Enter new zip: ");
                    contactInfo.setZip(scanner.nextInt());
                    break;

                case 8:
                    System.out.print("Enter new mobile number: ");
                    contactInfo.setNumber(scanner.nextLong());
                    break;
            }
        }
    }

    void deleteContact() {
        System.out.println("Name the contact you want to delete = ");
        Scanner scanner = new Scanner(System.in);
        String firstName1 = scanner.next();
        for (int i = 0; i < infoArrayList.size(); i++) {
            if (firstName1.equals(infoArrayList.get(i).getFirstName())) {
                infoArrayList.remove(infoArrayList.get(i));
                System.out.println("Contact deleted");
            } else {
                System.out.println("Put valid data");
            }
        }
    }
}