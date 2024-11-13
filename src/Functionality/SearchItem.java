package Functionality;

import Components.CPU;
import Components.GPU;
import Components.MB;
import Components.RAM;

import java.util.List;

import static Functionality.InputValidate.getValidInput;

public class SearchItem {

    public static void browseCPU(List<CPU> cpuList, Cart cart) {

        System.out.println("""
                
                ==============================================================================
                                                
                                                CPUs in stock
                """);
        for(int i = 0; i < cpuList.size(); i++)
            System.out.println((i+1) + ". " + cpuList.get(i).getManufacturer() + " " + cpuList.get(i).getModel() + '\n');
        System.out.println("""
                
                                     Which CPU would you like to inspect?
                                      
                ==============================================================================                      
                """);
        int choice = getValidInput();
        System.out.println("\n==============================================================================\n");
        for(int j = 0; j <= cpuList.size(); j++){
            if(choice == j){
                System.out.println("The " + cpuList.get(j - 1).getManufacturer() + " "
                        + cpuList.get(j - 1).getModel()  + " has " + cpuList.get(j - 1).getCoreCount()
                        + " cores and a clock speed of " + cpuList.get(j - 1).getCoreClock()
                        + "MHz. \n\nIt is compatible with an " + cpuList.get(j - 1).getSocket()
                        + " socket.\n\nPrice: " + cpuList.get(j - 1).getPrice());
                System.out.println("\n==============================================================================\n");
                cart.addItem(cpuList.get(j - 1));
            }
        }
    }


    public static void browseGPU(List<GPU> gpuList, Cart cart) {

        System.out.println("""
                
                ==============================================================================
                                                
                                                GPUs in stock
                """);
        for(int i = 0; i < gpuList.size(); i++)
            System.out.println((i+1) + ". " + gpuList.get(i).getManufacturer() + " " + gpuList.get(i).getModel() + '\n');
        System.out.println("""
                
                                     Which GPU would you like to inspect?
                                      
                ==============================================================================                      
                """);
        int choice = getValidInput();
        System.out.println("\n==============================================================================\n");
        for(int j = 0; j <= gpuList.size(); j++){
            if(choice == j){
                System.out.println("The " + gpuList.get(j - 1).getManufacturer() + " "
                        + gpuList.get(j - 1).getModel() + " has " + gpuList.get(j - 1).getVideoMemory()
                        + "GB of VRAM and a core clock of " + gpuList.get(j - 1).getCoreClock() +"MHz.\n\nPrice: "
                        + gpuList.get(j - 1).getPrice());
                System.out.println("\n==============================================================================\n");
                cart.addItem(gpuList.get(j - 1));
            }
        }
    }


    public static void browseRAM(List<RAM> ramList, Cart cart) {

        System.out.println("""
                
                ==============================================================================
                                                
                                                RAM in stock
                """);
        for (int i = 0; i < ramList.size(); i++)
            System.out.println((i+1) + ". " + ramList.get(i).getManufacturer() + " " + ramList.get(i).getModel() + " "
                    + ramList.get(i).getCapacity() + "GB " + ramList.get(i).getMemoryType() + '\n');
        System.out.println("""
                
                                     Which RAM would you like to inspect?
                                      
                ==============================================================================                      
                """);
        int choice = getValidInput();
        System.out.println("\n==============================================================================\n");
        for(int j = 0; j <= ramList.size(); j++){
            if(choice == j){
                System.out.println("The " + ramList.get(j - 1).getManufacturer() + " " + ramList.get(j - 1).getModel()
                        + " kit has " + ramList.get(j - 1).getStickNum() + " " + ramList.get(j - 1).getCapacity()/2
                        + "GB sticks running at " + ramList.get(j - 1).getFrequency() + " MHz." +
                        "\n\nThis kit will provide " + ramList.get(j - 1).getCapacity() + "GB of " + ramList.get(j - 1).getMemoryType()
                        + " RAM.\n\nPrice: " + ramList.get(j - 1).getPrice());
                System.out.println("\n==============================================================================\n");
                cart.addItem(ramList.get(j - 1));
            }
        }
    }


    public static void browseMB(List<MB> mbList, Cart cart) {

        System.out.println("""
                
                ==============================================================================
                                                
                                                 MBs in stock
                """);
        for(int i = 0; i < mbList.size(); i++)
            System.out.println((i+1) + ". " + mbList.get(i).getManufacturer() + " " + mbList.get(i).getChipset()
                    + " " + mbList.get(i).getModel() + " " + mbList.get(i).getSocket() + '\n');
        System.out.println("""
                
                                     Which MB would you like to inspect?
                                      
                ==============================================================================                      
                """);
        int choice = getValidInput();
        System.out.println("\n==============================================================================\n");
        for(int j = 0; j <= mbList.size(); j++){
            if(choice == j){
                System.out.println("The " + mbList.get(j - 1).getManufacturer() + " " + mbList.get(j - 1).getChipset() + " " + mbList.get(j - 1).getModel()
                + " has an " + mbList.get(j - 1).getSocket() + " socket and supports " + mbList.get(j - 1).getMemoryType() + " memory.\n\nPrice: "
                + mbList.get(j - 1).getPrice());
                System.out.println("\n==============================================================================\n");
                cart.addItem(mbList.get(j - 1));
            }
        }
    }

}