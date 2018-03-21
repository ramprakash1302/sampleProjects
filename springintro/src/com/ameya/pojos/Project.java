package com.ameya.pojos;

public class Project {
	private String projectName;
	private int noOfDays;
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public int getNoOfDays() {
		return noOfDays;
	}
	public void setNoOfDays(int noOfDays) {
		this.noOfDays = noOfDays;
	}
	@Override
	public String toString() {
		return "Project [projectName=" + projectName + ", noOfDays=" + noOfDays + "]";
	}
	
}
