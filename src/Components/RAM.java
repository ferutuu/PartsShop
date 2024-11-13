package Components;

import Interfaces.ramSpecs;

public class RAM implements ramSpecs {

    public String manufacturer;
    public String model;
    public String memoryType;
    public int price;
    public int frequency;
    public int capacity;
    public int stickNum;

    public RAM(String manufacturer, String model, String memoryType, int frequency, int capacity, int stickNum, int price) {

        this.manufacturer = manufacturer;
        this.model = model;
        this.price = price;
        this.memoryType = memoryType;
        this.frequency = frequency;
        this.capacity = capacity;
        this.stickNum = stickNum;
    }

    @Override
    public String getMemoryType() {
        return memoryType;
    }

    @Override
    public int getFrequency() {
        return frequency;
    }

    @Override
    public int getCapacity() {
        return capacity;
    }

    @Override
    public int getStickNum() {
        return stickNum;
    }

    @Override
    public String getManufacturer() {
        return manufacturer;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public int getPrice() {
        return price;
    }

}