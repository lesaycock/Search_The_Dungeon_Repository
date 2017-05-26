/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit460.searchTheDungeon.control;

/**
 *
 * @author Gibran Millan
 */
public class RiddleControl {
    
    public int calcWizard ( int numberOne, int numberTwo, int numberThree){ 
       
        if (numberOne <= 0){ 
            return -1;
        }
        if (numberTwo <= 0){ 
            return -1;
        }
        if (numberThree <= 0){ 
            return -1;
        }
 
        int addedNumber = numberOne + numberTwo + numberThree;
        int multipliedNumber = numberOne * numberTwo * numberThree;
        
        if ((addedNumber == 6) && (multipliedNumber == 6)){    
             return 1 ;
        }
        
    return -1;
    }

    /**
    * 
    * @author Les Aycock
     * @param sizeOfMap
     * @param howManyRooms
     * @return 
    */
    public int calcFaries (int sizeOfMap, int howManyRooms){
        if (sizeOfMap<=0){
                return -1;
        }
        if (howManyRooms <= 0) {
            return -1;
        }
        if (sizeOfMap !=26) {
            return -1;
        }
        if (howManyRooms > 26){
            return -1;
        }
        int percentageRooms = (howManyRooms * 100) / sizeOfMap;
        return percentageRooms;
    }
    
    /**
     * @author Gibran Millan
     * @param radius
     * @param height
     * @return 
    */
    public double calcTrap ( double radius, double height ){ 
       
        if (radius <= 0){ 
            return -1;
        }
        if (height <= 0){ 
            return -1;
        }
       
        double volumeNotRounded = ( Math.PI * Math.pow(radius, 2) * height );
        double volume = Math.round(volumeNotRounded*100.0)/100.0;
        if ( volume >= 3141.59 && volume <= 10602.88){    
             return volume ;
        }
        
        return -1;
    }
    
}   