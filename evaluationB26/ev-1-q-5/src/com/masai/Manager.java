package com.masai;

public class Manager {
    private String managerId;
    private String name;
    private String designation;
    private String location;

    public Manager(String managerId, String name, String designation, String location) {
        this.managerId = managerId;
        this.name = name;
        this.designation = designation;
        this.location = location;
    }

    public String getManagerId() {
        return managerId;
    }

    public void setManagerId(String managerId) {
        this.managerId = managerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

	@Override
	public String toString() {
		return "Manager [managerId=" + managerId + ", name=" + name + ", designation=" + designation + ", location="
				+ location + "]";
	}

}
