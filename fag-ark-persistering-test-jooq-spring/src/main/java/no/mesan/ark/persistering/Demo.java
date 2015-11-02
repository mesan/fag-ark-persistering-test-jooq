package no.mesan.ark.persistering;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

@Component
public class Demo {

	private final jOOQDemo jooqDemo;
	private final JPADemo jpaDemo;

	@Autowired
	public Demo(jOOQDemo jooqDemo, JPADemo jpaDemo) {
		this.jooqDemo = jooqDemo;
		this.jpaDemo = jpaDemo;
	}

	public void run() {
		StopWatch stopwatch = new StopWatch("jOOQ vs Hibernate");
		
		stopwatch.start("Hibernate Actors");
		jpaDemo.runActors();
		stopwatch.stop();
		
		stopwatch.start("Hibernate Films");
		jpaDemo.runFilms();
		stopwatch.stop();
		
		stopwatch.start("jOOQ Actors");
		jooqDemo.runActors();
		stopwatch.stop();

		stopwatch.start("jOOQ Films");
		jooqDemo.runFilms();
		stopwatch.stop();
		
		System.out.println(stopwatch.prettyPrint());
	}

}
