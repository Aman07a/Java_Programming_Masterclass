package exercise45;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    // Add a new contact to the list if it doesn't already exist.
    public boolean addNewContact(Contact contact) {
        if (findContact(contact.getName()) == -1) {
            myContacts.add(contact);
            return true;
        }
        return false;
    }

    // Update an existing contact with a new contact.
    public boolean updateContact(Contact oldContact, Contact newContact) {
        int position = findContact(oldContact);
        if (position >= 0) {
            myContacts.set(position, newContact);
            return true;
        }
        return false;
    }

    // Remove a contact from the list.
    public boolean removeContact(Contact contact) {
        int position = findContact(contact);
        if (position >= 0) {
            myContacts.remove(position);
            return true;
        }
        return false;
    }

    // Find the index of a contact in the list.
    private int findContact(Contact contact) {
        return myContacts.indexOf(contact);
    }

    // Find the index of a contact by name.
    private int findContact(String name) {
        for (int i = 0; i < myContacts.size(); i++) {
            Contact contact = myContacts.get(i);
            if (contact.getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    // Query a contact by name and return it.
    public Contact queryContact(String name) {
        int position = findContact(name);
        if (position >= 0) {
            return myContacts.get(position);
        }
        return null;
    }

    // Print the list of contacts.
    public void printContacts() {
        System.out.println("Contact List:");
        for (int i = 0; i < myContacts.size(); i++) {
            Contact contact = myContacts.get(i);
            System.out.println((i + 1) + ". " + contact.getName()
                    + " -> " + contact.getPhoneNumber());
        }
    }
}

