package shikhadb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableEurekaClient
@EnableJpaRepositories(basePackages = {"shikhadb"} )
@EntityScan(basePackages = {"shikhadb"})
@SpringBootApplication
public class ShikhaDbApplication {
	public static void main(String[] args) {
	SpringApplication.run(ShikhaDbApplication.class, args);
}

}
