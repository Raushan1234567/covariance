package com.masai;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;



public class Main {
    public static void main(String[] args) {
        List<Trainee> traineeList = new ArrayList<>();
        traineeList.add(new Trainee("T001", "Ajay", 4.75));
        traineeList.add(new Trainee("T002", "Zakir", 4.25));
        traineeList.add(new Trainee("T003", "Nayan", 2.25));
        traineeList.add(new Trainee("T004", "Abhishek", 3.25));
        traineeList.add(new Trainee("T005", "Neha", 3.75));

        List<Manager> ml = traineeList.stream()
                .filter(trainee -> trainee.getRating() >= 3.0)
                .map(trainee -> {
                    String managerId = trainee.getTraineeId().replaceFirst("T", "M");
                    String designation = null;
                    String location = null;
                    if (trainee.getRating() >= 4.5) {
                        designation = "People manager";
                        location = "Headquarter";
                    } else if (trainee.getRating() >= 3.5) {
                        designation = "Branch manager";
                        location = "Branch Office";
                    } else if (trainee.getRating() >= 3.0) {
                        designation = "Junior manager";
                        location = "Kiosk";
                    }
                    return new Manager(managerId, trainee.getName(), designation, location);
                })
                .collect(Collectors.toList());

      
        System.out.println("Manager List:");
        ml.forEach(b -> {
        	System.out.println(b);
        }
        );

       
        System.out.println("Managers in Headquarter or Kiosk:");
        Consumer<Manager> m = manager -> {
            String location = manager.getLocation();
            if (location.equals("Headquarter") || location.equals("Kiosk")) {
                System.out.println(manager.getName() + " whose id is " + manager.getManagerId() + " is in " + location);
            }
        };
        ml.forEach(m);

        List<String> em=ml.stream().map(e ->e.getManagerId()).collect(Collectors.toList());
        
        
        System.out.println("Id of that trainee who not selected as Manager");
     List<Trainee> s=traineeList.stream().filter(a -> a.getRating()<3).toList();
     s.forEach(b -> {
    	 System.out.println(b.getTraineeId());
     });
     
     
        
    }
}
