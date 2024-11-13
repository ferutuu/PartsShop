package Functionality;

import Components.CPU;
import Components.GPU;
import Components.MB;
import Components.RAM;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cart {

    private final List<Object> cartItems;

    public Cart() {
        cartItems = new ArrayList<>();
    }

    public void addItem(Object item) {
        Scanner scan = new Scanner(System.in);
        System.out.println("""
                Would you like to add this item to the cart?
                    1. Yes
                    2. No
                """);
        int choice = scan.nextInt();
        if (choice == 1){
            cartItems.add(item);
            System.out.println("Item added to cart.");
        }
        else if (choice == 2)
            System.out.println("Item not added to cart.");
        else
            System.out.println("Invalid choice, try again...");
    }

    public void showCart() {
        if(cartItems.isEmpty())
            System.out.println("Your cart is empty.");
        else{
            System.out.println("Items in cart:");
            double total = 0;
            for (Object item : cartItems) {
                if(item instanceof CPU cpu) {
                    System.out.println(cpu.getManufacturer() + " " + cpu.getModel());
                    total += cpu.getPrice(); }

                if (item instanceof GPU gpu) {
                    System.out.println(gpu.getManufacturer() + " " + gpu.getModel());
                    total += gpu.getPrice(); }

                if (item instanceof RAM ram) {
                    System.out.println(ram.getManufacturer() + " " + ram.getModel() + " " + ram.getCapacity() + "GB " + ram.getMemoryType());
                    total += ram.getPrice(); }

                if (item instanceof MB mb) {
                    System.out.println(mb.getManufacturer() + " " + mb.getChipset() + " " + mb.getModel());
                    total += mb.getPrice(); }
            }
            System.out.println("Cart total: " + total);
        }
    }

    public void compatible() {
        CPU selectedCPU = null;
        MB selectedMB = null;
        RAM selectedRAM = null;

        for(Object item : cartItems){
            if(item instanceof CPU cpu)
                selectedCPU = cpu;
            if(item instanceof MB mb)
                selectedMB = mb;
            if(item instanceof RAM ram)
                selectedRAM = ram;
        }

        if(selectedCPU != null && selectedMB != null) {
            if(selectedCPU.getSocket().equalsIgnoreCase(selectedMB.getSocket()))
                System.out.println("Your CPU and Motherboard are compatible.");
            else
                System.out.println("Your CPU and Motherboard socket do not match!!!");
        }

        if(selectedRAM != null && selectedMB != null) {
            if(selectedRAM.getMemoryType().equalsIgnoreCase(selectedMB.getMemoryType()))
                System.out.println("Your RAM and Motherboard are compatible.");
            else
                System.out.println("Your Motherboard does not support " + selectedRAM.getMemoryType() + " Components.RAM!!!");
        }

        if(selectedCPU == null)
            System.out.println("CPU missing.");
        if(selectedMB == null)
            System.out.println("Motherboard missing.");
        if(selectedRAM == null)
            System.out.println("Memory missing.");
    }

    public boolean isEmpty() {
        return cartItems.isEmpty();
    }
}
