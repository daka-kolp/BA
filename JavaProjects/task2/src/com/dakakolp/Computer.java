package com.dakakolp;

public class Computer {
    private String manufacturer;
    private int serialNumber;
    private float price;
    private int quantityCPU;
    private int frequencyCPU;

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setQuantityCPU(int quantityCPU) {
        this.quantityCPU = quantityCPU;
    }

    public void setFrequencyCPU(int frequencyCPU) {
        this.frequencyCPU = frequencyCPU;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public float getPrice() {
        return price;
    }

    public int getQuantityCPU() {
        return quantityCPU;
    }

    public int getFrequencyCPU() {
        return frequencyCPU;
    }
}
