@EnableWebMvc is equivalent to <mvc:annotation-driven />
Extend the class to use WebMvcConfigurerAdapter. 
This adds stub implementations from the WebMvcConfigurer interface which is used by @EnableWebMVC. 
It also gives us a chance to override resources and the default handler.
URLS :

	http://localhost:9001/springsecuritymvc/
	http://localhost:9001/springsecuritymvc/admin
	http://localhost:9001/springsecuritymvc/dba
	