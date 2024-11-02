package com.barisyenigun.videocall;

import com.barisyenigun.videocall.user.User;
import com.barisyenigun.videocall.user.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class VideocallApplication {

	public static void main(String[] args) {
		SpringApplication.run(VideocallApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(
			UserService userService
	) {
		return args -> {
			userService.register(User.builder()
							.username("Ali")
							.email("ali@email.com")
							.password("aa")
							.build());
			userService.register(User.builder()
					.username("John")
					.email("john@email.com")
					.password("aaa")
					.build());
			userService.register(User.builder()
					.username("Hannah")
					.email("hannah@email.com")
					.password("aaa")
					.build());
		};
	}

}
