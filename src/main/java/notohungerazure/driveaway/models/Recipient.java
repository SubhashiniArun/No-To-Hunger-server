package notohungerazure.driveaway.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "recipients")
public class Recipient {
	
 @Id
 //@GeneratedValue(strategy = GenerationType.AUTO)
 //private int organization_id;
 
 @Column(name="name")
 private String name;
 
 @Column(name="password")
 private String password;
 
 @Column(name="group_strength")
 private int group_strength;
 
 @Column(name="address")
 private String address;
 
 @Column(name="city")
 private String city;
 
 @Column(name="state")
 private String state;
 
 @Column(name="phone")
 private String phone;
/*public int getOrganization_id() {
	return organization_id;
}
public void setOrganization_id(int organization_id) {
	this.organization_id = organization_id;
}*/
 
 public Recipient()
 {
 }
 
 public Recipient(String name,String password,int group_strength, String address,String city,String state,String phone)
 {
	 	this.name=name;
	 	this.password=password;
	 	this.group_strength=group_strength;
	 	this.address=address;
	 	this.city=city;
	 	this.state=state;
	 	this.phone=phone;
 }

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public int getGroup_strength() {
	return group_strength;
}

public void setGroup_strength(int group_strength) {
	this.group_strength = group_strength;
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

public String getPhone() {
	return phone;
}

public void setPhone(String phone) {
	this.phone = phone;
}
 


 }

