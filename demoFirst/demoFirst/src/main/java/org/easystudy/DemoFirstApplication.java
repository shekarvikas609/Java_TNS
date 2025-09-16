package org.easystudy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.studyeasy.interfaces.Car;
import org.studyeasy.interfaces.Corolla;
import org.studyeasy.interfaces.Swift;

@SpringBootApplication
public class DemoFirstApplication {

//	public static void main(String[] args) {
//		SpringApplication.run(DemoFirstApplication.class, args);
//	}

	public static void main(String[] args) {
		//SpringApplication.run(WithoutDiApplication.class, args);
		
		
		Car swift = new Swift();
		Car corolla = new Corolla();
				
		System.out.println(swift.specs());
		System.out.println(corolla.specs());
				
	}
}
