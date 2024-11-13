package Components;

import Interfaces.cpuSpecs;

public class CPU implements cpuSpecs {

    public String manufacturer;
    public String model;
    public String socket;
    public int price;
    public int coreClock;
    public int coreCount;

    public CPU(String manufacturer, String model, String socket, int coreClock, int coreCount, int price) {

        this.manufacturer = manufacturer;
        this.model = model;
        this.price = price;
        this.socket = socket;
        this.coreClock = coreClock;
        this.coreCount = coreCount;
    }

    @Override
    public String getSocket() {
        return socket;
    }

    @Override
    public int getCoreClock() {
        return coreClock;
    }

    @Override
    public int getCoreCount() {
        return coreCount;
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