package main.java.com.label;

public abstract class Label {
    protected String type;
    protected String value; 

    public Label(String type, String value) {
        this.type = type;
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public String getType() {
        return type;
    }

    public abstract int distanceTo(Label label);
}
