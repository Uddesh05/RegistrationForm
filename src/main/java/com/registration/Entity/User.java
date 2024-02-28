package com.registration.Entity;

public class User {

	private int Id;
	private String name;
	private String lastname;
	private String username;
	private String password;
	private String contact;
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
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
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	@Override
	public String toString() {
		return "User [Id=" + Id + ", name=" + name + ", lastname=" + lastname + ", username=" + username + ", password="
				+ password + ", contact=" + contact + "]";
	}
	
	
	
	
}
