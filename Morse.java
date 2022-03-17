/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morse;

import java.util.Arrays;
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
        
        System.out.println("Enter your word(s): ");
        words = input.nextLine();
        
        encrypt(words);
            
        }
    
    public static void encrypt(String string){
    
        boolean validItem = false;
        String translate = "";
        
         String[] letters = {"A", "B", "C", "D", "E", "F", "G", "H", "I","J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U",
        "V","W", "X", "Y", "Z"};
        
        String[] array = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---",
        ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        
        String[] split = new String[string.length()];
        
        for (int i = 0; i < split.length; i++) {
            split[i] = Character.toString(string.charAt(i));
            System.out.print(split[i]);
        }
        
        for(int x = 0; x < split.length; ++x){
            if(split.equals(letters[x])){
                validItem = true;
                translate = array[x];
            }
        }

        if(validItem){
        
            System.out.println(translate);
        }


}
}
