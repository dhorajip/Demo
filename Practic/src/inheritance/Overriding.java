package inheritance;

	class Bank {
		int getRateOfinterest() {
			return 0;
		}
	}

	class SBI extends Bank {

		int getRateOfinterest() // Overridden
		{
			return 10;
		}
	}

	class ICICI extends Bank {
		int getRateOfinterest() // Overridden
		{
			return 15;
		}
	}

	class AXIS extends Bank {

		int getRateOfinterest() // Overridden
		{
			return 12;
		}

	}

	public class Overriding {

		public static void main(String[] args) {
			SBI sbiobj = new SBI();
			System.out.println(sbiobj.getRateOfinterest()); // 10

			ICICI iciciobj = new ICICI();
			System.out.println(iciciobj.getRateOfinterest()); // 15

			AXIS axisobj = new AXIS();
			System.out.println(axisobj.getRateOfinterest()); // 12

		}

	}

