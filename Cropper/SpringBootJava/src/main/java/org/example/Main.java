package org.example;

import org.example.storage.IStorageService;
import org.example.storage.StorageProperties;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableConfigurationProperties(StorageProperties.class)
public class Main {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(Main.class, args);
    }

    @Bean
    CommandLineRunner init(IStorageService storageService) {
        return (args) -> {
            // storageService.deleteAll();
            try {
                storageService.init();
            }
            catch(Exception ex) {
                System.out.println("----propblem cteate folder--------");
            }
        };
    }
}