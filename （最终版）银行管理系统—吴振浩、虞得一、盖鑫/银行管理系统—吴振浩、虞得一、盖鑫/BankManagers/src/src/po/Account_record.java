package src.po;

import java.util.Date;

public class Account_record {

	int id;
	String type;
	double money;
	String date;
	String password_past;
	String password_new;
	public Account_record(int id, String type, double money, String date, String password_past, String password_new) {
		super();
		this.id = id;
		this.type = type;
		this.money = money;
		this.date = date;
		this.password_past = password_past;
		this.password_new = password_new;
	}
	public Account_record() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getPassword_past() {
		return password_past;
	}
	public void setPassword_past(String password_past) {
		this.password_past = password_past;
	}
	public String getPassword_new() {
		return password_new;
	}
	public void setPassword_new(String password_new) {
		this.password_new = password_new;
	}
	
	
}
