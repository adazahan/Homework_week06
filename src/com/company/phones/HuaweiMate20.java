package com.company.phones;

import com.company.contacts.Contact;

import static com.company.utils.AppConstants.HUAWEIMATE20_MODEL;

public class HuaweiMate20 extends Huawei {
    public HuaweiMate20(int batteryLife, String color, String material, String imei) {
        super(HUAWEIMATE20_MODEL, batteryLife, color, material, imei);
    }


}
