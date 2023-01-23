package model.Agents;

import java.util.List;

import model.Contacts.Contact;

public class Company extends CounterAgent {
    private String name;
    private List<Contact> contacts;

    public Company(String name, List<Contact> contacts) {
        super(name, contacts);
        // TODO Auto-generated constructor stub
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Название организации: " + name + "\n");
        for (Contact contact : contacts) {
            sb.append("  " + contact.toString() + "\n");
        }
        return sb.toString();
    }
}
