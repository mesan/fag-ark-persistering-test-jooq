package no.mesan.ark.persistering;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EntityScan(basePackages="no.mesan.ark.persistering.jpa.pojos")
@EnableTransactionManagement
public class FagArkPersisteringTestJooqSpringApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication
				.run(FagArkPersisteringTestJooqSpringApplication.class, args);
		Demo demo = context.getBean(Demo.class);
		demo.run();
	}
}
