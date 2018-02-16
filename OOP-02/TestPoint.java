class TestPoint {
	
	public static void main(String[] args) {

		Point pt = new Point(1.0, 2.0, -1.0);
		System.out.println(pt.getX() + ", " + pt.getY() + ", " + pt.getZ());
		pt.setX(pt.getX() + 5);
		System.out.println(pt.getX() + ", " + pt.getY() + ", " + pt.getZ());

	}
}