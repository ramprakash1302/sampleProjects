package com.ameya.security.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


@EnableWebSecurity
@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter{
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication()
			.withUser("ameya").password("1234").roles("ADMIN").and()
			.withUser("avani").password("1234").roles("USER");
		//auth.authenticationProvider(authenticationProvider);
	}

	@Override
	protected void configure(HttpSecurity httpSecurity) throws Exception {
		/*---------------Before the authentication is in place -----------------------*/
		//httpSecurity
			//		.authorizeRequests() //all requests are authorized
					
				//	.anyRequest()
					//.permitAll() //permit all requests
					//.and()
				//	.httpBasic();
		/*---------------After the authentication is in place all requests are authenticated -----------------------*/
		//httpSecurity
		//.authorizeRequests() //all requests are authorized
		
		//.anyRequest()
		//.fullyAuthenticated()
		//.and()
		//.httpBasic();
		/*---------------Only users with role USER will be able to access /hello  -----------------------*/
		httpSecurity
			.authorizeRequests() //all requests are authorized
			.antMatchers("/").permitAll()
			.antMatchers("/rest/hello*").access( "hasRole('USER')")	
			.and()
			.httpBasic();
		httpSecurity.csrf().disable(); //CSRF-> Cross Site Request Forgery
		
	}

}
