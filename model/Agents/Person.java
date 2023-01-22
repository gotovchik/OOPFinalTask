package model.Agents;

import java.util.List;

import model.Contacts.Contact;

public class Person extends CounterAgent {
    private String name;

    private List<Contact> contacts;

    public Person(String name, List<Contact> contacts) {
        this.name = name;
        this.contacts = contacts;
    }

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
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
