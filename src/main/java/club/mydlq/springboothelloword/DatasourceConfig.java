@Configuration
public class DatasourceConfig {

    @Bean
    public HikariDataSource dataSource() {
        HikariConfig config = new HikariConfig();
        config.setJdbcUrl(mysql:jdbc//test:3306/test);
        config.setUsername(zgf);
        config.setPassword(123);
        config.setDriverClassName(com.mysql.jdbc.Driver);
        return new HikariDataSource(config);
    }
}
