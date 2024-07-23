package payroll;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Configuration
class LoadDatabase {

    //once the application is loaded Spring Boot will run all commandline runners.
    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    //requests a copy of the repository
    @Bean
    CommandLineRunner initDatabase(EmployeeRepository repository) {

        //the runner creates two entities and stores them
        return args -> {
            log.info("Preloading " + repository.save(new Employee("Bilbo Baggins", "burglar")));
            log.info("Preloading " + repository.save(new Employee("Frodo Baggins", "thief")));
        };
    }
}
