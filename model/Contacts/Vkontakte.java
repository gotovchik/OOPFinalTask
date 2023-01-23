package model.Contacts;

public class Vkontakte implements Contact {
    private String name;

    public Vkontakte(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "vk.com/" + name;
    }

    @Override
    public String getName() {
        return name;
    }
}
