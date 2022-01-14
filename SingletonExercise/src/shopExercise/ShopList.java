package shopExercise;

import java.util.ArrayList;
import java.util.List;

public class ShopList {

	private List<String> shopLists = new ArrayList<>();

	private static ShopList instance;

	private ShopList() {}

	public static ShopList getInstance() {
		if (instance == null) {
			instance = new ShopList();
		}
		return instance;
	}
	
	public boolean addShop(String shopName) {
		if (shopName.startsWith("Food") || shopName.startsWith("Other")) {
			shopLists.add(shopName);
			System.out.println(shopName + " has been added to the list!");
			return true;
		} else {
			System.out.println("Shop has to start with 'Food' or 'Other'!");
			return false;
		}
	}
}
