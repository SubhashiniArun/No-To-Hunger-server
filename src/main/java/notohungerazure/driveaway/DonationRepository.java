package notohungerazure.driveaway;

import org.springframework.data.jpa.repository.JpaRepository;

import notohungerazure.driveaway.models.Donation;

public interface DonationRepository extends JpaRepository<Donation, Integer> {

}

