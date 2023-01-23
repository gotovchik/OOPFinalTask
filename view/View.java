package view;

import java.util.List;
import java.util.Scanner;

import model.Agents.CounterAgent;
import model.Contacts.Address;
import model.Contacts.Contact;
import model.Contacts.Email;
import model.Contacts.Phone;
import model.Contacts.Telegram;
import model.Contacts.Vkontakte;

public class View {
    private void showContactMenu() {
        System.out.println("Выберите тип способа связи:");
        System.out.println("  [1 + Enter] - Телефон");
        System.out.println("  [2 + Enter] - Email");
        System.out.println("  [3 + Enter] - VK");
        System.out.println("  [4 + Enter] - Telegram");
        System.out.println("  [5 + Enter] - Адрес");
    }

    public void showCounterAgent(List<CounterAgent> counterAgents) {
        if (counterAgents.isEmpty()) {
            System.out.println("Список пуст/контактов по запросу не найдено.");
        } else {
            for (CounterAgent CounterAgent : counterAgents) {
                System.out.println(CounterAgent.toString());
                System.out.println("--------------------------------");
            }
        }
    }

    public void showAllContacts(List<CounterAgent> counterAgents) {
        System.out.println("--------------------------------");
        if (counterAgents.isEmpty()) {
            System.out.println("Список пуст/контактов по запросу не найдено.");
        } else {
            for (CounterAgent counterAgent : counterAgents) {
                System.out.println(counterAgent.getName());
                System.out.println("--------------------------------");
            }
        }

    }

    public void showMenu() {
        System.out.println("Выберите пункт меню: ");
        System.out.println("  [1 + Enter] - Посмотреть список всех контактов");
        System.out.println("  [2 + Enter] - Найти контакт");
        System.out.println("  [3 + Enter] - Добавить контакт");
        System.out.println("  [4 + Enter] - Удалить контакт");
        System.out.println("  [5 + Enter] - Добавить новый способ связи с контактом");
        System.out.println("  [6 + Enter] - Удалить способ связи с контактом");
        System.out.println("  [0 + Enter] - Выход из приложения");
    }

    public void greeting() {
        System.out.println("Вас приветствует приложение \"Мои контакты\"!");
    }

    public void goodBye() {
        System.out.println("Спасибо, что воспользовались приложением \"Мои контакты\".\nВсего доброго!");
    }

    public void addAgentMenu() {
        System.out.println("Выберите тип контакта:");
        System.out.println("  [1 + Enter] - Физическое лицо");
        System.out.println("  [2 + Enter] - Юридическое лицо");
    }

    public Contact contactMenu(Scanner sc) {
        showContactMenu();
        int addContactMenuChoice = sc.nextInt();
        String value = "";
        Contact contact = null;
        switch (addContactMenuChoice) {
            case 1:
                System.out.println("Введите номер телефона:");
                value = sc.next();
                contact = new Phone(value);
                break;
            case 2:
                System.out.println("Введите адрес Email:");
                value = sc.next();
                contact = new Email(value);
                break;
            case 3:
                System.out.println("Введите id VK:");
                value = sc.next();
                contact = new Vkontakte(value);
                break;
            case 4:
                System.out.println("Введите id Telegram:");
                value = sc.next();
                contact = new Telegram(value);
                break;
            case 5:
                System.out.println("Введите адрес:");
                value = sc.next();
                contact = new Address(value);
                break;
        }
        return contact;

    }

    public String getContactName(Scanner sc) {
        System.out.println("Введите имя контакта, которому нужно добавить/удалить способ связи:");
        String getContactName = sc.next();
        return getContactName;
    }

    public String getContactValue(Scanner sc) {
        System.out.println("Введите номер телефона/адрес/vk/tg/email, который хотете удалить: ");
        return sc.next();
    }
}
