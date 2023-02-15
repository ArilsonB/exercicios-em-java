/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciointrodutorio;

import java.util.Scanner;

/**
 *
 * @author 2021100481
 */
public class NumerosMultiplos {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        int n1; // lê o primeiro valor digitado pelo usuário
        int n2; // lê o segundo valor digitado pelo usuário
        
        System.out.print("Digite o primeiro número inteiro: ");
        n1 = input.nextInt();
        
        System.out.print("Digite o segundo inteiro: ");
        n2 = input.nextInt();
        
        if(((n1 % n2) == 0) || ((n2 % n1) == 0)){
            System.out.printf("%d e %d são números multiplos entre si\n", n1, n2);
        }else
            System.out.printf("%d e %d não são números multiplos entre si\n", n1, n2);
    }
}
