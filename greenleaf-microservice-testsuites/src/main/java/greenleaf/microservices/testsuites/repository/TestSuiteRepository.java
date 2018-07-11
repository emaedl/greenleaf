package greenleaf.microservices.testsuites.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import greenleaf.microservices.testsuites.model.TestSuite;

@Repository
public interface TestSuiteRepository extends JpaRepository<TestSuite, UUID>{
	
	
}
