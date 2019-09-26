package com.odysseusinc.arachne.executionenginecloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@ComponentScan(
        basePackages = {
                "com.odysseusinc.arachne.executionenginecloud",
                "com.odysseusinc.arachne.executionengine"
        }
)
/**
 * Note: When using default profile it's required to externalize properties needed to be overridden defaults
 *  inherited from execution-engine dependency. At least <b>server.port</b> and <b>server.ssl.enabled</b>
 *  should be overridden directly by command line arguments or with additional config location.
 *  This is because spring determines properties loading order and external properties has prevalence over
 *  default application properties.
 *  Not a problem when running in docker container since docker externalize properties with environment variables.
 */
public class Application {

    public static void main(String[] args) {

        SpringApplication.run(Application.class, args);
    }
}
