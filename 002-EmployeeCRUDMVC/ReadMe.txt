
The class EmployeeCrudmvcApplication created by spring boot must extend from SpringBootServletInitializer

The first step in producing a deployable war file is to provide a SpringBootServletInitializer subclass and override its configure method. Doing so makes use of Spring Framework’s Servlet 3.0 support and lets you configure your application when it is launched by the servlet container. Typically, you should update your application’s main class to extend SpringBootServletInitializer

If not present create the hierarchy src/maim/webapp/WEB-INF/pages
Look at the application.properties file.
http://localhost:8080/employeemvc/hello?name=Ameya