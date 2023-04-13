package me.euichan.effectivejava.item2;

import static me.euichan.effectivejava.item2.NyPizza.Size.*;
import static me.euichan.effectivejava.item2.Pizza.Topping.*;

public class MakePizza {

	public static void main(String[] args) {
		NyPizza nyPizza = new NyPizza.Builder(SMALL)
			.addTopping(SAUSAGE).addTopping(ONION).build();

		Calzone calzone = new Calzone.Builder()
			.addTopping(HAM).sauceInside().build();
	}
}
