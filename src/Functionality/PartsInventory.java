package Functionality;

import Components.CPU;
import Components.GPU;
import Components.MB;
import Components.RAM;

import java.util.ArrayList;
import java.util.List;

public class PartsInventory {

    static List<CPU> cpuList = new ArrayList<>();
    static List<GPU> gpuList = new ArrayList<>();
    static List<RAM> ramList = new ArrayList<>();
    static List<MB> mbList = new ArrayList<>();

    public static void loadParts(String filename) {

        cpuList = PartsReader.readCPU(filename);
        gpuList = PartsReader.readGPU(filename);
        ramList = PartsReader.readRAM(filename);
        mbList = PartsReader.readMB(filename);

    }

}