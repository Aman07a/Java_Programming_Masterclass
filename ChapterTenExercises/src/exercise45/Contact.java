package exercise45;

public class Contact {
    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    // Get the name of the contact.
    public String getName() {
        return name;
    }

    // Get the phone number of the contact.
    public String getPhoneNumber() {
        return phoneNumber;
    }

    // Create a new Contact object with the specified name and phone number.
    public static Contact createContact(String name, String phoneNumber) {
        return new Contact(name, phoneNumber);
    }
}

