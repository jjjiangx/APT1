
public class CirclesCountry {
	public int leastBorders(int[] x, int[] y, int[] r, int x1, int y1, int x2, int y2) {
		int crosses = 0;

		// CHECK IF STARTING POSITION IS IN A CIRCLE
		for (int i = 0; i < x.length; i++) {
			if (isInside(x1, y1, x[i], y[i], r[i])) { // if the starting point is inside a circle
				if (!isInside(x2, y2, x[i], y[i], r[i])) { // if ending point is NOT inside the same circle
					crosses++;
				}
			}
		}

		// CHECK IF ENDING POINT IN A CIRCLE
		for (int i = 0; i < x.length; i++) {
			if (isInside(x2, y2, x[i], y[i], r[i])) { // if the ending point is inside a circle
				if (!isInside(x1, y1, x[i], y[i], r[i])) { // if starting point is NOT inside the same circle
					crosses++;
				}
			}
		}

		return crosses;
	}

	public boolean isInside (int x, int y, int cx, int cy, int r) {
		if (Math.pow(x - cx, 2) + Math.pow(y- cy, 2) < Math.pow (r, 2)){ // if it is inside the circle
			return true; // return true
		}
		else { // if it's outside the circle
			return false; // return false
		}
	}
}
