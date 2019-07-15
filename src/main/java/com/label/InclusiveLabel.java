package main.java.com.label;

import main.java.com.label.Label;
import main.java.com.Constants;

public class InclusiveLabel extends Label {
    public InclusiveLabel(String type, String value) {
        super(type, value);
    }

    public int distanceTo(Label label) {
        if (label instanceof InclusiveLabel)
            if (this.type.equals(label.getType())
                && this.value.equals(label.getValue()))
                return Constants.FAVOR_DISTANCE;
        return Constants.NORMAL_DISTANCE;
    }
}
