package src.po;

import java.text.SimpleDateFormat;
import java.util.Date;


public class Account {
	 int id;
	 String name;
         int id_Card;
	 String password;
	 double money;
	 String date;
         
public Account(int id, String name, int id_Card, String password, double money, String date) {
	super();
	this.id = id;
	this.name = name;
        this.id_Card = id_Card;
	this.password = password;
	this.money = money;
        this.date = date;
        
//	 Date date = new Date();
//    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");    
//    this.date = df.format(date);
}
//public Account(String name, double money){
//    this.id = id;
//    this.name = name;
//    this.password = "000000";
//    this.money = money;
//    
//    Date date = new Date();
//    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");    
//    this.date = df.format(date);
//}
public Account() {
	super();
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getId_Card() {
	return id_Card;
}
public void setId_Card(int id_Card) {
	this.id_Card = id_Card;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
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


}