package main;

import java.util.ArrayList;
import java.util.List;

import model.Model;
import model.Agents.Company;
import model.Agents.CounterAgent;
import model.Agents.Person;
import model.Contacts.Address;
import model.Contacts.Contact;
import model.Contacts.Email;
import model.Contacts.Phone;
import model.Contacts.Telegram;
import model.Contacts.Vkontakte;
import presenter.Presenter;
import view.View;

public class Main {
    public static void main(String[] args) {

        // #region
        List<CounterAgent> counterAgents = new ArrayList<>();
        List<Contact> ivanContacts = new ArrayList<>();
        ivanContacts.add(new Phone("9114062531"));
        ivanContacts.add(new Telegram("vanya_tg"));
        ivanContacts.add(new Email("vanya1996@mail.ru"));
        Person ivan = new Person("Ivan", ivanContacts);
        List<Contact> cleaningContacts = new ArrayList<>();
        cleaningContacts.add(new Address("г. Петрозаводск, ул. Володарского, д. 16"));
        cleaningContacts.add(new Vkontakte("cleanworld"));
        cleaningContacts.add(new Phone("771926"));
        Company cleanWorld = new Company("Чистый мир", cleaningContacts);
        counterAgents.add(cleanWorld);
        counterAgents.add(ivan);
        // #endregion

        Presenter presenter = new Presenter(new View(), new Model(counterAgents));
        presenter.start();
    }
}
