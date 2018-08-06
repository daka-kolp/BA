package com.dakakolp;

import java.util.ArrayList;
import java.util.List;

public class HomeTaskTest5 {
    public static void main(String[] args) {

        List<Device> devices = new ArrayList<Device>();

        devices.add(new Monitor("Sim", 123.45F, "AD789456123", 1299, 600));
        devices.add(new EthernetAdapter("Samsung", 789.60F,"QW85226397", 1000,"???"));

        for (Device device : devices) {
            System.out.println(device);
        }

    }
}
