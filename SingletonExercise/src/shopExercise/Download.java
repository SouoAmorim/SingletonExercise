package shopExercise;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Download {

	private File foodFile = new File("food.txt");
	private File otherFile = new File("other.txt");

	private PrintWriter foodWriter;
	private PrintWriter otherWriter;

	public Download() {
		try {
			foodWriter = new PrintWriter(foodFile);
			otherWriter = new PrintWriter(otherFile);
		} catch (FileNotFoundException e) {
			e.getMessage();
		}
	}

	public void downloadFood(String shop) {
		foodWriter.println(shop);
		foodWriter.flush();
	}

	public void downloadOther(String shop) {
		otherWriter.println(shop);
		otherWriter.flush();
	}
	
}
