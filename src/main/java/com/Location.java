package main.java.com;

import main.java.com.label.LabelSet;
import main.java.com.label.Label;

public class Location {
    private int x;
    private int y;
    private String code;
    private LabelSet labels;

    public Location(int x, int y, String code) {
        this.x = x;
        this.y = y;
        this.code = code;
        this.labels = new LabelSet();
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public LabelSet getLabelSet() {
        return labels;
    }

    public void addLabel(Label label) {
        this.labels.addLabel(label);
    }
}
