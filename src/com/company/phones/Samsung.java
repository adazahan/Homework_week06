package com.company.phones;

import static com.company.utils.AppConstants.SAMSUNG_BRAND;

public abstract class Samsung extends Product {
    public Samsung(String model, int batteryLife, String color, String material, String imei) {
        super(SAMSUNG_BRAND, model, batteryLife, color, material, imei);
    }


}
