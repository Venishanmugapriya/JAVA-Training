import java.util.*;
import java.util.Scanner;
public class AddressBook{
public static void main(String[]args){
Map<String,String> contacts = new HashMap<>();
Scanner scanner = new Scanner(System.in);
while(true){
System.out.println("\nAddress Book Menu:");
System.out.println("1.Add to Contacts:");
System.out.println("2.Search the Contact:");
System.out.println("3.Delete the Contact:");
System.out.println("4. Show Full Contact List");
System.out.println("5.Exit:");
System.out.print("Enter your Choice:");
int choice=scanner.nextInt();
scanner.nextLine();
switch(choice){
case 1:
addContact(contacts,scanner);
break;
case 2:	
searchContact(contacts,scanner);
break;
case 3:
deleteContact(contacts,scanner);
break;
case 4:
displayAllContacts(contacts,scanner);
break;
case 5:
System.out.println("Exiting........");
scanner.close();
System.exit(0);
default:
System.out.println("Invalid choice.Please enter a number between 1 and 4.");
}
}
}
public static void addContact(Map<String,String> contacts,Scanner scanner){
System.out.print("Enter Contact Name:");
String name=scanner.nextLine();
System.out.print("Enter the Phone Number:");
String phoneNumber=scanner.nextLine();
contacts.put(name,phoneNumber);
System.out.println("Contact added: "+name+","+phoneNumber);
}
public static void searchContact(Map<String,String> contacts,Scanner scanner){
System.out.print("Enter a name to search: ");
String name=scanner.nextLine();
if (contacts.containsKey(name)){
System.out.println("Contact Found: "+name+"," + contacts.get(name));
} else {
System.out.println("Contact not found: " + name);
}
}
public static void deleteContact(Map<String, String> contacts, Scanner scanner) {
System.out.print("Enter contact name to delete: ");
String name = scanner.nextLine();
if (contacts.containsKey(name)) {
contacts.remove(name);
System.out.println("Contact deleted: " + name);
} else {
System.out.println("Contact not found: " + name);
}
}
public static void displayAllContacts(Map<String, String> contacts, Scanner scanner) {
if (contacts.isEmpty()) {
System.out.println("Address book is empty.");
} else {
System.out.println("Contact List:");
for (String name : contacts.keySet()) {
System.out.println("Name: " + name + ", Phone Number: " + contacts.get(name));
}
}
}
}


