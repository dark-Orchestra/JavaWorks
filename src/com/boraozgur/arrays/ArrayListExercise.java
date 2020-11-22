package com.boraozgur.arrays;

import java.util.Scanner;


public class ArrayListExercise {
	private static Scanner scanner = new Scanner(System.in);
	private static MobilePhone mobilePhone = new MobilePhone("0541 818 46 99");

	public static void main(String[] args) {
		
		boolean quit = false;
		startPhone();
		printActions();
		
		while(!quit) {
			System.out.println("\nEnter action : (6 to show available actions)");
			int action = scanner.nextInt();
			scanner.nextLine();
			
			switch (action) {
			case 0 :
				System.out.println("\nShutting down..");
				quit = true;
				break;
			case 1:
				mobilePhone.printContacts();
				break;
			case 2 :
				addNewContact();
				break;
			case 3 :
				updateContact();
				break;
			case 4 :
				removeContact();
				break;
			case 5 :
				queryContact();
				break;
			case 6:
				printActions();
				break;

			default:
				throw new IllegalArgumentException("Unexpected value: " + action);
			}
		}		
		
	}
	
	private static void addNewContact() {
		System.out.println("Enter new contact name:");
		String name = scanner.nextLine();
		System.out.println("Enter phone number: ");
		String phoneNumber = scanner.nextLine();
		Contact newContact = Contact.createContract(name, phoneNumber);
		if (mobilePhone.addNewContact(newContact)) {
			System.out.println("New contact added: name = " + name + " , phone = " + phoneNumber);
		} else {
			System.out.println("Cannot add," + name + " already in file");
		}

	}
	
	private static void updateContact() {
		System.out.println("Enter existing contact name:");
		String name = scanner.nextLine();
		Contact existingContactRecord = mobilePhone.queryContact(name);
		if (existingContactRecord == null) {
			System.out.println("Contact not found");
			return;
		}

		System.out.println("Print enter new contact name:");
		String newName = scanner.nextLine();
		System.out.println("Enter new contact phoneNumber:");
		String number = scanner.nextLine();
		Contact newContact = Contact.createContract(newName, number);
		if (mobilePhone.updateContact(existingContactRecord, newContact)) {
			System.out.println("Succesfully updated record");
		} else {
			System.out.println("Error updating record.");
		}

	}
	
	private static void removeContact() {
		System.out.println("Enter existing contact name:");
		String name = scanner.nextLine();
		Contact existingContactRecord = mobilePhone.queryContact(name);
		if (existingContactRecord == null) {
			System.out.println("Contact not found");
			return;
		}

		if (mobilePhone.removeContact(existingContactRecord)) {
			System.out.println("Succesfully deleted");
		} else {
			System.out.println("Error deleting contact");
		}

	}
	
	private static void queryContact() {
		System.out.println("Enter existing contact name:");
		String name = scanner.nextLine();
		Contact existingContactRecord = mobilePhone.queryContact(name);
		if (existingContactRecord == null) {
			System.out.println("Contact not found");
			return;
		}

		System.out.println("Name:" + existingContactRecord.getName() + " phone number is "
				+ existingContactRecord.getPhoneNumber());

	}
	
		
	private static void startPhone() {
		System.out.println("Starting phone");
	}
	private static void printActions() {
		System.out.println("\nAvailable actions:\nPress");
		System.out.println( "0 - to shutdown\n"+
						    "1 - to print contacts\n"+
							"2 - to add a new contact\n"+
							"3 - to update an existing contact\n"+
							"4 - to remove an existing contact\n"+
							"5 - query if an existing contact exists\n"+
							"6 - to print a list of available actions.");
		System.out.println("Choose your action: ");
		
	}

}
