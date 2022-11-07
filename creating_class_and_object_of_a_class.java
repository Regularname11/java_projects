import java.text.NumberFormat;

class ex1 {

	public static void main(String[] args) {
		//Object:
		PlayStation4 ps = new PlayStation4("PlayStation4", 399);
		PlayStation4 ps1 = new PlayStation4();

		ps.printData();		
		ps1.printData();
	}  //End of main
}

//Class
class PlayStation4

{   
    NumberFormat currency = NumberFormat.getCurrencyInstance();
	public String name;
	public String price = currency.format(399);
    
	//default constructor:
	public PlayStation4() {
		name = "PS4";
	}

	//parameterized constructors:
	public  PlayStation4(String consoleName, int i) 
	{
		name = consoleName;
	}

	//methods:
	public void name() 
    {
		System.out.println("Console Name: " + name);
	}

	public void price() 
    {
		System.out.println("Price: " + price);
	}

	public void printData() 
	{
		System.out.println("----Concole----");
		name();
		price();
	}  //End methods



}  //End class