Create an empty Maven project
Populate the required ActiveMQ and spring boot and jackson dependencies along with the others
Code in com.ameya.jms.models.Email.java
Code in the com.ameya.jms.receiver.Receiver.java--->Jms Receiver i.e. JmsListener
Code in com.ameya.jms.JmsApplication.java--->This creates converts and sends the email msg.
It also acts as SpringBoot application
Code in the TestAndReceive.java with main method

Run the application as spring boot application

On Console the msg will be shown 
Sending an email message.
Received <Email{to=ameya@jms.com, body=Hello Ameya}>

Now change the following line as
jmsTemplate.convertAndSend("mailbox", new Email("amol@jms.com", "Hello Amol"));

and run the TestAndReceive class as java application

two consoles showing the two msgs sent will be there