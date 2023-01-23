package model.Agents;

import java.util.List;

import model.Contacts.Contact;

public class Company extends CounterAgent {
    public Company(String name, List<Contact> contacts) {
        super(name, contacts);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Название организации: " + super.name + "\n");
        for (Contact contact : super.contacts) {
            sb.append("  " + contact.toString() + "\n");
        }
        return sb.toString();
    }
}
