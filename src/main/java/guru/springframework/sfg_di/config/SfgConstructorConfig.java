package guru.springframework.sfg_di.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created on 07/09/2025 by Jesse H.
 */

//@ConstructorBinding - NOTE: Obsolete
@ConfigurationProperties("guru")
public class SfgConstructorConfig {

    private final String username;
    private final String password;
    private final String jdbcurl;

    public SfgConstructorConfig(String username, String password, String jdbcurl) {
        this.username = username;
        this.password = password;
        this.jdbcurl = jdbcurl;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getJdbcurl() {
        return jdbcurl;
    }
}
