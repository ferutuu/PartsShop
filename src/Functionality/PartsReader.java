package Functionality;

import Components.CPU;
import Components.GPU;
import Components.RAM;
import Components.MB;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PartsReader {

    public static List<CPU> readCPU(String filename) {

        List<CPU> cpuList = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] values = line.split(",");

                if (values[0].equals("CPU")) {
                    CPU cpu = new CPU(values[1], values[2], values[3], Integer.parseInt(values[4]), Integer.parseInt(values[5]), Integer.parseInt(values[6]));
                    cpuList.add(cpu);
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading CPUs");
            e.printStackTrace();
        }
        return cpuList;
    }


    public static List<GPU> readGPU(String filename) {

        List<GPU> gpuList = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] values = line.split(",");

                if (values[0].equals("GPU")) {
                    GPU gpu = new GPU(values[1], values[2], Integer.parseInt(values[3]), Integer.parseInt(values[4]), Integer.parseInt(values[5]));
                    gpuList.add(gpu);
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading GPUs");
            e.printStackTrace();
        }
        return gpuList;
    }


    public static List<RAM> readRAM(String filename) {

        List<RAM> ramList = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] values = line.split(",");

                if (values[0].equals("RAM")) {
                    RAM ram = new RAM(values[1], values[2], values[3], Integer.parseInt(values[4]), Integer.parseInt(values[5]), Integer.parseInt(values[6]), Integer.parseInt(values[7]));
                    ramList.add(ram);
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading RAMs");
            e.printStackTrace();
        }
        return ramList;
    }


    public static List<MB> readMB(String filename) {

        List<MB> mbList = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] values = line.split(",");

                if (values[0].equals("MB")) {
                    MB mb = new MB(values[1], values[2], values[3], values[4], values[5], Integer.parseInt(values[6]));
                    mbList.add(mb);
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading MBs");
            e.printStackTrace();
        }
        return mbList;
    }

}