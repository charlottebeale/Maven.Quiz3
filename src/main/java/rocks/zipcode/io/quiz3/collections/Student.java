package rocks.zipcode.io.quiz3.collections;

import java.util.List;
import java.util.Comparator;
import java.util.ArrayList;
/**
 * @author leon on 10/12/2018.
 */


public class Student {

   private List<Lab> labs;

    public Student() {

   this(new ArrayList<>());
    }

    public Student(List<Lab> labs) {
        this.labs = labs;
    }

    public Lab getLab(String labName) {
        Lab retrieved = null;
        for (Lab lab : labs) {
            if (lab.getName().equals(labName)) {
                retrieved = lab;
            }
        }
        return retrieved;
    }

    public void setLabStatus(String labName, LabStatus labStatus) {
         Lab toSet = getLab(labName);
        if (toSet == null) {
            throw new UnsupportedOperationException("Lab has not been forked");
        } else {
            toSet.setStatus(labStatus);
        }
    }

    public void forkLab(Lab lab) {
       labs.add(lab);
    }

    public LabStatus getLabStatus(String labName) {
        return getLab(labName).getStatus();
    }

    @Override
    public String toString() {
        String str = "";
        labs.sort(Comparator.comparing(Lab::getName));
        for (Lab lab : labs) {
            str += String.format("%s > %s\n", lab.getName(), lab.getStatus());
        }
        return str.trim();
    }
}