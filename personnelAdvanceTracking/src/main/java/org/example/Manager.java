package org.example;

import java.util.ArrayList;

public class Manager extends Personnel {
    ArrayList<Manager> managers = new ArrayList<>();

    public Manager(String firstName, String lastName, String title, double salary, int employmentDate) {
        super(firstName, lastName, title, salary, employmentDate);
    }

    public void addPersonnel(Manager mng) {
        managers.add(mng);
        personnels.add(mng);
    }

    public void removePersonnel(Manager mng) {
        for (Manager manager : managers) {
            if (manager.fullName() == mng.fullName()) {
                manager = null;
                break;
            }
        }
        for (Personnel personnel : personnels) {
            if (personnel.fullName() == mng.fullName()) {
                personnel = null;
                break;
            }
        }
    }


}
