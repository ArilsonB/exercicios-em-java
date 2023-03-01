/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomnumbers;

import java.util.Random;

/**
 *
 * @author 2021100481
 */
public class RandomNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random randomNumbers = new Random();
        
        int value; // Armazena os valores
        
        for(int cont = 1; cont <= 20; cont++)
        {
            value = 1 + randomNumbers.nextInt(6);
            
            System.out.printf("%d ", value);
            
            // Exibe 5 valores por linha
            if(cont % 5 == 0)
                System.out.println();
        }
    }
    
}
