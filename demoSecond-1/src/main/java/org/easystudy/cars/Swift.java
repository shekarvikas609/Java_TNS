package org.easystudy.cars;

import org.springframework.stereotype.Component;
import org.easystudy.interfaces.Car;

@Component("swift")
public class Swift implements Car {

	public String specs() {
		return "Hatchback from Suzuki";
	}

}