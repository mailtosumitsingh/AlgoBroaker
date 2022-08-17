package org.menlorobotics.rvr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({ "org.menlorobotics.handlers" })
@ComponentScan({ "org.menlorobotics.rvr" })
@SpringBootApplication
public class ZKClientApp {

	public static void main(String[] args) throws Exception{
            SpringApplication.run(ZKClientApp.class, args);
	}
}

