package liga.medical.messageanalyzer.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"liga.medical.messageanalyzer", "liga.medical.common.service"})
public class CoreApplication {

    public static void main(String[] args) {

        SpringApplication.run(CoreApplication.class, args);
        System.out.println("21");
    }

}
