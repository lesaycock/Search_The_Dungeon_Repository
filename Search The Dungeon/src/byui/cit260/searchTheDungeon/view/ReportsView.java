/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.searchTheDungeon.view;

import byui.cit260.searchTheDungeon.model.Actor;
import byui.cit260.searchTheDungeon.model.Game;
import byui.cit260.searchTheDungeon.model.InventoryItem;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import search.the.dungeon.SearchTheDungeon;
import static search.the.dungeon.SearchTheDungeon.player;

/**
 *
 * @author Paul Darr, Gibran Milan, Les Aycock
 */
public class ReportsView extends View {
    
    public ReportsView() {
        
    super("\n"
        + "\n***************************************"
        + "\n* Which report would you like to see? *"
        + "\n***************************************"
        + "\n* I - List all items in game          *"
        + "\n* P - Print all items in game         *"            
        + "\n* C - List all in your backpack       *" 
        + "\n* A - List all actors in game         *" 
        + "\n* E - List all enemies in game        *"
        + "\n* Q - Quit                            *"
        + "\n--------------------------------------");
    }

    @Override
    public boolean doAction(String choice) {
        choice = choice.toUpperCase(); //convert choice to upper case

        switch (choice) {
            case "I": // List all items in game
                this.displayInventory();
                break;
            case "P": // List all items in game
                this.printInventory();
                break;                
            case "C": // List all items carried
                this.displayInventoryCarried();
                break;
            case "A": // List all actors in game
                this.displayActors();
                break;
            case "E": // List all enemies in game
                this.displayEnemies();
                break;
           default:
               ErrorView.display(this.getClass().getName(),"\n***Invalid selection *** Try again");
               break;
        }
        return false;
    }

    private void displayInventory() {
        StringBuilder line;
        
        Game game = SearchTheDungeon.getCurrentGame();
        InventoryItem[] inventory = game.getInventory();
        
        this.console.println("\n LIST OF GAME INVENTORY ITEMS");
        line = new StringBuilder("                                              ");
        line.insert(0,"DESCRIPTION");
        line.insert(20, "LEVEL");
        this.console.println(line.toString());
        
        //for each inventory item
        for (InventoryItem item : inventory) {
            line = new StringBuilder("                                              ");
            line.insert(0, item.getDescription());
            line.insert(23, item.getPowerLevel());
            
            //DISPLAY the line
            this.console.println(line.toString());
        }
    }

    private void printInventory() {
        
        Game game = SearchTheDungeon.getCurrentGame();
        InventoryItem[] inventory = game.getInventory();
        
        this.console.println("\nWhat would you like the file name to be? Please use format: 'example.txt'");
            String outputLocation;   

        try {
            outputLocation = this.keyboard.readLine();
        
            //create object for input file
        try (PrintWriter out = new PrintWriter(outputLocation)) {
            //print report form
            out.println("\n"
                + "\n*****************************************"
                + "\n*                                       *"
                + "\n*           Inventory  Report           *"
                + "\n*                                       *"
                + "\n*****************************************"
                + "\n Item Type  Item Description  Power Level"  
                + "\n*****************************************");
            
            //print the description and strength of each item
            for (InventoryItem item : inventory) {
                out.printf("%n%-13s%-20s%-5d"    , item.getItemType()
                                                 , item.getDescription()
                                                 , item.getPowerLevel());
            }
            
            this.console.println("Your report was saved successfully.");
            
        }   catch (IOException ex)  {
            ErrorView.display("ReportView", ex.getMessage());
        }
        }   catch (IOException ex) {
            ErrorView.display("ReportView", ex.getMessage());
        }
}    
    
    private void displayInventoryCarried() {
        StringBuilder line;
        
        //Retrieve list of items
        Game game = SearchTheDungeon.getCurrentGame();
        ArrayList<InventoryItem> backpack=game.getBackpack();
        
        this.console.println("\n LIST OF INVENTORY ITEMS\n");
        line = new StringBuilder("                                              ");
        line.insert(0,"DESCRIPTION");
        line.insert(20, "LEVEL");
        this.console.println(line.toString());
        
        //for each inventory item
        for (InventoryItem item : backpack) {
            line = new StringBuilder("                                              ");
            line.insert(0, item.getDescription());
            line.insert(23, item.getPowerLevel());
            
            //DISPLAY the line
            this.console.println(line.toString());
        }
    }
    
    private void displayActors() {
        StringBuilder line;
        
        //retrieve list of actors
        Game game = SearchTheDungeon.getCurrentGame();
        Actor[] actors = game.getActors();
        ArrayList<InventoryItem> backpack=game.getBackpack();
        int playerStrength=0;
        
        this.console.println("\n   LIST OF ACTORS IN GAME\n");
        line = new StringBuilder("                                                 ");
        line.insert(0, "NAME");
        line.insert(20, "STRENGTH");
        this.console.println(line.toString());
        
        //for each actor
        for (Actor actor : actors) {
            line = new StringBuilder("                                                 ");
            line.insert(0, actor.getName());
            line.insert(24, actor.getPowerLevel());
            
            //Display line
            this.console.println(line.toString());
        }
        for (InventoryItem item : backpack) {
            playerStrength = playerStrength+item.getPowerLevel();
        }
            line = new StringBuilder("                                                 ");
            line.insert(0, player.getName());
            line.insert(24, playerStrength);
            
            this.console.println(line.toString());
    }

    private void displayEnemies() {
        StringBuilder line;
        
        //retrieve list of actors
        Game game = SearchTheDungeon.getCurrentGame();
        Actor[] actors = game.getActors();        
        
        this.console.println("\n   LIST OF ENEMIES IN GAME\n");
        line = new StringBuilder("                                                 ");
        line.insert(0, "NAME");
        line.insert(20, "STRENGTH");
        this.console.println(line.toString());
        
        //for each actor
        for (Actor actor : actors) {
            if (actor.isEnemy()!=false) {
                line = new StringBuilder("                                                 ");
                line.insert(0, actor.getName());
                line.insert(24, actor.getPowerLevel());
                this.console.println(line.toString());
            }
        }
    }        

}
