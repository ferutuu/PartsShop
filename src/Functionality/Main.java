package Functionality;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Cart cart = new Cart();
        Scanner scan = new Scanner(System.in);
        boolean inMain = true;
        System.out.println("Welcome to the parts shop!");

        while (inMain) {
        System.out.println("""
                What would you like to do?
                    1. Browse parts
                    2. View cart
                    3. Quit""");

        int choice = scan.nextInt();

        switch (choice) {

            case 1: {
                inMain = false;
                boolean pick = true;
                while (pick) {
                System.out.println("""
               What would you like to browse?
                   1. Processors - CPU
                   2. Graphics cards - GPU
                   3. Memories - RAM
                   4. Motherboards - MB""");

                int category = scan.nextInt();
                switch (category) {
                    case 1:
                        pick = false;
                        SearchItem.browseCPU(PartsInventory.cpuList, cart);
                        inMain = true;
                        break;
                    case 2:
                        pick = false;
                        SearchItem.browseGPU(PartsInventory.gpuList, cart);
                        inMain = true;
                        break;
                    case 3:
                        pick = false;
                        SearchItem.browseRAM(PartsInventory.ramList, cart);
                        inMain = true;
                        break;
                    case 4:
                        pick = false;
                        SearchItem.browseMB(PartsInventory.mbList, cart);
                        inMain = true;
                        break;
                        default:
                            System.out.println("Invalid choice, try again...");
                            break;
                }
             }
            }
                break;
            case 2:
                cart.showCart();
                if(!cart.isEmpty()) {
                    System.out.println("""
                        Would you like to check if the items in your cart are compatible?
                            1. Yes
                            2. No
                        """);
                    if (scan.nextInt() == 1)
                        cart.compatible();
                }
                break;
            case 3:
                System.out.println("Quitting...");
                inMain = false;
                break;
            default:
                System.out.println("Invalid choice, try again...");
        }
        }
        scan.close();
    }

}