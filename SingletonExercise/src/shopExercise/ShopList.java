package shopExercise;
import java.util.ArrayList;
import java.util.List;

public class ShopList {

	private Download download = new Download();

	private List<String> shopList = new ArrayList<>();

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
			if (shopList.contains(shopName)) {
				System.out.println(shopName + " already exists in the list!");
				return false;
			} else {
				shopList.add(shopName);
				System.out.println(shopName + " has been added to the list!");
				return true;
			}
		} else {
			System.out.println("The name has to contain 'Food' or 'Other' at the start to be eligible!");
			return false;
		}
	}

	public void downloadFoodList() {
		for (String listValues : shopList) {
			if (listValues.startsWith("Food")) {
				download.downloadFood(listValues);
			}
		}
		System.out.println("File updated!");
	}

	public void downloadOtherList() {
		for (String listValues : shopList) {
			if (listValues.startsWith("Other")) {
				download.downloadOther(listValues);
			}
		}
		System.out.println("File updated!");
	}

	public void iterate() {  //added for test purposes
		for (String shops : shopList) {
			System.out.println(shops);
		}
	}

}
