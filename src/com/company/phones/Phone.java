package com.company.phones;

import com.company.contacts.Contact;
import com.company.messages.Message;

public interface Phone {

    void addContact(Contact contact);
    void listContact();


   void sendMessage(Contact contact, Message message);

   void listMessage(Contact contact);

   void call(Contact contact);
   void viewHistory();

}
