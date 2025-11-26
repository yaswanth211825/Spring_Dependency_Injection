package com.example.Module1HomeWork.Module1HomeWork;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Module1HomeWorkApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Module1HomeWorkApplication.class, args);
	}
    final private CakeBake cakeBake;

    public Module1HomeWorkApplication(CakeBake cakeBake) {
        this.cakeBake = cakeBake;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Execution Starts");
        cakeBake.bakeCake();

    }
}
