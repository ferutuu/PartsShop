package Functionality;

import java.util.Scanner;

import static Functionality.InputValidate.getValidInput;

public class Main {
    public static void main(String[] args) {

        String filename = "src/parts.csv";
        PartsInventory.loadParts(filename);

        Cart cart = new Cart();
        Scanner scan = new Scanner(System.in);
        boolean inMain = true;

        System.out.println(""" 
                =============================================================================
                
                                          WELCOME TO THE PARTS SHOP                   
                """);

        while (inMain) {
            System.out.println("""
            ==============================================================================  
                                    
                                      What would you like to do?
                                                  
                                           1. Browse parts
                                          
                                           2. View cart
                                          
                                           3. Quit
                                           
            ==============================================================================                               
            """);

            int choice = getValidInput();

            switch (choice) {

                case 1: {
                    inMain = false;
                    boolean pick = true;
                    while (pick) {
                        System.out.println("""
                                
                                ==============================================================================
                                
                                                        What would you like to browse?
                                                       
                                                           1. Processors - CPU
                                                          
                                                           2. Graphics cards - GPU
                                                          
                                                           3. Memories - RAM
                                                          
                                                           4. Motherboards - MB
                                                          
                                ==============================================================================                          
                                """);

                        int category = getValidInput();

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
                        }
                    }
                }
                break;
                case 2:
                    cart.showCart();
                    if (!cart.isEmpty()) {
                        System.out.println("""
                                      Would you like to check if the items in your cart are compatible?
                                      
                                                                  1. Yes
                                    
                                                                  2. No
                                                                 
                                ==============================================================================                                 
                                """);
                        if (getValidInput() == 1)
                            cart.compatible();
                        else
                            System.out.println("""
                                
                                ==============================================================================                      
                                                      
                                                       Items compatibility not checked.
                                """);
                    }
                    break;
                case 3:
                    System.out.println("""
                                
                                ==============================================================================                      
                                                      
                                                                  Quitting...
                                      
                                ==============================================================================                                 
                                """);
                    inMain = false;
                    break;
                default:
                    System.out.println("Invalid choice, try again...");
            }
        }
        scan.close();
    }

}