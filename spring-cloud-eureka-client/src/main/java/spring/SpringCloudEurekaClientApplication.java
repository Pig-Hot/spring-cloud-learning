package spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@EnableDiscoveryClient
@SpringBootApplication
public class SpringCloudEurekaClientApplication {

    @RestController
    public class DcController {

        @Resource
        DiscoveryClient discoveryClient;

        @GetMapping("/dc")
        public String dc() {
            String services = "Services: " + discoveryClient.getServices();
            System.out.println(services);
            return services;
        }

    }

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudEurekaClientApplication.class, args);
    }

}
