/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.searchTheDungeon.view;

import byui.cit260.searchTheDungeon.model.Actor;
import byui.cit260.searchTheDungeon.model.Game;
import byui.cit260.searchTheDungeon.model.InventoryItem;
import search.the.dungeon.SearchTheDungeon;

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
        + "\n* C - List all items carried          *" 
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
               System.out.println("\n***Invalid selection *** Try again");
               break;
        }
        return false;
    }

    private void displayInventory() {
        StringBuilder line;
        
        Game game = SearchTheDungeon.getCurrentGame();
        InventoryItem[] inventory = game.getInventory();
        
        System.out.println("\n LIST OF INVENTORY ITEMS");
        line = new StringBuilder("                                              ");
        line.insert(0,"DESCRIPTION");
        line.insert(20, "LEVEL");
        line.insert(30, "# EQUIPPED");
        System.out.println(line.toString());
        
        //for each inventory item
        for (InventoryItem item : inventory) {
            line = new StringBuilder("                                              ");
            line.insert(0, item.getDescription());
            line.insert(23, item.getPowerLevel());
            line.insert(33, item.getAmount());
            
            //DISPLAY the line
            System.out.println(line.toString());
        }
    }
    
    private void displayInventoryCarried() {
        StringBuilder line;
        
        Game game = SearchTheDungeon.getCurrentGame();
        InventoryItem[] inventory = game.getInventory();
        
        System.out.println("\n LIST OF INVENTORY ITEMS");
        line = new StringBuilder("                                              ");
        line.insert(0,"DESCRIPTION");
        line.insert(20, "LEVEL");
        line.insert(30, "# EQUIPPED");
        System.out.println(line.toString());
        
        //for each inventory item
        for (InventoryItem item : inventory) {
            line = new StringBuilder("                                              ");
            line.insert(0, item.getDescription());
            line.insert(23, item.getPowerLevel());
            line.insert(33, item.getAmount());
            
            //DISPLAY the line
            System.out.println(line.toString());
        }
    }
    
    private void displayActors() {
        StringBuilder line;
        
        Game game = SearchTheDungeon.getCurrentGame();
        Actor actors = game.getActor();
        
        System.out.println("\n LIST OF CHARACTERS IN THE GAME");
        line = new StringBuilder("                                              ");
        line.insert(0,"NAME");
        line.insert(20, "DESCRIPTION");
        System.out.println(line.toString());
        
        //for each inventory item
//        for (Actor actor : actor) {
//            line = new StringBuilder("                                              ");
//            line.insert(0, actors.getName());
//            line.insert(23, actors.getDescription());
//           
//            
//            //DISPLAY the line
//            System.out.println(line.toString());
//        }
        }

    private void displayEnemies() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
             
}