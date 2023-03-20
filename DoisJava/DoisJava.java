package DoisJava;

import java.util.Arrays;


import javax.swing.JOptionPane;


/**
 * Solicitar 5 números, ao fim, imprimir o
 * número maior e o número menor.
 */
public class DoisJava {
    public static void main(String[] args) {
       
        
        int nums[] = new int[5];
        
        for(int i = 0; i < nums.length; i++){
            String numsDigitados = JOptionPane.showInputDialog(null, "Digite 5 numeros: ", "Inserir", 1);
            int numeros = Integer.parseInt(numsDigitados);
            nums[i] = numeros;
        }
        
        
       
        JOptionPane.showMessageDialog(null, "Os numeros digitados foram: " + Arrays.toString(nums), "Numeros Digitados",
                2, null);
                
        System.out.println("Os numeros inseridos foram: " + Arrays.toString(nums));
        
        System.out.println();
        
        int maiorNum = nums [0];
        for(int i = 0; i < nums.length; i++){
            if (nums[i]> maiorNum){
                maiorNum = nums[i];
            }
        } 
        
        int menorNum = nums [0];
        for(int i = 0; i < nums.length; i++){
            if (nums[i] < menorNum){
                menorNum = nums[i];
            }
        }

        JOptionPane.showMessageDialog(null,"O maior numero foi: " + maiorNum, "Maior Numero", 1);
        JOptionPane.showMessageDialog(null,"O menor numero foi: " + menorNum, "Menor Numero", 1);

        System.out.println("O Maior numero é: " + maiorNum);
        System.out.println("O Menor numero é: " + menorNum);
         
        
    }
    
}
