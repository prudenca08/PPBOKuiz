/*
 * Prudenca Ahmad Daffa Kurnia
 * 123190005
 * PPBO-D
 */

package contactsmanager;

import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
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
        String searchNama;
        while("y".equals(isAgain)){
            System.out.print("Cari Nama : ");
            searchNama = input.nextLine();
            System.out.println("Mencari....");
            if(myContactsManager.searchContact(searchNama).getName() == null){
                System.out.println(searchNama +"'s contact tidak ditemukan!");
            }
            else{
                System.out.println("Nama     : "+myContactsManager.searchContact(searchNama).getName());
                System.out.println("No HP    : "+myContactsManager.searchContact(searchNama).getPhoneNumber());
                System.out.println("Email    : "+myContactsManager.searchContact(searchNama).getEmail());
            }
            System.out.print("\nUlangi? (y/n) : ");
            isAgain = input.nextLine();
        }
    }
    
}
