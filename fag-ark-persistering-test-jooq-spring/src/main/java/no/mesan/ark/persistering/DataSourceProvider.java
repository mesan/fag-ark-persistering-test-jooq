package no.mesan.ark.persistering;

import javax.sql.DataSource;

public class DataSourceProvider {

	public final DataSource dataSource;

	public DataSourceProvider(DataSource dataSource) {
		this.dataSource = dataSource;
	}

}
