package finalproject;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.time.Year;

public class Start {

	private static List<Project> projects;
	private List<Customer> customers;

	public Start() {

		projects = new ArrayList<>();
		mainMenu();

	}

	private void mainMenu() {
		System.out.println("++++MAIN MENU++++");
		menuSelection();
		switch (assistant.intSelection("Chose your selection", 1, 4)) {
		case 1:
			projectsSubMenu();
			break;
//		case 2:
//			customersSubMenu();
//			break;
//		case 3:
//			emoloyeesSubMenu();
//			break;
		case 4:
			System.out.println("Goodbye");
		}

	}

	private void projectsSubMenu() {
		System.out.println();
		System.out.println("***PROJECTS***");
		subMenuSelection();
		switch (assistant.intSelection("Choose your action", 1, 5)) {
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

	private void modifyProject() {
		showProjects(false);
		int i = assistant.intSelection("Please select project you want to modify", 1, projects.size()) - 1;
		projectsInfo(i);
		switch (assistant.intSelection("What would you like to modify in selected project", 1, 3)) {

		case 1:
			projects.get(i).setProjectNumber(assistant.acceptString("Enter new project number"));
			break;
		case 2:
			projects.get(i).setName(assistant.acceptString("Enter new name for the project"));
			break;
		case 3:
			projects.get(i).getCustomer().setName(assistant.acceptString("Enter new name for the cutomer"));
			break;
		case 4:
			projectsSubMenu();
		}

	}

	private void deleteProject() {
		showProjects(false);
		projects.remove(assistant.intSelection("Please select project you want to remove", 1, projects.size()) - 1);
		projectsSubMenu();
	}

	private void addProject() {
		Project p = new Project();
		p.setProjectNumber(
				Year.now().toString() + "-" + projects.size()/* assistant.acceptString("Enter project number") */);
		p.setName(assistant.acceptString("Enter project name"));
		p.setCustomer(new Customer(null, assistant.acceptString("Enter customer name"), null, null));
		p.setCreated(new Date());
		projects.add(p);
		projects.get(projects.size() - 1).setProjectNumber(Year.now().toString() + "-" + String.format("%0" + 4 + "d", projects.size()));
		projectsSubMenu();
	}

	boolean sm = true;

	private void showProjects(boolean sm) {
		System.out.println();
		int i = 1;
		for (Project project : projects) {
			System.out.println(i + ". " + project.getName() + " (" + project.getProjectNumber() + ")");
			i++;
		}
		System.out.println();
		if (sm) {
			System.out.println("1. Show additional info\n2. Back to project menu");
			switch (assistant.intSelection("Choose action", 1, 2)) {
			case 1:
				projectsInfo();
				break;
			case 2:
				projectsSubMenu();
			}
		}
	}

	private void showProjects() {
		System.out.println();
		int i = 1;
		for (Project project : projects) {
			System.out.println(i + ". " + project.getName() + " (" + project.getProjectNumber() + ")");
			i++;
		}
		System.out.println();
		if (sm) {
			System.out.println("1. Show additional info\n2. Back to project menu");
			switch (assistant.intSelection("Choose action", 1, 2)) {
			case 1:
				projectsInfo();
				break;
			case 2:
				projectsSubMenu();
			}

			projectsSubMenu();
		}
	}

	private void projectsInfo() {
		int p = assistant.intSelection("Select project", 1, projects.size()) - 1;
		System.out.printf("1. Project number: %s\n2. Project name: %s\n3. Customer Name: %s\n4. Created: %s",
				projects.get(p).getProjectNumber(), 
				projects.get(p).getName(), 
				projects.get(p).getCustomer().getName(),
				projects.get(p).getCreated().toString()
				);
		System.out.println();
		projectsSubMenu();
	}

	private void projectsInfo(int p) {
		System.out.printf("1. Project number: %s\n2. Project name: %s\n3. Customer Name: %s",
				projects.get(p).getProjectNumber(), 
				projects.get(p).getName(), 
				projects.get(p).getCustomer().getName()
				);
		System.out.println();
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
		// System.out.println(projects.size());

	}

}
