package javapractice;

public class AddressBookSystem {
	public class Contact{
		private String firstName;
		private String LastName;
		private String address;
		private String city;
		private String state;
		private int zip;
		private int phoneNum;
		private String email;
		public Contact(String FN,String LN,String address,String city,String state,int zip,
				int phone,String mail) {
			this.firstName=FN;
			this.LastName=LN;
			this.address=address;
			this.city=city;
			this.state=state;
			this.zip=zip;
			this.phoneNum=phone;
			this.email=mail;
		}
	}
	
public static void main(String[] args) {
System.out.println("Welcome to the address book program");


}
}

