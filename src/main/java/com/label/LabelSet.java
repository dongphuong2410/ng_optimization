package main.java.com.label;

import java.util.HashSet;
import java.util.Iterator;

import main.java.com.label.Label;
import main.java.com.label.InclusiveLabel;
import main.java.com.label.ExclusiveLabel;
import main.java.com.Constants;

public class LabelSet {
    private HashSet<Label> labels;

    public LabelSet() {
        labels = new HashSet<Label>();
    }

    public void addLabel(Label label) {
        labels.add(label);
    }

    public int distanceTo(LabelSet target) {
        int sum = 0;
        int count = 0;
        Iterator<Label> i = labels.iterator();
        Iterator<Label> j = target.labels.iterator();
        if (!i.hasNext() || !j.hasNext()) {
            return Constants.NORMAL_DISTANCE;
        }
        while (i.hasNext()) {
            Label lbl_one = i.next();
            while (j.hasNext()) {
                Label lbl_two = j.next();
                int dist = lbl_one.distanceTo(lbl_two);
                if (dist == 0)
                    return Constants.ZERO_DISTANCE;
                else {
                    sum += dist;
                    count++;
                }
            }
        }
        return sum / count;
    }

    public void combine(LabelSet target) {
        Iterator<Label> i = target.labels.iterator();
        while (i.hasNext()) {
            this.labels.add(i.next());
        }
    }
}
