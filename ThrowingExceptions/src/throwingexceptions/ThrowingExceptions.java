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
public class ThrowingExceptions {
    
    private int initialNumber;
    
    public ThrowingExceptions(){
        this.initialNumber = 0;
        
//        this(0);
    }
    
    public ThrowingExceptions(int numberTwo){
        this.initialNumber = numberTwo;
    }
    
    public int setTest(int testNumber){
        
        if(testNumber < 0){
            throw new IllegalArgumentException("O valor não pode ser menor que 0");
        }
        
        return testNumber;
    }
    
}
