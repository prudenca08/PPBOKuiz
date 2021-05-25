/*
 * Prudenca Ahmad Daffa Kurnia
 * 123190005
 * PPBO-D
 */

package contactsmanager;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        ContactsManager myContactsManager = new ContactsManager();
        Contact daffa = new Contact("Prudenca Ahmad Daffa Kurnia", "prudencaahdaffa08gmail.com", "087700079712");
        myContactsManager.addContact(daffa);
        Contact nabilla = new Contact("Nabilla Wanda Sabrina", "bilbilasab@gmail.com", "08123456789");
        myContactsManager.addContact(nabilla);
        Contact rio = new Contact("Rio Rizky", "rioriorio@gmail.com", "083435233322");
        myContactsManager.addContact(rio);
        Contact tita = new Contact("Anggitha Putri Rachmandini", "anggithaputr@gmail.com", "087746434344");
        myContactsManager.addContact(tita);
        
        String isAgain = "y";
        String searchName;
        while("y".equals(isAgain)){
            System.out.print("Search Name : ");
            searchName = input.nextLine();
            System.out.println("Searching....");
            if(myContactsManager.searchContact(searchName).getName() == null){
                System.out.println(searchName +"'s Contact Not Found!");
            }
            else{
                System.out.println("Name     : "+myContactsManager.searchContact(searchName).getName());
                System.out.println("Number   : "+myContactsManager.searchContact(searchName).getPhoneNumber());
                System.out.println("Email    : "+myContactsManager.searchContact(searchName).getEmail());
            }
            System.out.print("\nAgain? (y/n) : ");
            isAgain = input.nextLine();
        }
    }
    
}
