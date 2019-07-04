package com.company;

import com.company.contacts.Contact;
import com.company.messages.Message;
import com.company.phones.*;

public class Main {

    public static void main(String[] args) {

    Phone  phone = new SamsungGalaxyS9(90,"red","plastic","231231414");

    Contact contact1 = new Contact("0786675463","Ana","Pop");
    Contact contact2 = new Contact("0890456789", "Radu","Popescu");

    phone.addContact(contact1);
    phone.addContact(contact2);

    System.out.println('\n'+"Contactele sunt");
    phone.listContact();



    Message message11 = new Message ("mesaj 1 catre contact 1");
    Message message12 = new Message("mesaj 2 catre contact 1");

    phone.sendMessage(contact1,message11);
    phone.sendMessage(contact1, message12);

    phone.listMessage(contact1);



    phone.call(contact2);

    phone.viewHistory();

    }
}
