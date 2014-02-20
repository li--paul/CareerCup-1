import java.util.ArrayList;

public class FindPath {
	ArrayList<Point> limitPoints, result;
	int x, y;

	public FindPath(ArrayList<Point> limitPoints, int x, int y) {
		this.limitPoints = limitPoints;
		this.x = x;
		this.y = y;
	}

	public ArrayList<Point> getPaths(int startX, int startY) {
		result = new ArrayList<Point>();
		if (getPathsRecursive(startX, startY))
			return result;
		return null;
	}

	private boolean isLimit(int x, int y) {
		Point limitCheck = new Point(x, y);
		for (Point limitPoint : limitPoints) {
			if (limitPoint.x == x && limitPoint.y == y)
				return true;
		}
		return false;
	}

	private boolean getPathsRecursive(int currentX, int currentY) {
		Point point = new Point(currentX, currentY);
		boolean hasRoute = false;
		result.add(point);

		if (currentX == this.x - 1 && currentY == this.y - 1)
			return true;

		if (point.x + 1 < this.x && !isLimit(point.x + 1, point.y)) // move to right
			hasRoute = getPathsRecursive(point.x + 1, point.y);

		if (!hasRoute && point.y + 1 < this.y && !isLimit(point.x, point.y + 1))
			hasRoute = getPathsRecursive(point.x, point.y + 1);

		if (!hasRoute)
			result.remove(point);

		return hasRoute;
	}

}