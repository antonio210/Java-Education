package finalproject;

import java.util.ArrayList;
import java.util.List;

public class Start {

	private List<Project> projects;
	private List<Customer> customers;

	public Start() {

		projects = new ArrayList<>();
		mainMenu();

	}

	private void mainMenu() {
		System.out.println("++++MAIN MENU++++");
		menuSelection();
		switch (assistant.intSelection("Chose your selection:", 1, 4)) {
		case 1:
			projectsSubMenu();
			break;
		case 2:
			customersSubMenu();
			break;
		case 3:
			emoloyeesSubMenu();
			break;
		case 4:
			System.out.println("Goodbye");
		}

	}

	private void projectsSubMenu() {
		System.out.println("***PROJECTS***");
		subMenuSelection();
		switch (assistant.intSelection("Choose your action:", 1, 5)) {
		case 1:
			showProjects();
			break;
		case 2:
			addProject();
			break;
		case 3:
			modifyProject();
			break;
		case 4:
			deleteProject();
			break;
		case 5:
			mainMenu();
		}

	}

	private void addProject() {
		Project p = new Project();
		p.setProjectNumber(assistant.acceptString("Enter Project Number:"));
		p.setName(assistant.acceptString("Enter Project Name:"));
		p.setCustomer(new Customer(assistant.acceptString("Enter customer ID:"), null, null, null));
	}
	
	

	private void showProjects() {
		System.out.println();
		for (Project project : projects) {
			System.out.println(project.getName());
		}
		System.out.println();
		projectsSubMenu();
	}

	private void subMenuSelection() {
		StringBuilder s = new StringBuilder();
		s.append("1. Show all\n");
		s.append("2. Add new\n");
		s.append("3. Modify\n");
		s.append("4. Remove\n");
		s.append("5. Back to Main Menu");
		System.out.println(s);

	}

	private void menuSelection() {
		StringBuilder s = new StringBuilder();
		s.append("1. Projects\n");
		s.append("2. Customers\n");
		s.append("3. Employees\n");
		s.append("4. Exit");
		System.out.println(s);

	}

	public static void main(String[] args) {

		new Start();

	}

}
