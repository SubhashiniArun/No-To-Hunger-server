package notohungerazure.driveaway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = OrganizationRepository.class)
public class NotohungerApplication {

	public static void main(String[] args) {
		SpringApplication.run(NotohungerApplication.class, args);
	}
}