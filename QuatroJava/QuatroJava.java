package QuatroJava;



import java.util.Arrays;

import javax.swing.JOptionPane;

/**Criar um vetor de cinco posições, 
 * solicitar cinco números e ao fim, imprimir o valor
 * apresentado na posição três.
 */
public class QuatroJava {
    public static void main(String[] args) {
        
        int vetor[] = new int[5];

        for(int i = 0; i < vetor.length; i++){
            String numsInsert = JOptionPane.showInputDialog(null, "Digite 5 numeros", "Inserir", 2);
            int numeros = Integer.parseInt(numsInsert);
            vetor[i] = numeros;
        }

        JOptionPane.showMessageDialog(null, "Os numeros inseridos foram: " + Arrays.toString(vetor), "Numeros inseridos", 3, null);
        System.out.println("Os numeros inseridos foram: " + Arrays.toString(vetor));
        
        JOptionPane.showMessageDialog(null, "O terceiro numero é: " + vetor[2], "Terceiro número",
        1, null);
        System.out.println("O terceiro numero é: " + vetor[2]);

    }
}
