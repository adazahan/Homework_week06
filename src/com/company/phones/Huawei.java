package com.company.phones;

import com.company.contacts.Contact;

import static com.company.utils.AppConstants.HUAWEI_BRAND;

public abstract class  Huawei extends Product{
    public Huawei(String model, int batteryLife, String color, String material, String imei) {
        super(HUAWEI_BRAND, model, batteryLife, color, material, imei);
    }


}
