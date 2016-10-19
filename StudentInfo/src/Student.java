public class Student implements Comparable {

	private static long idGenerator = 300000000;
	private long studentNumber;
	
	public Student() {
		setFirstName("");
		setLastName("");
		setStrName("");
		setCityName("");
		setProvName("");
		setPosCode("");
		setBirthMonth("");
		setStreetNum(0);
		setPhoneNum(0);
		setBirthDay(0);
		setBirthYear(0);
		this.setStudentNumber(idGenerator);
		idGenerator++;
	}
	
	public void setStudentNumber(long sNum) {
		this.studentNumber = sNum;
	}

	public long getStudentNumber() {
		return this.studentNumber;
	}
		
	// First Name
	private String firstName;

	public void setFirstName(String fname) {
		this.firstName = fname;
	}

	public String getFirstName() {
		return this.firstName;
	}

	// Last Name
	private String lastName;

	public void setLastName(String lname) {
		this.lastName = lname;
	}

	public String getLastName() {
		return this.lastName;
	}

	// Street Number
	private int streetNum;

	public void setStreetNum(int snum) {
		this.streetNum = snum;
	}

	public int getStreetNum() {
		return this.streetNum;
	}

	// Street Name
	private String strName;

	public void setStrName(String sname) {
		this.strName = sname;
	}

	public String getStrName() {
		return this.strName;
	}

	// City
	private String cityName;

	public void setCityName(String cname) {
		this.cityName = cname;
	}

	public String getCityName() {
		return this.cityName;
	}

	// Province
	private String provName;

	public void setProvName(String pname) {
		this.provName = pname;
	}

	public String getProvName() {
		return this.provName;
	}

	// Postal Code
	private String posCode;

	public void setPosCode(String pcode) {
		this.posCode = pcode;
	}

	public String getPosCode() {
		return this.posCode;
	}

	// Phone Number
	public long phoneNum;

	public void setPhoneNum(long pnum) {
		this.phoneNum = pnum;
	}

	public long getPhoneNum() {
		return this.phoneNum;
	}

	// Birth Month
	public String birthMonth;

	public void setBirthMonth(String bmonth) {
		this.birthMonth = bmonth;
	}

	public String getBirthMonth() {
		return this.birthMonth;
	}

	// Birth Day
	public int birthDay;

	public void setBirthDay(int bday) {
		this.birthDay = bday;
	}

	public int getBirthDay() {
		return this.birthDay;
	}

	// Birth Year
	public int birthYear;

	public void setBirthYear(int byear) {
		this.birthYear = byear;
	}

	public int getBirthYear() {
		return this.birthYear;
	}

	public Student(String firstName, String lastName, String strName, String cityName, String provName, String posCode,
			String birthMonth) {
		setFirstName(firstName);
		setLastName(lastName);
		setStrName(strName);
		setCityName(cityName);
		setProvName(provName);
		setPosCode(posCode);
		setBirthMonth(birthMonth);

	}

	public Student(int streetNum, int phoneNum, int birthDay, int birthYear) {
		setStreetNum(streetNum);
		setPhoneNum(phoneNum);
		setBirthDay(birthDay);
		setBirthYear(birthYear);
	}

	public String toString() {
		return birthMonth + "," + firstName + "," + lastName + "," + strName + "," + cityName + "," + provName + posCode + "," + birthMonth;
	}

	@Override
	public int compareTo(Object x) {
		Student temp = (Student) x;
		return 0;
	}

}
