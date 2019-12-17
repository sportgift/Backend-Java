package ec.com.sportgift.ws.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication(scanBasePackages = {
        "ec.com.sportgift"
})
@ComponentScan(basePackages = {"ec.com.sportgift"})
@EnableJpaRepositories("ec.com.sportgift.repository")   
@EntityScan("ec.com.sportgift.entity")  
public class SportGiftRootApplication extends SpringBootServletInitializer implements WebMvcConfigurer {
	

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(SportGiftRootApplication.class);
        springApplication.run(args);
    }
}