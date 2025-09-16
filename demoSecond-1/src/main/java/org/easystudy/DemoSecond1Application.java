package org.easystudy;

//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
//public class DemoSecond1Application {
//
//	public static void main(String[] args) {
//		SpringApplication.run(DemoSecond1Application.class, args);
//	}
//
//}
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.easystudy.cars.Corolla;
import org.easystudy.cars.Swift;
import org.easystudy.interfaces.Car;

public class DemoSecond1Application {

	public static void main(String[] args) {
		//Car swift = new Swift();
		//Car corolla = new Corolla();
		
		//System.out.println(swift.specs());
		//System.out.println(corolla.specs());
		
        
		//Car myCar = new Swift();
		//System.out.println(myCar.specs());
		
		AnnotationConfigApplicationContext context = 
			new	AnnotationConfigApplicationContext(AppConfig.class);
		
		Car myCar = context.getBean("audi",Car.class);
		System.out.println(myCar.specs());
		context.close();
		
	}

}
