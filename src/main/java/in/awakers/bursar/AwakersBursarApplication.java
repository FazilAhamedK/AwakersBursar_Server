package in.awakers.bursar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("in.awakers.bursar.repository")
public class AwakersBursarApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(AwakersBursarApplication.class);
    }
}