/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package throwingexceptions;

/**
 *
 * @author 2021100481
 */
public class main {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ThrowingExceptions teste = new ThrowingExceptions();
        
        try {
            int numero = teste.setTest(-1);
            
            System.out.printf("O número é: %d%n%n", numero);
        } catch (Exception e){
            System.out.printf("%s%n%n", e.getMessage());
        }
        
        System.out.print("Teste");
        
    }
}
