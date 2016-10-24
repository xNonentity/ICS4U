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

public class StudentInfo {

	static Student student1 = new Student();
	static int allStu;
	static Scanner input = new Scanner(System.in);
	static int numStu;
	static ArrayList<Student> stuRecs = new ArrayList<Student>();

	public static void main(String[] args) throws FileNotFoundException{

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
			System.out.println("6. Save the records.");
			System.out.println("10. Quit");

			menuOption = input.nextInt(); 

			if (menuOption == 1) {
				studentInfo();
				input.nextLine(); 
			} else if (menuOption == 2) {
				System.out.println("Please enter the number of the student you'd like to print.");
				numStu = Integer.parseInt(input.nextLine());
				printInfo(stuRecs.get(numStu - 1));
			} else if (menuOption == 3) {
				printAll(student1);
			} else if (menuOption == 4) {
				long remove; 
				boolean removal = false; 
				System.out.println("Please enter the student number of the student you'd like to remove.");
				remove = input.nextLong();
				while (removal = false){
					if (remove > 300000000){
						removeStudent(remove - 300000001);
						removal = true;
					}
				//input.nextLine(); 
				}
			} else if (menuOption == 5) {
				searchStudent();
			} else if (menuOption == 6) {
				save(); 
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
		Student student1 = new Student(); 
			// First Name
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
			while (posCode == false) {
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
			student1.setBirthYear(Integer.parseInt(input.nextLine()));
			allStu++;
			stuRecs.add(student1); // Adding the student
		
	}

	public static void printInfo(Student student1) throws FileNotFoundException {

		System.out.println("Student Number: " + student1.getStudentNumber());
		System.out.println(student1.getFirstName() + " " + student1.getLastName());
		System.out.println(student1.getStreetNum() + " " + student1.getStrName());
		System.out.println(student1.getCityName() + ", " + student1.getProvName());
		System.out.println(student1.getPosCode());
		System.out.println(student1.getPhoneNum());
		System.out.println(student1.getBirthMonth() + " " + student1.getBirthDay() + " " + student1.getBirthYear());
		System.out.println("");
	}

	public static void removeStudent(long num) {
		// inputting a number that matches to a specific student to remove.
		stuRecs.remove(num);
	}

	public static void searchStudent() throws FileNotFoundException {
		System.out.println("Please enter the student number of the student you're looking for.");
		int studentNumber = input.nextInt();
		printInfo(stuRecs.get(studentNumber));

	}
 
	public static void printAll(Student student2) throws FileNotFoundException {
		for (int i = 0; i < stuRecs.size(); i++) {

			int totalStu = i + 1;
			System.out.println("Students: " + totalStu);
			printInfo(stuRecs.get(i));
			System.out.println("");
		}
	}
	public static void sortRecords() {
		Collections.sort(stuRecs);
	}
	public static void save() {
		String filename = "students.txt";
		File f = new File(filename);
		if (f.exists()){
			FileOutputStream fileOutputStream;
			try {
				fileOutputStream = new FileOutputStream(f);
				PrintStream fps = new PrintStream(fileOutputStream);
				fps.println(stuRecs.size());
				for (int i = 0; i < stuRecs.size(); i++){
					fps.println(stuRecs.get(i).toString());		
				}
				fileOutputStream.close(); 
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		else{
			try {
				f.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}	
		}
	}
}
