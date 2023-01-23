package model.Agents;

import java.util.List;

import model.Contacts.Contact;

public class CounterAgent {
    protected String name;
    protected List<Contact> contacts;

    public String getName() {
        return name;
    }

    public CounterAgent(String name, List<Contact> contacts) {
        this.name = name;
        this.contacts = contacts;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Имя: " + name + "\n");
        if (contacts != null) {
            for (Contact contact : contacts) {
                sb.append("  " + contact.toString() + "\n");
            }
        }
        return sb.toString();
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

}
