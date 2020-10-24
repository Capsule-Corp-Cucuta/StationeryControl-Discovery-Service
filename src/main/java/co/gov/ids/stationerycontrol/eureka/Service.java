package co.gov.ids.stationerycontrol.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class Service {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Service.class, args);
    }

}
