package main.java.com.label;

import main.java.com.label.Label;
import main.java.com.Constants;

public class ExclusiveLabel extends Label {
    public ExclusiveLabel(String type, String value) {
        super(type, value);
    }

    public int distanceTo(Label label) {
        if (label instanceof ExclusiveLabel)
            if (this.type.equals(label.getType())
                && !this.value.equals(label.getValue()))
                return Constants.ZERO_DISTANCE;
        return Constants.NORMAL_DISTANCE;
    }
}
