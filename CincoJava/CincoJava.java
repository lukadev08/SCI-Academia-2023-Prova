package CincoJava;



import java.util.Scanner;


/**Crie uma matriz bidimensional. Deverá ser solicitado três nomes de alunos e quatro
notas, após solicitação dos nomes e das notas deverá ser impresso os nomes
acompanhados da média geral de cada aluno, deverá ser impresso também o nome do
aluno que obteve a maior média e o nome do aluno que obteve a menor média
 */
public class CincoJava {
    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);

        String[][] alunosNotas = new String[3][5];

        
        for (int i = 0; i < 3; i++) {
            System.out.print("Digite o nome do aluno  " + (i+1) + ": ");
            alunosNotas[i][0] = sc.nextLine();
            System.out.print("Digite as 4 notas do aluno " + alunosNotas[i][0] + ": ");
            alunosNotas[i][1] = sc.next();
            alunosNotas[i][2] = sc.next();
            alunosNotas[i][3] = sc.next();
            alunosNotas[i][4] = sc.next();
            sc.nextLine();
        }

       System.out.println();

        double mediaMax = 0, mediaMin = Double.MAX_VALUE;
        String nomeMax = "", nomeMin = "";
        for (int i = 0; i < 3; i++) {
            String nome = alunosNotas[i][0];
            double nota1 = Double.parseDouble(alunosNotas[i][1]);
            double nota2 = Double.parseDouble(alunosNotas[i][2]);
            double nota3 = Double.parseDouble(alunosNotas[i][3]);
            double nota4 = Double.parseDouble(alunosNotas[i][4]);
            double media = (nota1 + nota2 + nota3 + nota4) / 4;
            System.out.println("A média geral de " + nome + " é: " + media);
            if (media > mediaMax) {
                mediaMax = media;
                nomeMax = nome;
            }
            if (media < mediaMin) {
                mediaMin = media;
                nomeMin = nome;
            }
        }

        System.out.println();

        System.out.println("A maior média é de: " + nomeMax + " (" + mediaMax + ")");
        System.out.println("A menor média é de: " + nomeMin + " (" + mediaMin + ")");

        sc.close();
    }
}
