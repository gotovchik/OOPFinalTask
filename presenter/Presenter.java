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
            int choice = in.nextInt();
            switch (choice) {
                case (1):
                    view.showCounterAgents(model.getCounterAgents());
                    break;
                case (2):
                    System.out.println("Введите имя контакта/название организации для поиска:");
                    String name = in.next();
                    view.showCounterAgents(model.findAgentByName(name));
                    break;
                case (3):
                    // TODO
                    break;
                case (4):
                    // TODO
                    break;
                case (5):
                    // TODO
                    break;
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
