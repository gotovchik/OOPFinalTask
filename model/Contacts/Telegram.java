package model.Contacts;

public class Telegram implements Contact {
    private String id;

    public Telegram(String id) {
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
        return "Telegram id:  " + id;
    }

    
}
