package javapractice;

import java.util.*;
public class AddressBookSystem {
		private  ArrayList<String>ContactList1;

		public void setContact1(ArrayList<String>Contact1) {
			this.ContactList1=Contact1;
		}
				public ArrayList<String> getContactList1(){
			return this.ContactList1;
		}
		
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter FirstName");
	String FN=sc.nextLine();
	System.out.println("Enter LastName");
	String LN=sc.nextLine();
	System.out.println("Enter Address");
	String address=sc.nextLine();
	System.out.println("Enter City");
	String city=sc.nextLine();
	System.out.println("Enter State");
	String state=sc.nextLine();
	System.out.println("Enter Email");
	String email=sc.nextLine();
	System.out.println("Enter Zip");
	int zip=sc.nextInt();
	System.out.println("Enter Phone");
	int phone=sc.nextInt();
   String Zip=Integer.toString(zip);
   String Phone=Integer.toString(phone);
   
	AddressBookSystem contact=new AddressBookSystem();
	ArrayList<String>List1=new ArrayList<>();

    List1.add(FN);
    List1.add(LN);
    List1.add(address);
    List1.add(city);
    List1.add(state);
    List1.add(email);
    List1.add(Zip);
    List1.add(Phone);
    contact.setContact1(List1);

System.out.println("Welcome to the address book program "+List1);
}
}