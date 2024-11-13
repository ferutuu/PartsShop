package Functionality;

import Components.CPU;
import Components.GPU;
import Components.MB;
import Components.RAM;

import java.util.Scanner;

public class SearchItem {

    public static void browseCPU(CPU[] cpuList, Cart cart) {
        System.out.println("CPUs in stock:\n");
        for(int i = 0; i < cpuList.length; i++)
            System.out.println((i+1) + ". " + cpuList[i].getManufacturer() + " " + cpuList[i].getModel()
                    + " " + cpuList[i].getSocket());
        System.out.println("""
                
                Which CPU would you like to inspect?
                """);
        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();
        for(int j = 0; j <= cpuList.length; j++){
            if(choice == j){
                System.out.println("The " + cpuList[j-1].getManufacturer() + " "
                        + cpuList[j-1].getModel()  + " has " + cpuList[j-1].getCoreCount()
                        + " cores and a clock speed of " + cpuList[j-1].getCoreClock()
                        + "MHz. \nIt is compatible with an " + cpuList[j-1].getSocket()
                        + " socket.\nPrice: " + cpuList[j-1].getPrice());
                cart.addItem(cpuList[j-1]);
            }
        }
    }


    public static void browseGPU(GPU[] gpuList, Cart cart) {
        System.out.println("GPUs in stock:\n");
        for(int i = 0; i < gpuList.length; i++)
            System.out.println((i+1) + ". " + gpuList[i].getManufacturer() + " " + gpuList[i].getModel());
        System.out.println("""
                
                Which GPU would you like to inspect?
                """);
        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();
        for(int j = 0; j <= gpuList.length; j++){
            if(choice == j){
                System.out.println("The " + gpuList[j-1].getManufacturer() + " "
                        + gpuList[j-1].getModel() + " has " + gpuList[j-1].getVideoMemory()
                        + "GB of VRAM and a core clock of " + gpuList[j-1].getCoreClock() +"MHz.\nPrice: "
                        + gpuList[j-1].getPrice());
                cart.addItem(gpuList[j-1]);
            }
        }
    }


    public static void browseRAM(RAM[] ramList, Cart cart) {
        System.out.println("Components.RAM in stock:\n");
        for (int i = 0; i < ramList.length; i++)
            System.out.println((i+1) + ". " + ramList[i].getManufacturer() + " " + ramList[i].getModel() + " "
                    + ramList[i].getCapacity() + "GB " + ramList[i].getMemoryType());
        System.out.println("""
                
                Which Components.RAM would you like to inspect?
                """);
        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();
        for(int j = 0; j <= ramList.length; j++){
            if(choice == j){
                System.out.println("The " + ramList[j-1].getManufacturer() + " " + ramList[j-1].getModel()
                        + " kit contains " + ramList[j-1].getStickNum() + " sticks of " + ramList[j-1].getCapacity()/2
                        + "GB " + ramList[j-1].getMemoryType() + " Components.RAM running at " + ramList[j-1].getFrequency() + " MHz." +
                        "\nThis kit will provide " + ramList[j-1].getCapacity() + "GB of " + ramList[j-1].getMemoryType()
                        + " Components.RAM.\nPrice: " + ramList[j-1].getPrice());
                cart.addItem(ramList[j-1]);
            }
        }
    }


    public static void browseMB(MB[] mbList, Cart cart) {
        System.out.println("Motherboards in stock:\n");
        for(int i = 0; i < mbList.length; i++)
            System.out.println((i+1) + ". " + mbList[i].getManufacturer() + " " + mbList[i].getChipset()
                    + " " + mbList[i].getModel() + " " + mbList[i].getSocket());
        System.out.println("""
                
                Which Motherboard would you like to inspect?
                """);
        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();
        for(int j = 0; j <= mbList.length; j++){
            if(choice == j){
                System.out.println("The " + mbList[j-1].getManufacturer() + " " + mbList[j-1].getChipset() + " " + mbList[j-1].getModel()
                + " has an " + mbList[j-1].getSocket() + " socket and supports " + mbList[j-1].getMemoryType() + " memory.\nPrice: "
                + mbList[j-1].getPrice());
                cart.addItem(mbList[j-1]);
            }
        }
    }
}
