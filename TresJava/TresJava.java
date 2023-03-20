package TresJava;

import java.util.Arrays;
import javax.swing.JOptionPane;


/**
 * Elabore um programa de computador que realize o cálculo de notas. Este
 * programa deverá solicitar o nome do aluno e quatro notas, todo este conjunto
 * deverá estar contido em um laço que confirme se deseja encerrar o programa ou
 * continuar solicitando outros nomes e notas.
 * Ao final da solicitação do nome e das notas deverá ser impresso o nome do
 * aluno e a sua média, se a nota for menor que 6 imprimir Reprovado, senão, se
 * a nota for igual ou maior que 6, imprimir Aprovado.
 */
public class TresJava {
    public static void main(String[] args) {
       
        
        String Aluno = JOptionPane.showInputDialog(null, "Digite o nome do aluno: ", "Inserir",1);      
        double[] notasArmazenadas = new double[4];
        

      for(int i = 0; i < notasArmazenadas.length; i++){
          boolean notaValida = false;
          do{
              String insiraNota = JOptionPane.showInputDialog(null, "Digite as notas " + (i + 1) + ":");
              double nota = Double.parseDouble(insiraNota);
              
              if(nota >= 0 && nota <= 10){
                  notasArmazenadas[i] += nota++;
                  notaValida = true;
                                
                } else {
                    
                    JOptionPane.showMessageDialog(null, "Nota invalida! Insira uma nota valida",
                    "Erro", 0);
                } 
            }
            while (!notaValida);
        }   
        
        
        double soma = 0;
        for(double nota : notasArmazenadas){
            soma += nota;
        }
        JOptionPane.showMessageDialog(null, "O nome do aluno é: \n " + Aluno, "Aluno",
        3, null);
            System.out.println("O nome do aluno é: " + Aluno);
        
            System.out.println();
    
    JOptionPane.showMessageDialog(null, "As notas do aluno são: \n" + Arrays.toString(notasArmazenadas), "Notas",
        2, null);
        System.out.println("As notas do aluno são: " + Arrays.toString(notasArmazenadas));
        
        System.out.println();
    
    JOptionPane.showMessageDialog(null, "O total das notas do aluno é: " + soma, "Total das notas", 1, null);
        System.out.println("O total das notas do aluno é: " + soma);
        
        System.out.println();
    
    
    double media = soma / notasArmazenadas.length;
    
    JOptionPane.showMessageDialog(null, "A media do aluno é: " + media, "Media do aluno", 1, null);
         System.out.println("A media do aluno é: " + media);
         
        System.out.println();

    if(media >= 6.0){
        JOptionPane.showMessageDialog(null, "O Aluno foi aprovado! ", "Aprovado", 1, null);
            System.out.println("O Aluno foi aprovado! ");

            System.out.println();

        } else { JOptionPane.showMessageDialog(null, "O Aluno foi reprovado! Estude mais! ", "Reprovado", 0, null);
        System.out.println("O Aluno foi reprovado! Estude mais! ");    
    }
        
        
    int continuar = JOptionPane.showConfirmDialog(null, "Deseja inserir outro aluno?","Continuar?", 2);
    if ( continuar == JOptionPane.YES_OPTION){
        main(args);
        }      
        
    }

    
}
