package com.bl.addressbooksysytem;

public class AddressBooks {
    public static void main(String[] args) {
        System.out.print("Number of addressBook you have created is 2");;


        AddressBook addressBook1 = new AddressBook();
        addressBook1.main();
        addressBook1.addContact();
        addressBook1.editContact();
        addressBook1.deleteContact();

        AddressBook addressBook2 = new AddressBook();
        addressBook2.main();
        addressBook2.addContact();
        addressBook2.editContact();
        addressBook2.deleteContact();
    }
}
