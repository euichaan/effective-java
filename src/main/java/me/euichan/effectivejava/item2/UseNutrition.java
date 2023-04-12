package me.euichan.effectivejava.item2;

public class UseNutrition {

	public static void main(String[] args) {
		NutritionFacts cocaCola = NutritionFacts.builder()
			.servingSize(240)
			.servings(8)
			.calories(100)
			.sodium(35)
			.carbohydrate(27)
			.build();
	}
}
