package com.ameya.jms;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.jms.core.JmsTemplate;

import com.ameya.jms.models.Email;

public class TestSendAndReceive {
	 public static void main(String[] args) {
	        // Launch the application
	        ConfigurableApplicationContext context = SpringApplication.run(JmsApplication.class, args);

	        JmsTemplate jmsTemplate = context.getBean(JmsTemplate.class);

	        // Send a message with a POJO - the template reuse the message converter
	        System.out.println("Sending an email message.");
	        jmsTemplate.convertAndSend("mailbox", new Email("ameya@jms.com", "Hello Ameya"));
	    }
}
