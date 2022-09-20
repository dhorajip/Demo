package exceptions;

public class HandleCheckedEx {
	void m1() throws InterruptedException {
		Thread.sleep(4000);
	}

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Program is started");
		System.out.println("Program is in progress");

		try {
			Thread.sleep(4000); // checked exception
		}

		catch (InterruptedException e) {
			e.printStackTrace();
		}

		Thread.sleep(4000);

		System.out.println("Program is completed");
		System.out.println("Program is exited");

	}
}
