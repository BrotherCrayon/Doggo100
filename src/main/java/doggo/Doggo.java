package doggo;

import java.util.ArrayList;
import java.util.List;

public class Doggo {

	public static void main(String[] args) {

		System.out.println(doggo100(96));

	}

	public static List<String> doggo100(int place) {
		List<String> dogList = new ArrayList<String>();

		for (int i = 1; i <= 100; i++) {
			if (i < 10 || i > 20) {
				int unit = i % 10;
				switch (unit) {
				case 1:
					dogList.add(i + "st");
					break;
				case 2:
					dogList.add(i + "nd");
					break;
				case 3:
					dogList.add(i + "rd");
					break;
				default:
					dogList.add(i + "th");
					break;
				}
			} else {
				dogList.add(i + "th");
			}

		}
		dogList.remove(place - 1);
		return dogList;
	}

}
