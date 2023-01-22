package presenter;

import java.util.Scanner;

import model.Model;
import view.View;

public class Presenter {
    private View view;
    private Model model;

    public Presenter(View view, Model model) {
        this.view = view;
        this.model = model;
    }

    public void start() {
        view.greeting();
        Scanner in = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            view.showMenu();
            int menuChoice = in.nextInt();
            switch (menuChoice) {
                case (1):
                    view.showAllContacts(model.getCounterAgents());
                    break;
                case (2):
                    System.out.println("Введите имя контакта/название организации для поиска:");
                    String name = in.next();
                    view.showCounterAgent(model.findAgentByName(name));
                    break;
                case (3):
                    view.addAgentMenu();
                    int addAgentMenuChoise = in.nextInt();
                    System.out.println("Введите наименование нового контакта:");
                    String newName = in.next();
                    model.addAgent(addAgentMenuChoise, newName, view.addContactMenu(in));
                    System.out.println("Контакт успешно добавлен!");
                    break;
                case (4):
                    System.out.println("Введите имя контакта, который хотите удалить:");
                    String removeName = in.next();
                    model.removeContact(removeName);
                    System.out.println("Контакт удален!");
                    break;
                case (5):
                    model.addNewContact(view.addContactName(in), view.addContactMenu(in));
                    System.out.println("Способ связи успешно добавлен!");
                case (6):
                    // TODO
                    break;
                case (0):
                    view.goodBye();
                    flag = false;
            }
        }
        in.close();
    }
}
