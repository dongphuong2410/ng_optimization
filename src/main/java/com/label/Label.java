package main.java.com.label;

public abstract class Label {
    protected String value; 

    public Label(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public abstract int distanceTo(Label label);
}
