package notohungerazure.driveaway;


import java.awt.PageAttributes.MediaType;
import java.sql.Statement;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import notohungerazure.driveaway.models.Donation;
import notohungerazure.driveaway.models.Organization;
import notohungerazure.driveaway.models.Recipient;
import notohungerazure.driveaway.models.Request;


@RestController
@CrossOrigin(origins="http://nohunger.azurewebsites.net")
@RequestMapping(path = "no-hunger")
public class HomeController {
	
	
		@Autowired
		private OrganizationRepository organizationRepository;
		
		@Autowired
		private RequestRepository requestRepository;
		
		@Autowired
		private DonationRepository donationRepository;	
		
		@Autowired
		private RecipientRepository recipientRepository;

		@GetMapping("/orgs")
		public List<Organization> getOrgs()
		{
			return organizationRepository.findAll();
		}
		
		@PostMapping("/organizations/login")
		@ResponseBody
		public boolean authenticateOrganization(@RequestBody LoginResponse loginResponse)
		{
			return true;
			/*if(loginResponse.getUsername().equals("Organization2") && loginResponse.getPassword().equals("password2")){
		       System.out.println("error");
		       return true;
		    } else {
		        return false;
		    }	*/	
		} 
		
		
		@PostMapping("/recipients/login")
		@ResponseBody
		public boolean authenticateRecipient(@RequestBody LoginResponse loginResponse)
		{
			return true;
			/*if(loginResponse.getUsername().equals(organizationRepository.findByName(loginResponse.getUsername())) && loginResponse.getPassword().equals("password2")){
		       System.out.println("error");
		       return true;
		    } else {
		        return false;*/
		    }		
						
		@GetMapping("/organizations/requests")
	    public List<Request> getRequests()
		{
		    return requestRepository.findAll();
	    }			
	
		@PostMapping("/organizations/register")
		public void registerOrganization(@RequestBody Organization organization)
		{
			organizationRepository.save(new Organization(organization.getName(),organization.getPassword(),organization.getAddress(),organization.getCity(),organization.getState(),organization.getPhone()));
		}
		
		@GetMapping("/organizations/vrecipients")
	    public List<Recipient> getRecipientss()
		{
		    return recipientRepository.findAll();
	    }
		
		@PostMapping("/organizations/donate")
		public void createDonation(@RequestBody Donation donation)
		{
			donationRepository.save(new Donation(donation.getOrganization_name(),donation.getDonation_size(),donation.getAddress(),donation.getContact_number()));
		  
		}
		
		@GetMapping("/recipients/donations")
	    public List<Donation> getDonations()
		{
		    return donationRepository.findAll();
	    }
		
		@PostMapping("/recipients/register")
		public void registerRecipient(@RequestBody Recipient recipient)
		{
			recipientRepository.save(new Recipient(recipient.getName(),recipient.getPassword(),recipient.getGroup_strength(),recipient.getAddress(),recipient.getCity(),recipient.getState(),recipient.getPhone()));
		    
		}
		
		@PostMapping("/recipients/request")
		public void createRequest(@RequestBody Request request)
		{
			requestRepository.save(new Request(request.getRecipient_name(),request.getRequest_quantity(),request.getAddress(),request.getPhone(),request.getEmail()));		  
		}
		
		/*@RequestMapping(value = "/")
	public String homePage()
	{
		return "This is the Home Page for No-To-Hunger App for Orgnizations and Recipients";
	}
	
	@RequestMapping(value = "/recipients")
	public String getAllOrgnizations() {
		return "Welcome to Recipient's Page";
	}*/

}

