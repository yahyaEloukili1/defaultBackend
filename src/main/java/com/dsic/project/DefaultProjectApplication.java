package com.dsic.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.dsic.project.enetities.AppRole;
import com.dsic.project.enetities.AppUser;
import com.dsic.project.services.AccountService;
@SpringBootApplication
public class DefaultProjectApplication implements CommandLineRunner {


	@Autowired
	private RepositoryRestConfiguration restConfiguration;


	@Autowired
	@Lazy
	private AccountService accountService;
	public static void main(String[] args)  {
		SpringApplication.run(DefaultProjectApplication.class, args);
	}
	@Bean
	public BCryptPasswordEncoder getBPE() {
		return new BCryptPasswordEncoder();
	}
	@Override
	public void run(String... args) throws Exception {
		if(accountService.finduserByUsrname("iftar")==null) {
			accountService.save(new AppUser(null,"iftar","Laayoune2023@",null,null));
			accountService.saveRole(new AppRole(null,"ADMIN"));
			accountService.saveRole(new AppRole(null,"USER"));
			accountService.addRoleToUser("iftar","ADMIN");
			accountService.addRoleToUser("iftar","USER");
		

		}
		
	}
}

