package accessmodfiers;

class default1 {
	/*
	 * private int i=10; private void m1() { System.out.println(i); }
	 */

	int i = 10;

	void m1() {
		System.out.println(i);
	}

	public static void main(String[] args) {

		default1 aobj = new default1();

		// aobj.i=10; // cannot access since it is private
		// aobj.m1(); // cannot access since it is private

		aobj.i = 20;// default modifier
		aobj.m1();
	}
}
