package Functionality;

import Components.CPU;
import Components.GPU;
import Components.MB;
import Components.RAM;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static Functionality.InputValidate.getValidInput;

public class Cart {

    private final List<Object> cartItems;

    public Cart() {

        cartItems = new ArrayList<>();

    }

    public void addItem(Object item) {

        System.out.println("""
                                 Would you like to add this item to the cart?
                                
                                                   1. Yes
                                                
                                                   2. No
                                                  
                ==============================================================================                                  
                """);

        int choice = getValidInput();

        if (choice == 1){
            cartItems.add(item);
            System.out.println("""
                
                ==============================================================================
                                       
                                        Item added to cart successfully
                """);
        }
        else if (choice == 2)
            System.out.println("""
                
                ==============================================================================
                                       
                                            Item not added to cart
                """);
        else
            System.out.println("Invalid choice, try again...");
    }

    public void showCart() {

        if(cartItems.isEmpty())
            System.out.println("""
                
                ==============================================================================
                                       
                                              Your cart is empty
                """);
        else{
            System.out.println("""
                
                ==============================================================================
                                       
                                                Items in cart                             
                """);

            double total = 0;

            for (Object item : cartItems) {

                if(item instanceof CPU cpu) {
                    System.out.println(cpu.getManufacturer() + " " + cpu.getModel() +'\n');
                    total += cpu.getPrice(); }

                if (item instanceof GPU gpu) {
                    System.out.println(gpu.getManufacturer() + " " + gpu.getModel() +'\n');
                    total += gpu.getPrice(); }

                if (item instanceof RAM ram) {
                    System.out.println(ram.getManufacturer() + " " + ram.getModel() + " " + ram.getCapacity() + "GB " + ram.getMemoryType() +'\n');
                    total += ram.getPrice(); }

                if (item instanceof MB mb) {
                    System.out.println(mb.getManufacturer() + " " + mb.getChipset() + " " + mb.getModel() +'\n');
                    total += mb.getPrice(); }

            }
            System.out.println("Cart total: " + total);

            System.out.println("\n==============================================================================\n");
        }
    }

    public void compatible() {

        System.out.println("\n==============================================================================\n");

        CPU selectedCPU = null;
        MB selectedMB = null;
        RAM selectedRAM = null;
        GPU selectedGPU = null;

        for(Object item : cartItems){

            if(item instanceof CPU cpu)
                selectedCPU = cpu;

            if(item instanceof MB mb)
                selectedMB = mb;

            if(item instanceof RAM ram)
                selectedRAM = ram;

            if(item instanceof GPU gpu)
                selectedGPU = gpu;
        }

        if(selectedCPU != null && selectedMB != null) {

            if(selectedCPU.getSocket().equalsIgnoreCase(selectedMB.getSocket()))
                System.out.println("Your CPU and Motherboard are compatible.\n");
            else
                System.out.println("Your CPU and Motherboard socket do not match.\n");
        }

        if(selectedRAM != null && selectedMB != null) {

            if(selectedRAM.getMemoryType().equalsIgnoreCase(selectedMB.getMemoryType()))
                System.out.println("Your RAM and Motherboard are compatible.\n");
            else
                System.out.println("Your Motherboard does not support " + selectedRAM.getMemoryType() + " RAM.\n");
        }

        if(selectedCPU == null)
            System.out.println("There is no CPU in your cart.\n");

        if(selectedMB == null)
            System.out.println("There is no Motherboard in your cart.\n");

        if(selectedRAM == null)
            System.out.println("There is no RAM in your cart.\n");

        if(selectedGPU == null)
            System.out.println("There is no GPU in your cart.\n");
    }

    public boolean isEmpty() {

        return cartItems.isEmpty();

    }

}