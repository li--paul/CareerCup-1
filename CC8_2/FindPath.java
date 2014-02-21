import java.util.ArrayList;

public class FindPath {
	ArrayList<Point> limitPoints, result;
	ArrayList<ArrayList<Point>> results;
	int x, y;

	public FindPath(ArrayList<Point> limitPoints, int x, int y) {
		this.limitPoints = limitPoints;
		this.x = x;
		this.y = y;
	}

	public ArrayList<ArrayList<Point>> getPaths(int startX, int startY) {
		result = new ArrayList<Point>(); // to store each possible solution
		results = new ArrayList<ArrayList<Point>>(); // to store all solutions
		getPathsRecursive(startX, startY);
		return results;
	}

	private boolean isLimit(int x, int y) { // return whether the point is a limit point
		Point limitCheck = new Point(x, y);
		for (Point limitPoint : limitPoints) {
			if (limitPoint.x == x && limitPoint.y == y)
				return true;
		}
		return false;
	}

	private void getPathsRecursive(int currentX, int currentY) {
		Point point = new Point(currentX, currentY);
		result.add(point);

		if (currentX == this.x - 1 && currentY == this.y - 1) {
			ArrayList<Point> solution = new ArrayList<Point>(result);
			results.add(solution); // the path could get to the destination, hence it is a solution
		}

		if (point.x + 1 < this.x && !isLimit(point.x + 1, point.y)) // move to right
			getPathsRecursive(point.x + 1, point.y);

		if (point.y + 1 < this.y && !isLimit(point.x, point.y + 1)) // move to down
			getPathsRecursive(point.x, point.y + 1);

		result.remove(point); // remove the current point before go back to its parent point
	}
}