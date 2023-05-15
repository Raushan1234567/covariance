package part.c;

import java.util.*;

interface HumanOperations {
    void computeBMI(List<Human> hl);

    void printRemark(List<Human> hl);
}

public class Mian {
    public static void main(String[] args) {
        List<Human> hl = new ArrayList<>();
        hl.add(new Human(65, 1.7));
        hl.add(new Human(75, 1.6));
        hl.add(new Human(45, 1.4));
        hl.add(new Human(45, 1.7));
        hl.add(new Human(48, 1.2));
        hl.add(new Human(92, 1.6));
        hl.add(new Human(116, 1.65));

        HumanOperations operations = new HumanOperations() {
            @Override
            public void computeBMI(List<Human> hl) {
                for (Human human : hl) {
                    double bmi = human.getWeight() / (human.getHeight() * human.getHeight());
                    bmi = Math.round(bmi * 10) / 10.0;
                    human.setBodyMassIndex(bmi);
                }
            }

            @Override
            public void printRemark(List<Human> hl) {
                for (Human human : hl) {
                    double bmi = human.getBodyMassIndex();
                    String remark;
                    if (bmi < 18.5) {
                        remark = "Underweight";
                    } else if (bmi >= 18.5 && bmi <= 24.9) {
                        remark = "Normal";
                    } else if (bmi >= 25.0 && bmi <= 29.9) {
                        remark = "Overweight";
                    } else if (bmi >= 30.0 && bmi <= 34.9) {
                        remark = "Obese";
                    } else {
                        remark = "Extreme Obese";
                    }
                    System.out.println(remark + ", your BMI is " + bmi);
                }
            }
        };

        operations.computeBMI(hl);
        
        
        operations.printRemark(hl);
    }
}