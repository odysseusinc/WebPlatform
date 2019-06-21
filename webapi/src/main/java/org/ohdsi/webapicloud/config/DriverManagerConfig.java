package org.ohdsi.webapicloud.config;

import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

@Configuration
public class DriverManagerConfig {

    @PostConstruct
    public void driverManagerRedshiftWorkaround() {

        java.util.Enumeration<Driver> drivers =  DriverManager.getDrivers();
        while (drivers.hasMoreElements()) {
            Driver d = drivers.nextElement();
            if (d.getClass().getName().equals("com.amazon.redshift.jdbc.Driver")) {
                try {
                    DriverManager.deregisterDriver(d);
                    DriverManager.registerDriver(d);
                } catch (SQLException e) {
                    throw new RuntimeException("Could not deregister redshift driver");
                }
                break;
            }
        }
    }

}
