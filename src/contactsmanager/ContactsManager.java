/*
 * Prudenca Ahmad Daffa Kurnia
 * 123190005
 * PPBO-D
 */

package contactsmanager;

public class ContactsManager {
    private Contact [] myFriends;
    private int friendsCount = 0;
  
    ContactsManager() {
        myFriends = new Contact[500];
    }
    protected void addContact(Contact contact){
        myFriends[friendsCount] = contact;
        friendsCount++;
    }
    public Contact searchContact(String searchName){
        Contact result = new Contact(null, null, null);
        for(int i = 0; i<friendsCount; i++){
            if(myFriends[i].getName().equals(searchName)){
                result.setName(myFriends[i].getName());
                result.setEmail(myFriends[i].getEmail());
                result.setPhoneNumber(myFriends[i].getPhoneNumber());
            }
        }
        return result;
    } 
}
