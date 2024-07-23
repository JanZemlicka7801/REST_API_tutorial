package payroll;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//this starts a servlet container and serves up the service
//is a meta annotation that pulls in scanning, autoconfiguration and property support
@SpringBootApplication
public class PayrollApplication {

    public static void main(String... args) {
        SpringApplication.run(PayrollApplication.class, args);
    }
}
