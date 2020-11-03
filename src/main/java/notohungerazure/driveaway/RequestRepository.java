package notohungerazure.driveaway;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import notohungerazure.driveaway.models.Request;

public interface RequestRepository extends JpaRepository<Request, Integer>{
	//Request findByUserName(String recipientName);
	
   
}