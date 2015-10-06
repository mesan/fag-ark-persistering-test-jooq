package no.mesan.ark.persistering;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class FagArkPersisteringTestJooqSpringApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(FagArkPersisteringTestJooqSpringApplication.class, args);
	}

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public void run(String... args) throws Exception {
		queryTest();
	}

	private void queryTest() {
		jdbcTemplate
				.query("select id, abbreviation from positions",
						(rs, rownum) -> new String[] { Long.toString(rs.getLong("id")), rs.getString("abbreviation") })
				.forEach(position -> System.out.println(position[0] + " " + position[1]));
	}
}
