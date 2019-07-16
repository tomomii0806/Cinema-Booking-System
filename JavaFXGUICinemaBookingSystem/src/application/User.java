package application;

import java.util.ArrayList;

public class User{
	
	private ArrayList<User> users = new ArrayList<>();
	
	private String firstName;
	private String lastName;
	private String username;
	private String password;
	private String phone;



	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}



	public User(String firstName, String lastName, String username, String password, String phone) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.username = username;
		this.password = password;
		this.phone = phone;
	}

	public User(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public void signIn(User user) {
		// TODO Auto-generated method stub
		
			users.add(user);
		
		
	}


}

