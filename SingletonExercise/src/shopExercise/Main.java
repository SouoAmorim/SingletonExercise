package shopExercise;

public class Main {

	public static void main(String[] args) {

		ShopList list = ShopList.getInstance();

		list.addShop("Foodieees");
		list.addShop("Foodies");
		list.addShop("Otherspicy");
		list.addShop("spicy");
		list.addShop("Otherpop");
		list.addShop("Foodies");
		list.addShop("Foodieees");
		list.addShop("Otherspicy");

		System.out.println("---");
		
		list.iterate();
		
		System.out.println("---");

		list.downloadFoodList();
		list.downloadOtherList();
	}
}
