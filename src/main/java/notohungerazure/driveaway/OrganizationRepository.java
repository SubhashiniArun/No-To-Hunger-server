package notohungerazure.driveaway;

import org.springframework.data.jpa.repository.JpaRepository;

import notohungerazure.driveaway.models.Organization;

import java.util.Optional;

public interface OrganizationRepository extends JpaRepository<Organization, Integer>{
	  Optional<Organization> findByName(String name);

}