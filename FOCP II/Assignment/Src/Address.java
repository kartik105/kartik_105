import java.util.*;
class Address
{
	String line1;
	String line2;
	String city;
	String state;
	int pincode;
	Address()
	{
		this.line1 = null ;
		this.line2 = null ;
		this.city = null ;
		this.state = null ;
		this.pincode = 0 ; 
	}
		Address(String line1, String line2, String city,String state, int pincode)
		{
			this.line1 = line1;
			this.line2 = line2;
			this.city = city;
			this.state = state;
			this.pincode = pincode;
		}
		public void setAddress(String line1, String line2, String city, String state, int pincode)
  {
    this.line1 = line1; 
    this.line2 = line2;
    this.city= city;
    this.state= state; 
    this.pincode = pincode;
  }
  public String displayAddress()
  {
    System.out.println("Line1: " + line1 + "\nLine2: " + line2 + "\nCity: " + city + "\nState: " + state + "\nPincode: " + pincode);
    return "";
  }

}