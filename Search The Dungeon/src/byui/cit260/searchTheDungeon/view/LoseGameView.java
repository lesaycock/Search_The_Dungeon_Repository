/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.searchTheDungeon.view;

/**
 *
 * @author pauldarr
 */
public class LoseGameView extends View{
    private String banner;
    
    public LoseGameView() {
        
        super ("\nEnter N to start a New Game, or E to Exit the Game: ");
        
        this.banner = "\n"
        +"\n***********************************************"
        +"\n*               You have lost!                *" 
        +"\n***********************************************" 
        +"\n*                                             *" 
        +"\n*    It's not whether you win or lose,        *"
        +"\n*    it's how many people remember you        *"
        +"\n*    when you die.                            *"
        +"\n*                                             *"
        +"\n*    Would you like to try again?             *"
        +"\n*                                             *"
        +"\n***********************************************";
       
       
       this.displayBanner();
    }
    
    private void displayBanner() {   
        System.out.println("\n" + this.banner);
    }
    
 @Override
 public boolean doAction(String choice) {
    choice = choice.toUpperCase(); //convert choice to uppsercase
    
    switch (choice) {
        case "E": // Exit the game
            System.exit(0);
            break;
        case "N": // Starting a new game
            // start a new game
            StartProgramView();
            break;
        default:
            return false;
        }
    return false;
    }

    private void StartProgramView() {
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.display();
    }
}