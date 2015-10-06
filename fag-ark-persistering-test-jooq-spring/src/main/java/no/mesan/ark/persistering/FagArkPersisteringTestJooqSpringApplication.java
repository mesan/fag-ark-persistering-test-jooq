package no.mesan.ark.persistering;

import static no.mesan.ark.persistering.generated.Tables.*;

import javax.sql.DataSource;

import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;

import no.mesan.ark.persistering.generated.tables.records.PositionsRecord;

@SpringBootApplication
public class FagArkPersisteringTestJooqSpringApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication
				.run(FagArkPersisteringTestJooqSpringApplication.class, args);
		DataSourceProvider provider = context.getBean(DataSourceProvider.class);
		// queryTest(new JdbcTemplate(provider.dataSource));

		DSLContext create = DSL.using(provider.dataSource, SQLDialect.POSTGRES);

		create.select().from(POSITIONS).fetchInto(PositionsRecord.class)
				.forEach(record -> System.out.println("ID: " + record.getId() + ", AffiliationId: "
						+ record.getAffiliationId() + ", Abbreviation: " + record.getAbbreviation()));

//		create.select(POSITIONS.ID, POSITIONS.ABBREVIATION).from(POSITIONS).fetch()
//				.forEach(record -> System.out.println("ID: " + record.getValue(POSITIONS.ID) + ", Abbrev: "
//						+ record.getValue(POSITIONS.ABBREVIATION)));
	}

	@Bean
	DataSourceProvider dataSourceProvider(DataSource dataSource) {
		return new DataSourceProvider(dataSource);
	}

	@SuppressWarnings("unused")
	private static void queryTest(JdbcTemplate jdbcTemplate) {
		jdbcTemplate
				.query("select id, abbreviation from positions",
						(rs, rownum) -> new String[] { Long.toString(rs.getLong("id")), rs.getString("abbreviation") })
				.forEach(position -> System.out.println(position[0] + " " + position[1]));
	}
}
