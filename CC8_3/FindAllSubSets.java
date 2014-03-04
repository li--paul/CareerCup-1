import java.util.ArrayList;

public class FindAllSubSets {
	ArrayList<Object> set;
	ArrayList<ArrayList<Object>> result;

	public FindAllSubSets (ArrayList<Object> set) {
		this.set = set;
	}

	public ArrayList<ArrayList<Object>> findAllSubSets() {
		result = new ArrayList<ArrayList<Object>>();
		ArrayList<Object> tempSet = new ArrayList<Object>();
		findSubSets(set, tempSet, 0);
		return result;
	}

	private void findSubSets(ArrayList<Object> set, ArrayList<Object> tempSet, int currentIdx) {
		if (currentIdx == set.size() - 1) {
			ArrayList<Object> oneSolution = new ArrayList<Object>(tempSet);
			result.add(oneSolution);
		} else {
			tempSet.add(set.get(currentIdx));
			findSubSets(set, tempSet, currentIdx + 1);
			tempSet.remove(tempSet.size() - 1);

			findSubSets(set, tempSet, currentIdx + 1);
		}
		
	}
}