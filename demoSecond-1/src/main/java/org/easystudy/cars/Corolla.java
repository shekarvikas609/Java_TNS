package org.easystudy.cars;


import org.springframework.stereotype.Component;
import org.easystudy.interfaces.Car;

@Component("team")
public class Corolla implements Car {

	public String specs() {
		return "Sedan from Toyota";
	}

}
