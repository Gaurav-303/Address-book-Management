package model;

import java.util.*;

public class AddressBook {
    private final String name;
    private final List<Contact> contacts = new ArrayList<>();

    public AddressBook(String name) { this.name = name; }
    public String getName() { return name; }
    public List<Contact> getContacts() { return contacts; }


    // UC3: Delete Contact
    public boolean deleteContact(String firstName, String lastName) {
        Contact c = findContact(firstName, lastName);
        return (c != null) && contacts.remove(c);
    }

    private Contact findContact(String fn, String ln) {
        return contacts.stream()
                .filter(c -> c.getFirstName().equalsIgnoreCase(fn)
                        && c.getLastName().equalsIgnoreCase(ln))
                .findFirst().orElse(null);
    }


}

