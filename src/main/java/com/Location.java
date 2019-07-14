package main.java.com;

public class Location {
    private int x;
    private int y;
    private String code;

    public Location(int x, int y, String code) {
        this.x = x;
        this.y = y;
        this.code = code;
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

}
