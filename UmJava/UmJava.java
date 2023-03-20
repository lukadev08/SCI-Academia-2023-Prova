package UmJava;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 * Solicitar a inserção de 5 números, ao final, 
 * imprimir os números pares,
 * números ímpares e a média geral desses números
 */
public class UmJava {
    public static void main(String[] args) {

        double[] numArmazenados = new double[5];

        System.out.println("Por favor, insira 5 numeros.");
        
        for(int i = 0; i < numArmazenados.length; i++){
            String numInsert = JOptionPane.showInputDialog(null, "Digite 5 numeros: ", "Inserir", 2);
                double numsIn = Double.parseDouble(numInsert);
                if(numsIn != 0.0){
                    numArmazenados[i] = numsIn;
                }
            
        }

        double[] numeros = numArmazenados;
        System.out.println(); 

        JOptionPane.showMessageDialog(null, "Os numeros digitados foram: " + Arrays.toString(numArmazenados), "Numeros digitaos", 2);
        System.out.println("Os numeros digitados sao: " + Arrays.toString(numArmazenados));
       
       System.out.println();

       double[] pares = new double[5];
       double[] impares = new double[5];
       int numPares = 0;
       int numImpares = 0;
       
       for(int i = 0; i < numArmazenados.length; i++){ 
       if(numeros[i] % 2 == 0){
            pares[numPares] = numArmazenados[i];
                numPares++;
               
        } else {
            impares[numImpares] = numArmazenados[i];
                numImpares++;
            }
       }
       
       System.out.println("Os numeros pares digitados foram: ");
       for(int i = 0; i < numPares; i++){
           System.out.println(pares[i]);
        } 

        double[] numerosParesValidos = Arrays.stream(pares).filter(n -> n != 0.0).toArray();
        JOptionPane.showMessageDialog(null, "Os numeros pares digitados foram: " + Arrays.toString(numerosParesValidos), "Numeros pares", 2);
        
        
        System.out.println();
        
        System.out.println("Os valores impares digitados foram: ");
        for(int i = 0; i < numImpares; i++){
            System.out.println(impares[i]);
        }

        double[] numerosImparesValidos = Arrays.stream(impares).filter(n -> n != 0.0).toArray();
        JOptionPane.showMessageDialog(null, "Os numeros impares digitados foram: " + Arrays.toString(numerosImparesValidos), "Numeros impares", 2);
        
        System.out.println();
        
        double total = 0;
        for(double nums: numeros){
            total += nums;
        }

        double media = total / numeros.length;
        
        JOptionPane.showMessageDialog(null, "A média dos numeros é: " + media, "Media dos Numeros", 1);
        System.out.println("A média dos numeros é: " + media + ".");

        


    }
}
