package Test;

import java.util.Collection;
import java.util.Scanner;

import MODELS.Developer;
import Services.DeveleporServices;



public class Developer_test {
public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
			DeveleporServices service = new DeveleporServices();
			int i;
			String n,b;
			double p;

			while(true) {
				System.out.println("******Enter your choice*******");
				System.out.println("1. Add new developer \n2. list all developers\n3. view developer by id\n4.Delete Developer by id\n5.update developer by id\n6.exit");
				int choice = sc.nextInt();
				switch(choice) {
				case 1: //add
					System.out.println("Enter the developer id, name , branch and budget(in CRORE)1");
					i = sc.nextInt();
					n = sc.next();
					b = sc.next();
					p = sc.nextDouble();
					Developer d = new Developer(i,n,b,p);
					service.addDevlper(d);
					System.out.println("Developer added succesfully !!");
					break;
				case 2: // List
					Collection<Developer> allDevelopers = service.getAllDevelopers();
					allDevelopers.forEach(Devlper -> System.out.println(Devlper));
					break;

				case 3: // get by id 
					System.out.println("Enter the developer id to view Details");
					i = sc.nextInt();
					try {
						Developer developer = service.getDeveloperById(i);
						System.out.println(developer);

					}
					catch (Exception e) {
						System.err.println("Please enter the valid developer id");
					}
					break;
				case 4: // delete 
					System.out.println("Enter the developer id to delete details");
					i = sc.nextInt();
					try {
						service.deleteDeveloperById(i);
						System.out.println("Student Deleted Successfully!!");
					}
					catch(Exception e ) {
						System.err.println("Please enter the valid developer id ");
						}
					break;
				case 5:// update
					System.out.println("Enter the developer id to update details");
					i = sc.nextInt();
					try {
						Developer developer = service.getDeveloperById(i);
						System.out.println("the Existing details are:");
						System.out.println(developer);
						System.out.println("Enter new name, branch and percent");
						n = sc.next();
						b = sc.next();
						p = sc.nextDouble();
						developer.setName(n);
						developer.setBranch(b);
						developer.setBUDGET(i);
						Developer updated = service.updateDeveloperById(developer);
						System.out.println("Updated developer details are:");
						System.out.println(updated);
					}
					catch (Exception e) {
						System.err.println("Please enter the valid developer id");
					}
					break;
					
				case 6: // Exit
					System.out.println("Thank you for using the developer App!!");
					System.out.println("Application will be closed ");
					System.exit(0);
					break;
					default: 
						System.err.println("Kindly enter the valid choice ");

				}

				}
		



		}

	}


