package co.gov.ids.stationerycontrol.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Discovery Service for stationery control of live births and deaths.
 *
 * @author Sergio Rodríguez
 * @version 0.0.1
 * @since 2020
 */
@EnableEurekaServer
@SpringBootApplication
public class Service {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Service.class, args);
    }

}
