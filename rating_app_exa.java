import java.util.Scanner;



public class rating_app_exa {

	public static void main(String[] args) {

		HappyOrNot happyornot = new HappyOrNot();
		Device device = new Device();

		Scanner scan = new Scanner(System.in);

		int b1,b2,b3,b4;
		int exite =0;
		do {

			System.out.println("1 :D  2 smile  3 :|  4 sad  => 0 EXIT");
			b1 = scan.nextInt();
			happyornot.click(1);
			System.out.println("1 :D  2 smile  3 :|  4 sad  => 0 EXIT");

			b2 = scan.nextInt();
			happyornot.click(2);
			System.out.println("1 :D  2 smile  3 :|  4 sad  => 0 EXIT");

			b3 = scan.nextInt();
			happyornot.click(3);
			System.out.println("1 :D  2 smile  3 :|  4 sad  => 0 EXIT");

			b4 = scan.nextInt();
			happyornot.click(4);
			happyornot.printfeedback();
			device.setOn(false);
			System.out.println(device.isOn());
			happyornot.Shutdown();

		}while (exite !=0);

	}

}//end of main:

class Device{

	//Attributes:
	protected boolean isOn;

	public boolean isOn() {
		return isOn;
	}

	public void setOn(boolean isOn) {
		this.isOn = isOn;
	}

	//default constructor:
	public Device() {
		isOn = false;
	}

	// par constructor:

	//Methods:
	public void Start() {
		isOn = true;
	}

	public void Shutdown() {
		isOn = false;
	}

}//End of Device Class:

class HappyOrNot extends Device{

	//Attributes:
	protected int button1, button2, button3, button4;
	public static int clickCount;

	//Default Constructor:
	public HappyOrNot() {
		isOn = false;
		clickCount++;
		button1 = 0;
		button2 = 0;
		button3 = 0;
		button4 = 0;

	}

	//Methods:

	public void click(int button) {
		if(button == 1) {
			button1++;
			clickCount++;
		}

		else if(button == 2) {
			button2++;
			clickCount++;
		}
		else if(button == 3) {
			button3++;
			clickCount++;
		}
		else if(button == 4) {
			button4++;
			clickCount++;
		}

	}

	protected void printfeedback() {
		System.out.println("Numbers of clicks is: " + clickCount);
	}

	@Override
	public void Shutdown() {
		isOn = false;
		printfeedback();
	}


}//end.