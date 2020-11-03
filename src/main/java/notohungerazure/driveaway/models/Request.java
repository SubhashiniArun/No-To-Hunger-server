package notohungerazure.driveaway.models;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "food_requests")
public class Request {
	
	@Id
	 //@GeneratedValue(strategy = GenerationType.AUTO)
	 //private int organization_id;
	 
 @Column(name="recipient_name") 
 private String recipient_name;
	
 @Column(name="request_quantity")
 private int request_quantity;
 
 @Column(name="address")
 private String address;
 
 @Column(name="phone")
 private String phone;
 
 @Column(name="email")
 private String email;
 
 public Request()
 {
 }
 
 public Request(String recipient_name,int request_quantity,String address,String phone,String email)
 {
	 	this.recipient_name=recipient_name;
	 	this.request_quantity=request_quantity;
	 	this.address=address;
	 	this.phone=phone;
	 	this.email=email; 	
 }

public String getRecipient_name() {
	return recipient_name;
}

public void setRecipient_name(String recipient_name) {
	this.recipient_name = recipient_name;
}

public int getRequest_quantity() {
	return request_quantity;
}

public void setRequest_quantity(int request_quantity) {
	this.request_quantity = request_quantity;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public String getPhone() {
	return phone;
}

public void setPhone(String phone) {
	this.phone = phone;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

  
}

