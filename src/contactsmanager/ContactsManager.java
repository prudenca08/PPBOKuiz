/*
 * Prudenca Ahmad Daffa Kurnia
 * 123190005
 * PPBO-D
 */

package contactsmanager;

public class ContactsManager {
    private final Contact [] temanSaya;
    private int temanCount = 0;
    // Constructor
    ContactsManager() {
        temanSaya = new Contact[200];
    }
    protected void addContact(Contact contact){
        temanSaya[temanCount] = contact;
        temanCount++;
    }
    public Contact searchContact(String searchNama){
        Contact result = new Contact(null, null, null);
        for(int i = 0; i<temanCount; i++){
            if(temanSaya[i].getName().equals(searchNama)){
                result.setName(temanSaya[i].getName());
                result.setEmail(temanSaya[i].getEmail());
                result.setPhoneNumber(temanSaya[i].getPhoneNumber());
            }
        }
        return result;
    } 
}
