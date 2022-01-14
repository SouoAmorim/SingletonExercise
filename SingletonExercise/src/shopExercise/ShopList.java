package shopExercise;
import java.util.ArrayList;
import java.util.List;

public class ShopList {
	
	private Download download = new Download();

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
			if (shopLists.isEmpty()) {
				shopLists.add(shopName);
				System.out.println(shopName + " has been added to the list!");
				return true;
			} else {
				if (shopLists.contains(shopName)) {
					System.out.println(shopName + " already exists in the list!");
					return false;
				} else {
					shopLists.add(shopName);
					System.out.println(shopName + " has been added to the list!");
					return true;
				}
			}
		} else {
			System.out.println("The name has to contain 'Food' or 'Other' at the start to be eligible!");
			return false;
		}
	}

	public void iterate() {
		for (String shops : shopLists) {
			System.out.println(shops);
		}
	}
	
	public void downloadFoodList() {
		for (String listValues : shopLists) {
			if (listValues.startsWith("Food")) {
				download.downloadFood(listValues);
			}
		}
		System.out.println("File updated!");
	}
	
	public void downloadOtherList() {
		for (String listValues : shopLists) {
			if (listValues.startsWith("Other")) {
				download.downloadOther(listValues);
			}
		}
		System.out.println("File updated!");
	}

	public void test (String name) {
		if (addShop(name) == true) {
			System.out.println("true");
		} else {
			System.out.println("not true");
		}
	}
}
