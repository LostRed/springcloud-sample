package info.lostred.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer //Eureka服务端启动类
public class EurekaServerNode02 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerNode02.class, args);
    }
}
