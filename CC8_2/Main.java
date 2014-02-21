import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		int x = 5, y = 5;
		ArrayList<Point> limitPoints = new ArrayList<Point>();
		
		for (int i = 0; i < x; i += 3) {
			for (int j = 0; j < y; j += 2) {
				Point limitPoint = new Point((int)(Math.random() * (x - 1)), (int)(Math.random() * (y - 1)));
				if (limitPoints.contains(limitPoint) || (limitPoint.x == 0 && limitPoint.y == 0) || (limitPoint.x == x && limitPoint.y == y))
					continue;
				limitPoints.add(limitPoint);
			}
		}

		System.out.println("Limit points are :");
		for (Point limitPoint : limitPoints) {
			System.out.print("(" + limitPoint.x + ", " + limitPoint.y + ") ");
		}
		System.out.print("\n");

		FindPath fp = new FindPath(limitPoints, x, y);
		ArrayList<ArrayList<Point>> results = fp.getPaths(0, 0);
		System.out.println("Results of all path to the destination is :");
		if (results == null) 
			System.out.println("NO WAY");
		else {
			for (ArrayList<Point> result : results) {
				for (Point pathPoint : result) {
					System.out.print("(" + pathPoint.x + ", " + pathPoint.y + ") ");
				}
				System.out.print("\n");
			}
			System.out.print("\n");
		}
	}
}