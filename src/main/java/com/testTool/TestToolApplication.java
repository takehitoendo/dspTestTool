package com.testTool;
import com.google.gson.Gson;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.context.ApplicationContext;
import org.springframework.scheduling.annotation.EnableScheduling;


@SpringBootApplication
@Import(AppConfig.class)
public class TestToolApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(TestToolApplication.class, args);
		Gson gson = context.getBean(Gson.class);
	}

}
