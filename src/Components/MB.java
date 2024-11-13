package Components;

import Interfaces.mbSpecs;

public class MB implements mbSpecs {

    public String manufacturer;
    public String chipset;
    public String model;
    public String socket;
    public String memoryType;
    public int price;

    public MB(String manufacturer, String chipset, String model, String socket, String memoryType, int price) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.price = price;
        this.chipset = chipset;
        this.socket = socket;
        this.memoryType = memoryType;
    }

    @Override
    public String getChipset() {
        return chipset;
    }

    @Override
    public String getSocket() {
        return socket;
    }

    @Override
    public String getMemoryType() {
        return memoryType;
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