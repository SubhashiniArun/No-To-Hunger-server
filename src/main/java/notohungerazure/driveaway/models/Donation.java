package notohungerazure.driveaway.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "donations")
public class Donation {
	
 @Id
 //@GeneratedValue(strategy = GenerationType.AUTO)
 //private int organization_id;
 
 @Column(name="organization_name")
 private String organization_name;
 
 @Column(name="donation_size")
 private int donation_size;
 
 @Column(name="address")
 private String address;
 
 @Column(name="contact_number")
 private String contact_number;
 

/*public int getOrganization_id() {
	return organization_id;
}
public void setOrganization_id(int organization_id) {
	this.organization_id = organization_id;
}*/
 
 public Donation()
 {
 }
 
 public Donation(String organization_name,int donation_size,String address,String contact_number)
 {
	 	this.organization_name=organization_name;
	 	this.donation_size=donation_size;
	 	this.address=address;
	 	this.contact_number=contact_number;
 }

public String getOrganization_name() {
	return organization_name;
}

public void setOrganization_name(String organization_name) {
	this.organization_name = organization_name;
}

public int getDonation_size() {
	return donation_size;
}

public void setDonation_size(int donation_size) {
	this.donation_size = donation_size;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public String getContact_number() {
	return contact_number;
}

public void setContact_number(String contact_number) {
	this.contact_number = contact_number;
}
 

 }


