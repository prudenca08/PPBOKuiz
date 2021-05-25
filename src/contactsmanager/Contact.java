/*
 * Prudenca Ahmad Daffa Kurnia
 * 123190005
 * PPBO-D
 */

package contactsmanager;

public class Contact {
    private String nama;
    private String email;
    private String noHP;

    public Contact(String nama, String email, String noHP) {
        this.nama = nama;
        this.email = email;
        this.noHP = noHP;
    }
    
    public void setName(String nama) {
        this.nama = nama;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String noHP) {
        this.noHP = noHP;
    }
    
    public String getName() {
        return nama;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return noHP;
    }
}
