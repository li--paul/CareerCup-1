import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<Object> set = new ArrayList<Object>();
		for (int i = 0; i < 5; i++) {
			set.add(i);
		}
		FindAllSubSets test = new FindAllSubSets(set);
		ArrayList<ArrayList<Object>> result = test.findAllSubSets();
		for (ArrayList oneSolu : result) {
			for (Object i : oneSolu) {
				System.out.print(i);
			}
			System.out.println("");
		}
	}
}