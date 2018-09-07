package contacmanager;

public class Main {

    public static void main(String[] args) {
        ContactsManager myContactsManager = new ContactsManager();
        
        Contact friendMinh = new Contact();
        friendMinh.name = "Minh";
        friendMinh.phoneNumber="01233466024";
        friendMinh.email = "minh@gmail.com";
        
        myContactsManager.addContact(friendMinh);
        
        Contact found = myContactsManager.searchContact("Minh");
        System.out.println(found.phoneNumber);
    }
    
}
