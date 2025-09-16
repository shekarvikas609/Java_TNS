package org.easystudy.cars;


import org.springframework.stereotype.Component;
import org.easystudy.interfaces.Car;

@Component
public class Audi implements Car {

	public String specs() {
		return "Audi is from xyz";
	}

}
