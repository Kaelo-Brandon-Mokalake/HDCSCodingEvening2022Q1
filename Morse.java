/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morse;

import java.util.Scanner;

/**
 *
 * @author Kaelo Mokalake
 */
public class Morse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String words;
        
//        char[] separate;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your word(s): ");
        words = input.nextLine().toUpperCase();
        
        encrypt(words);
            
        }
    
    public static void encrypt(String string){
    
        
        
        String[] letters = {"A", "B", "C", "D", "E", "F", "G", "H", "I","J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U",
        "V","W", "X", "Y", "Z"};
        
        String[] array = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---",
        ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        
        String[] split = new String[string.length()];
        
        boolean validItem = false;
        String translate = "";
        
        for (int i = 0; i < split.length; i++) {
            split[i] = Character.toString(string.charAt(i));
                if(split[i].equals(letters[i])){
                    validItem = true;
                    translate = array[i];
                }
                
        
        }
        
        if(validItem){
        
            System.out.println(translate + " ");
        }


}
}
