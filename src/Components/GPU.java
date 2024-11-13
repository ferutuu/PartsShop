package Components;

import Interfaces.gpuSpecs;

public class GPU implements gpuSpecs {

    public String manufacturer;
    public String model;
    public int price;
    public int coreClock;
    public int videoMemory;

    public GPU(String manufacturer, String model, int coreClock, int videoMemory, int price) {

        this.manufacturer = manufacturer;
        this.model = model;
        this.price = price;
        this.coreClock = coreClock;
        this.videoMemory = videoMemory;
    }

    @Override
    public int getCoreClock() {
        return coreClock;
    }

    @Override
    public int getVideoMemory() {
        return videoMemory;
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