package dev.cdojo.productsService;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
@EnableEurekaClient
public class ProductsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductsServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner initDatabase(ProductsRepository productsRepository) {

		return args -> {
			productsRepository.save(new Product(null,"product - 1", "this is a product"));
			productsRepository.save(new Product(null, "product - 2", "this is a product"));
		};

	}

}
