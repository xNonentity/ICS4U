import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
/**
 * Jennifer Nguyen
 * This is the school system that adds students, removes, prints and sorts with a series of different methods.
 * @author 323397901
 *
 */
public class StudentInfo {
	static Student student1 = new Student();
	static int allStu;
	static Scanner input = new Scanner(System.in);
	static int numStu;
	static String filename = "students.txt";
	static File f = new File(filename);
	static ArrayList<Student> stuRecs = new ArrayList<Student>(); //the array list that stores the students
	
	//Enum of the provinces
	enum province {
		Nunavut, Quebec, Northwest, Ontario, BritishColumbia, Alberta, Saskatchewan, Manitoba, Yukon, Newfoundland, NewBrunswick, NovaScotia, PrinceEdwardIsland
	}
/**
 * The menu of the student system
 * @param args
 * @throws IOException
 */
	public static void main(String[] args) throws IOException {

		int menuOption;
		boolean quit = false;
		// menu
		do {
			// Prints out the options
			System.out.println("Hello, this is the school system's information board.");
			System.out.println("Input one of the following options.");
			System.out.println("1. Enter a new student.");
			System.out.println("2. Print student information.");
			System.out.println("3. Print all student information.");
			System.out.println("4. Remove a student.");
			System.out.println("5. Search for a student.");
			System.out.println("6. Save the records.");
			System.out.println("7. Print saved records.");
			System.out.println("10. Quit");
			menuOption = input.nextInt();
			// Corresponds to what the user chooses from the menu
			if (menuOption == 1) {
				studentInfo();
				input.nextLine();
			} else if (menuOption == 2) {
				System.out.println("Please enter the number of the student you'd like to print.");
				numStu = input.nextInt();
				printInfo(stuRecs.get(numStu - 1));
			} else if (menuOption == 3) {
				printAll(student1);
			} else if (menuOption == 4) {
				removeStudent();
			} else if (menuOption == 5) {
				searchStudent();
			} else if (menuOption == 6) {
				save();
			} else if (menuOption == 7) {
				output();
			}  else if (menuOption == 10) {
				System.out.println("Have a nice day!");
				quit = true; // Breaks out the loop
			}
		} while (quit == false);
		System.exit(0);
	}
/**
 * Setting everything (getting the useres input)
 */
	public static void studentInfo() {
		// Student student1 = new Student();
		// First Name
		System.out.println("");
		System.out.println("Please input your first name.");
		student1.setFirstName(input.nextLine());
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
		boolean posCode = false;
		String posNum;
		while (posCode == false) { //Checks the postal code for a valid code
			posNum = input.nextLine();
			if (posNum.length() == 6) {
				if (posNum.charAt(0) != 0 && posNum.charAt(0) != 9) {
					if (posNum.charAt(2) != 0 && posNum.charAt(2) != 9) {
						if (posNum.charAt(4) != 0 && posNum.charAt(4) != 9) {
							student1.setPosCode(posNum);
							posCode = true;
						} else {
							System.out.println("Please input a valid postal code.");
						}
					}
				} else {
					System.out.println("Please input a valid postal code.");
				}
			} else {
				System.out.println("Please input a valid postal code.");
			}
		}
		// Phone Number
		System.out.println("Please inset your phone number.");
		student1.setPhoneNum(Long.parseLong(input.nextLine()));
		// Birth month
		System.out.println("Please insert your birth month.");
		student1.setBirthMonth(input.nextLine());
		// Birth day
		System.out.println("Please insert your birth day.");
		student1.setBirthDay(Integer.parseInt(input.nextLine()));
		// Birth Year
		System.out.println("Please insert your birth year.");
		student1.setBirthYear(input.nextInt());
		System.out.println("");
		allStu++;
		stuRecs.add(student1); // Adding the student
	}
/**
 * This prints the student information
 * @param student1
 * @throws FileNotFoundException
 */
	public static void printInfo(Student student1) throws FileNotFoundException {
		//Printing the students information
		System.out.println("Student Number: " + student1.getStudentNumber());
		System.out.println(student1.getFirstName() + " " + student1.getLastName());
		System.out.println(student1.getStreetNum() + " " + student1.getStrName());
		System.out.println(student1.getCityName());
		province terrNun = province.Nunavut;
		province terrNorth = province.Northwest;
		province terrYuk = province.Yukon;
		province provQue = province.Quebec;
		province provOn = province.Ontario;
		province provBrit = province.BritishColumbia;
		province provAlb = province.Alberta;
		province provSas = province.Saskatchewan;
		province provMan = province.Manitoba;
		province provNew = province.Newfoundland;
		province provNewB = province.NewBrunswick;
		province provNova = province.NovaScotia;
		province provPEI = province.PrinceEdwardIsland;
		if (student1.getProvName().equals(terrNun)) {
			provinces(terrNun);
		} else if (student1.getProvName().equals(terrNorth)) {
			provinces(terrNorth);
		} else if (student1.getProvName().equals(terrYuk)) {
			provinces(terrYuk);
		} else if (student1.getProvName().equals(provQue)) {
			provinces(provQue);
		} else if (student1.getProvName().equals("Ontario")) {
			provinces(provOn);
		} else if (student1.getProvName().equals(provBrit)) {
			provinces(provBrit);
		} else if (student1.getProvName().equals(provAlb)) {
			provinces(provAlb);
		} else if (student1.getProvName().equals(provSas)) {
			provinces(provSas);
		} else if (student1.getProvName().equals(provMan)) {
			provinces(provMan);
		} else if (student1.getProvName().equals(provNew)) {
			provinces(provNew);
		} else if (student1.getProvName().equals(provNewB)) {
			provinces(provNewB);
		} else if (student1.getProvName().equals(provNova)) {
			provinces(provNova);
		} else if (student1.getProvName().equals(provPEI)) {
			provinces(provQue);
		}
		System.out.println(student1.getPosCode());
		System.out.println(student1.getPhoneNum());
		System.out.println(student1.getBirthMonth() + " " + student1.getBirthDay() + " " + student1.getBirthYear());
		System.out.println("");
	}
	/**
	 * Removes the student the user woud like 
	 */
	public static void removeStudent() {
		// inputting a number that matches to a specific student to remove.
		System.out.println("Please enter the student number of the student you'd like to remove.");
		numStu = input.nextInt();
		if (numStu > 300000000) {
			stuRecs.remove(numStu - 300000001);
		}
	}
/**
 * Searches the student the user wants to like
 * @throws FileNotFoundException
 */
	public static void searchStudent() throws FileNotFoundException {
		//Searching a specific student that will
		System.out.println("Please enter the student number of the student you're looking for.");
		numStu = input.nextInt();
		if (numStu > 300000000) {
			printInfo(stuRecs.get(numStu - 300000001));
		}
	}
/**
 * Prints all the students that have been entered into the system.
 * @param student2
 * @throws FileNotFoundException
 */
	public static void printAll(Student student2) throws FileNotFoundException {
		//This prints out all the students that have been entered into the system(array)
		for (int i = 0; i < stuRecs.size(); i++) {

			int totalStu = i + 1;
			System.out.println("Students: " + totalStu);
			printInfo(stuRecs.get(i));
			System.out.println("");
		}
	}
/**
 * Sorts the array
 */
	public static void sortRecords() {
		//Sorts the array
		Collections.sort(stuRecs);
	}
/**
 * Saving everything that has been inputted
 */
	public static void save() {
		//This will save everything that has been entered into the school system or array
		if (f.exists()) {
			FileOutputStream fileOutputStream;
			try {
				fileOutputStream = new FileOutputStream(f);
				PrintStream fps = new PrintStream(fileOutputStream);
				fps.println(stuRecs.size());
				for (int i = 0; i < stuRecs.size(); i++) {
					fps.println(stuRecs.get(i).toString());
				}
				fileOutputStream.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			try {
				f.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void output() throws IOException {
		FileOutputStream fileOutputStream = new FileOutputStream(f);
		PrintStream fps = new PrintStream(fileOutputStream);
		fps.print(f);
		fileOutputStream.close();
	}
/**
 * The enums to print out for provinces and territories
 * @param province
 */
	public static void provinces(province province) {
		//Enums to the provinces and territories
		switch (province) {
		case Nunavut:
			System.out.println("Territory: " + student1.getProvName());
			break;
		case Quebec:
			System.out.println("Province: " + student1.getProvName());
			break;
		case Northwest:
			System.out.println("Territory: " + student1.getProvName());
			break;
		case Ontario:
			System.out.println("Province: " + student1.getProvName());
			break;
		case BritishColumbia:
			System.out.println("Province: " + student1.getProvName());
			break;
		case Alberta:
			System.out.println("Province: " + student1.getProvName());
			break;
		case Saskatchewan:
			System.out.println("Province: " + student1.getProvName());
			break;
		case Manitoba:
			System.out.println("Province: " + student1.getProvName());
			break;
		case Yukon:
			System.out.println("Territory: " + student1.getProvName());
			break;
		case Newfoundland:
			System.out.println("Province: " + student1.getProvName());
			break;
		case NewBrunswick:
			System.out.println("Province: " + student1.getProvName());
			break;
		case NovaScotia:
			System.out.println("Province: " + student1.getProvName());
			break;
		case PrinceEdwardIsland:
			System.out.println("Province: " + student1.getProvName());
			break;
		}
	}
}
