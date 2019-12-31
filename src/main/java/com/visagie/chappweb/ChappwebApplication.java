package com.visagie.chappweb;

import com.visagie.chappweb.models.Child;
import com.visagie.chappweb.repos.IChildrenRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ChappwebApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChappwebApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(IChildrenRepository childrenRepository){
        return args -> {
            childrenRepository.save( new Child("Andreas"));
        };
    }

}
