import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StudentInfo {
	
	static Student student1 = new Student();
	static int allStu;
	static Scanner input = new Scanner(System.in);
	static int numStu;
	static ArrayList<Student> names = new ArrayList<Student>();

	public static void main(String[] args) {

		int menuOption;
		boolean quit = false;

		// menu
		do {
			System.out.println("Hello, this is the school system's information board.");
			System.out.println("Input one of the following options.");
			System.out.println("1. Enter a new student.");
			System.out.println("2. Print student information.");
			System.out.println("3. Print all student information.");
			System.out.println("4. Remove a student.");
			System.out.println("5. Search for a student.");
			System.out.println("6. Sort out the student records.");
			System.out.println("10. Quit");

			menuOption = Integer.parseInt(input.nextLine());

			if (menuOption == 1) {
				studentInfo();
			} else if (menuOption == 2) {
				System.out.println("Please enter the number of the student you'd like to print.");
				numStu = Integer.parseInt(input.nextLine());
				printInfo(names.get(numStu - 1));
			} else if (menuOption == 3) {
				printAll();
			} else if (menuOption == 4) {
				removeStudent();
			} else if (menuOption == 5) {
				searchStudent();
			} else if (menuOption == 6) {
				sortRecords(); 
			} else if (menuOption == 7) {

			} else if (menuOption == 8) {

			} else if (menuOption == 9) {

			} else if (menuOption == 10) {
				System.out.println("Have a nice day!");
				quit = true;
			}

		} while (quit == false);
		System.exit(0);
	}

	public static void studentInfo() {
		String codeInput;

		// First Name
		System.out.println("Please input your first name.");
		student1.setFirstName(input.nextLine());
		// Last Name
		System.out.println("Please input your last name.");
		student1.setLastName(input.nextLine());
		// Street Number
		System.out.println("Please input your street number.");
		student1.setStreetNum(Integer.parseInt(input.nextLine()));
		// Street Name
		System.out.println("Please input your street name.");
		student1.setStrName(input.nextLine());
		// City
		System.out.println("Please input your city.");
		student1.setCityName(input.nextLine());
		// Province
		System.out.println("Please input your province.");
		student1.setProvName(input.nextLine());
		// Postal Code
		System.out.println("Please input your postal code.");
		student1.setPosCode(input.nextLine());
		// Phone Number
		System.out.println("Please inset your phone number.");
		student1.setPhoneNum(input.nextLong());
		input.nextLine();
		// Birth month
		System.out.println("Please insert your birth month.");
		student1.setBirthMonth(input.nextLine());
		// Birth day
		System.out.println("Please insert your birth day.");
		student1.setBirthDay(Integer.parseInt(input.nextLine()));
		// Birth Year
		System.out.println("Please insert your birth year.");
		student1.setBirthYear(Integer.parseInt(input.nextLine()));
		allStu++;
		names.add(student1); // Adding the student
	}

	public static void printInfo(Student student1) {
		// Gets the information from the other class and prints
		System.out.println(student1.getFirstName() + " " + student1.getLastName());
		System.out.println(student1.getStreetNum() + " " + student1.getStrName());
		System.out.println(student1.getCityName() + ", " + student1.getProvName());
		System.out.println(student1.getPosCode());
		System.out.println(student1.getPhoneNum());
		System.out.println(student1.getBirthMonth() + " " + student1.getBirthDay() + " " + student1.getBirthYear());
		System.out.println("");
	}

	public static void removeStudent() {
		// inputting a number that matches to a specific student to remove.
		System.out.println("Please enter the number of the student you'd like to remove.");
		numStu = input.nextInt();
		names.remove(numStu - 1);
	}

	public static void searchStudent() {
		long num;
		System.out.println("Please enter the student number of the student you're looking for.");
		int studentNumber = input.nextInt();
		printInfo(names.get(studentNumber));

	}

	public static void printAll() {
		for (int i = 0; i < names.size(); i++) {

			int totalStu = i + 1;
			System.out.println("Students:" + totalStu);
			printInfo(names.get(i));
		}
	}
	
	public static void sortRecords() {
		Collections.sort(names);
	}
}
