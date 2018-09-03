
public class SandwichBar {
	public int whichOrder(String[] available, String[] orders) {
		int order = -1;
		
		for (int i = 0; i < orders.length; i++) { // for every order
			String[] ingredients = orders[i].split(" ", Integer.MAX_VALUE); // convert order to ingredients
			
			for (int j = 0; j < ingredients.length; j++) { // for every ingredient
				if (!availableIngredient(ingredients[j], available)) { // if it's found than an ingredient isn't available
					break; // break the for loop of checking ingredients
				}
				if (j == ingredients.length - 1) { // if we've reached the last ingredient
					if (availableIngredient (ingredients[j], available)) { // and we have that ingredient
					order = i; // set the order number
					break; // break the loop checking ingredients
					}
				}
			}
			
			if (order > -1) { // if order number has been changed
				break; // break the for loop checking the orders
			}
		}
		return order;
	}

	public boolean availableIngredient(String ingredient, String[] available) {
		for (int k = 0; k < available.length; k++) { // go through the different ingredients
			if (ingredient.equals(available[k])) { // if we have the ingredient
				return true; // return true
			}
		}
		return false; // otherwise return false
	}
}