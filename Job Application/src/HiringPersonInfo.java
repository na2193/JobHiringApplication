
public class HiringPersonInfo 
{
	private String name, address, city, state, zipCode, phoneNum, email, DOB;

	public HiringPersonInfo()
	{
		
	}
	
	public HiringPersonInfo(String name, String address, String city, String state, String zipCode, String phoneNum,
			String email, String dOB) {
		super();
		this.name = name;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.phoneNum = phoneNum;
		this.email = email;
		DOB = dOB;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDOB() {
		return DOB;
	}

	public void setDOB(String dOB) {
		DOB = dOB;
	}
	
	public String toString()
	{
		String info = "Name: " + name + "\nAddress: " + address + "\n         " +
				city + "," + state + "," + zipCode + "\nPhone Number: " + phoneNum + "\nEmail: " + email +"\nDOB: " + DOB; 
		//String info = String.format("Name: %d \nAddress: %d \n%d, %d, %d \nPhone Number: %d \nEmail: %d \nDOB %d" , name, address, city, state, zipCode, phoneNum, email, DOB);	
		return info;
	}
}
