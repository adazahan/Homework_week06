package com.company.phones;

import com.company.contacts.Contact;
import com.company.messages.Message;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Product implements Phone {
    private static int globalId=0;
    private int id;
    private String brand;
    private String model;
    private static int batteryLife;
    private String color;
    private String material;
    private String imei;

    public Product(String brand, String model, int batteryLife, String color, String material, String imei) {
        this.id=globalId++;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.batteryLife = batteryLife;
        this.material = material;
        this.imei = imei;
    }

    public Product() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public static int getBatteryLife() {
        return batteryLife;
    }

    public static void setBatteryLife(int batteryLife) {
        Product.batteryLife = batteryLife;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", material='" + material + '\'' +
                ", imei='" + imei + '\'' +
                ", listadecontacte=" + Arrays.toString(listadecontacte) +
                '}';
    }

    private static int idx = 0;
    private Contact[] listadecontacte = new Contact[10];

    public void addContact(Contact contact) {
        listadecontacte[idx++] = contact;
    }

    public void listContact() {
        for (Contact contact : listadecontacte) {
            if (contact != null) {
                System.out.println(contact);
            }
        }
    }



    List <Message> listaMesajelor = new ArrayList<>();

    public void sendMessage(Contact contact, Message message) {
        if(message.getMessageContent().length()>100)
        {System.out.println('\n'+"Mesajul catre contactul cu numarul de telefon " + contact.getPhoneNumber() + " nu a fost trimis. Dimensiunea mesajului depaseste 100 de caractere");}
        else {
            System.out.println('\n'+"Mesajul catre contactul cu numarul de telefon "+ contact.getPhoneNumber() + " a fost trimis.");
            batteryLife--;
            System.out.println("Noul nivel al bateriei telefonului este de " + batteryLife + " de ore");
            listaMesajelor.add(message);
            }
        }


    public void listMessage (Contact contact) {
            System.out.println('\n'+"lista mesajelor catre contactul cu numarul de telefon " + contact.getPhoneNumber() + " este: " +listaMesajelor);
        }


    List<Contact> historyCalls = new ArrayList<>();

    public void call (Contact contact) {
            System.out.println('\n'+ "A fost apelat contactul cu numarul de telefon " + contact.getPhoneNumber());
            batteryLife = batteryLife -2;
            System.out.println("Noul nivel al bateriei telefonului este de " + batteryLife + " de ore");
            historyCalls.add(contact);
        }


    public void viewHistory() {
         System.out.println('\n'+"Istoricul apelurilor: "+ historyCalls);
    }


}
