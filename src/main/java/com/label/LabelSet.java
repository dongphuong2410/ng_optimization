package main.java.com.label;

import java.util.HashSet;

import main.java.com.label.Label;
import main.java.com.label.InclusiveLabel;
import main.java.com.label.ExclusiveLabel;

public class LabelSet {
    private HashSet<InclusiveLabel> inSet;
    private HashSet<ExclusiveLabel> exSet;

    public LabelSet() {
        inSet = new HashSet<InclusiveLabel>();
        exSet = new HashSet<ExclusiveLabel>();
    }

    public void addLabel(InclusiveLabel label) {
        inSet.add(label);
    }

    public void addLabel(ExclusiveLabel label) {
        exSet.add(label);
    }
}
