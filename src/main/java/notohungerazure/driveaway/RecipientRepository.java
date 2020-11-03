package notohungerazure.driveaway;

import org.springframework.data.jpa.repository.JpaRepository;

import notohungerazure.driveaway.models.Recipient;

public interface RecipientRepository extends JpaRepository<Recipient, Integer>{

}

