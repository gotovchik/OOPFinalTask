package model.Agents;

import java.util.List;

import model.Contacts.Contact;

public class CounterAgent {
    private String name;
    private List<Contact> contacts;

    public String getName() {
        return name;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
    }
}
