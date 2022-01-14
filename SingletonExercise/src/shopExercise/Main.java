package shopExercise;

public class Main {

	public static void main(String[] args) {
		
		ShopList list = ShopList.getInstance();
		
		//list.addShop("paulies");
		//list.addShop("FoodPaulies");
		//list.addShop("OtherCourtney");
		//list.addShop("FoodPaulies");
		
		
		//list.test("FoodPaulies");
		
		
		//list.addShopTest("Food");
		//list.addShopTest("Food2");
	//	list.addShopTest("Food");
		
		list.test("Foodieees");
		list.test("Foodies");
		list.test("Otherspicy");
		list.test("spicy");
		list.test("Otherpop");
		list.test("Foodies");
		list.test("Foodieees");
		list.test("Otherspicy");
		
		list.iterate();
		
		list.downloadFoodList();
		list.downloadOtherList();
	}

}
