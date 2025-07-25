import java.util.HashMap;
import java.util.Scanner;

public class PhoneBook {

	public static void main(String[] args) {
		HashMap<String,String> list =  new HashMap<>();
		Scanner scanner = new Scanner(System.in);
		int choice=0;
		do {
			System.out.println();
			System.out.println();
			System.out.println(" ------------ PHONE BOOK ------------");
			System.out.println("1 : Add Contact");
			System.out.println("2 : Delete Contact");
			System.out.println("3 : Search Contact");
			System.out.println("4 : Display All Contacts");
			System.out.println("5 : Exit");
			choice = scanner.nextInt();
			scanner.nextLine();
			
			switch(choice)
			{
			case 1: 
				System.out.print("Enter Name :-    ");       // enter name 
				String name = scanner.nextLine();
				System.out.print("Enter Number :-");     // enter number
				String number = scanner.nextLine();
     			list.put(name, number);
     			System.out.println("✅ Contact Added Successfully");     // message display that added 
				break;
				
			case 2: 
				System.out.println("Enter Name to delete :- ");
				String nametoDelete = scanner.nextLine();
				if(list.containsKey(nametoDelete))
				{
					list.remove(nametoDelete);
					System.out.println("❌ Contact Deleted Successfully");
				}else
				{
					System.out.println("Contact Not Deleted ! "
							+ "⚠️ Contact Not Found");
				}
				break;
				
			case 3: 
				System.out.println("Enter Name to Search :-");
				String nameSearch= scanner.nextLine();
				if(list.containsKey(nameSearch))
				{
					System.out.println("Searched Name : ");
					System.out.println( "📞"+ nameSearch + " : " + list.get(nameSearch) );
				}else
				{
					System.out.println("⚠️ Contact Not Found ");
				}
				break;
				
			case 4: 
				System.out.println("--- All Contacts --- ");
			    for(String contact : list.keySet())
			    {
			    	System.out.println(contact + " : " + list.get(contact));
			    }
			    break;
			    
			case 5:
				System.out.println(" 👋 Exiting Phone Book");
				break;
				
			default :
				System.out.println(" ⚠️ Invalid Choice ");
			}
		   }while (choice !=0);
		
		scanner.close();

	}

}
