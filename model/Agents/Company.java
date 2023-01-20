package model.Agents;

import java.util.List;

import model.Contacts.Contact;

public class Company extends CounterAgent {
    private String name;
    private int tin;
    private List<Contact> contacts;

    public Company(String name, int tin, List<Contact> contacts) {
        this.name = name;
        this.tin = tin;
        this.contacts = contacts;
    }

    public String getName() {
        return name;
    }

    public int getTin() {
        return tin;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Название организации: " + name + " | ИНН: " + tin + "\n");
        for (Contact contact : contacts) {
            sb.append("  " + contact.toString() + "\n");
        }
        return sb.toString();
    }

}
