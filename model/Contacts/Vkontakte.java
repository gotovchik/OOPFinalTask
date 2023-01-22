package model.Contacts;

public class Vkontakte implements Contact {
    private String id;

    public Vkontakte(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "vk.com/" + id;
    }

}
