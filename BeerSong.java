/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beersong;

/**
 *
 * @author Stephanie
 */
public class BeerSong {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Ninety_Nine_Bottles_of_Beer(99); 
    }
    
    public static void Ninety_Nine_Bottles_of_Beer(int x){
 
         if(x>1){
            System.out.print(x +" bottles of beer on the wall ," + x + " bottles of beer\n"); 
             System.out.println("take one down, pass it around, " );
            System.out.println((x-1)+" bottles of beer on the wall. ");
            Ninety_Nine_Bottles_of_Beer(x-1); //decrement the x value
        
    } //for the last verse of the song, only use singular bottle. 
         else if(x<=1){
        System.out.println(x + " bottle of beer on the wall , "+ x + " bottle of beer "); 
        System.out.println("take one down pass it around, "); 
        System.out.println("no more bottles of beer on the wall."); 
    }
        
	
    }
}
    
