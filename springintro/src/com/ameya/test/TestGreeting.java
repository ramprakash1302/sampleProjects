package com.ameya.test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ameya.pojos.Employee;
import com.ameya.pojos.Greeting;

public class TestGreeting {

	public static void main(String[] args) {
//		Greeting gt1=new Greeting();
//		Greeting gt2=new Greeting("Hello All !!!");
//		gt1.setMessage("Welcome All !!!");
		
		/*System.out.println("============="+gt1+" : "+gt1.hashCode());
		System.out.println("============="+gt2+" : "+gt2.hashCode());
		
		Greeting gt3=(Greeting)ctx.getBean("gt3");
		Greeting gt4=(Greeting)ctx.getBean("gt4");
		System.out.println("============="+gt3+" : "+gt3.hashCode());
		System.out.println("============="+gt4+" : "+gt4.hashCode());
		*/
		
		AbstractApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
		
		Employee e1=(Employee)ctx.getBean("e1");
		System.out.println(e1);
		Employee e2=(Employee)ctx.getBean("e2");
		System.out.println(e2);
		
		Greeting gt3=(Greeting)ctx.getBean("gt3");
		Greeting gt4=(Greeting)ctx.getBean("gt4");
		System.out.println("============="+gt3+" : "+gt3.hashCode());
		System.out.println("============="+gt4+" : "+gt4.hashCode());
		gt3.getMessage();
		e1.getEpmId();
		ctx.registerShutdownHook();
	}

}
