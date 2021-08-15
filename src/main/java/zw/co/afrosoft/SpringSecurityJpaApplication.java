package zw.co.afrosoft;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.*;
import zw.co.afrosoft.repository.*;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserRepository.class )
public class SpringSecurityJpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringSecurityJpaApplication.class, args);
    }

}
