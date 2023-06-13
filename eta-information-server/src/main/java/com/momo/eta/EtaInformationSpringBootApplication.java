package com.momo.eta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zhubo
 */
@SpringBootApplication
public class EtaInformationSpringBootApplication {

  public static void main(String[] args) {
    SpringApplication application = new SpringApplication(EtaInformationSpringBootApplication.class);
    application.run(args);
  }
}
