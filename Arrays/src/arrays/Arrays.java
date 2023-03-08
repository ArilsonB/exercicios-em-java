/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

/**
 *
 * @author 2021100481
 */
public class Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int COMPRIMENTO_DO_ARRAY = 10; // Declara uma constante
                
        int[] arranjo = new int[COMPRIMENTO_DO_ARRAY];
        
        for (int contador = 0; contador < arranjo.length; contador++)
            arranjo[contador] = 2 + 2 * contador;

        System.out.printf("%s%8s\n", "Indice", "Valor"); // nome das colunas
        
        for (int contador = 0; contador < arranjo.length; contador++)
            System.out.printf("%5d%8d\n", contador, arranjo[contador]);
    }
    
}
