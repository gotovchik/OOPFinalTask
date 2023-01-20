package model;

public class Phone implements Contact {
    private String name;
    private String value;

    public Phone(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public String getValue() {
        return value;
    }

    
    
}
