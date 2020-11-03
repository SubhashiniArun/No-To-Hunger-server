package notohungerazure.driveaway;


import org.springframework.lang.NonNull;

public class LoginResponse {

	@NonNull
	String username;
	@NonNull
	String password;
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
	
	
	
	
}
