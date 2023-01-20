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
        System.out.println("Вас приветствует приложение \"Мои контакты\"!");
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("Выберите пункт меню: ");
            System.out.println("  [1 + Enter] - Посмотреть список всех контактов");
            System.out.println("  [2 + Enter] - Найти контакт");
            System.out.println("  [3 + Enter] - Добавить контакт");
            System.out.println("  [4 + Enter] - Удалить контакт");
            System.out.println("  [5 + Enter] - Добавить новый способ связи с контактом");
            System.out.println("  [6 + Enter] - Удалить способ связи с контактом");
            System.out.println("  [0 + Enter] - Выход из приложения");
            int choice = in.nextInt();
            switch(choice) {
                case(1):
                    view.showCounterAgents(model.getCounterAgents());
                    break;
                case(2):
                    //TODO
                    break;
                case(3):
                    //TODO
                    break;
                case(4):
                    //TODO
                    break;
                case(5):
                    //TODO
                    break;
                case(6):
                    //TODO
                    break;
                case(0):
                    System.out.println("Спасибо, что воспользовались приложением \"Мои контакты\".\n Всего доброго!");
                    in.close();
                    return;
            }
        }
    }
    
}
