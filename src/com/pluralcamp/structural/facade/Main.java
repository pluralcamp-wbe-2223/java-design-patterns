package com.pluralcamp.structural.facade;

public class Main {
	public static void main(String[] args) {
		System.out.println("***Facade Pattern Demo***\n");
		// Creating Robots
		RobotFacade milanoRobotFacade = new RobotFacade();
		milanoRobotFacade.constructMilanoRobot();
		RobotFacade robonautRobotFacade = new RobotFacade();
		robonautRobotFacade.constructRobonautRobot();
		// Destroying robots
		milanoRobotFacade.destroyMilanoRobot();
		robonautRobotFacade.destroyRobonautRobot();
	}
}
