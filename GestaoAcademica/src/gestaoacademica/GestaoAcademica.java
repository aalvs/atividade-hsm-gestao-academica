
package gestaoacademica;

import java.util.Scanner;
import java.util.Arrays;

/**
 * Instituição: Centro Universitário de Maringá
 * Diciplina: Programação II
 * Aluno: André Alves de Oliveira
 * RA: 19131743-5
 * @author aavls
 */
public class GestaoAcademica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int alunos = 3;
        int alunosAprovados = 0, alunosReprovados = 0, alunosAF = 0;
        
        float notasAlunos[] = new float[alunos];
        float notalFinal = 0;
       
        Scanner entrada = new Scanner (System.in);
        
        for (int i = 0; i < alunos; i++) {
            //Entrada para identificar o aluno
            System.out.println("Informe o nome do aluno: ");
            String nome = entrada.nextLine();
            //Entrada para identificar a disciplina
            System.out.println("Informe a disciplina: ");
            String disciplina = entrada.nextLine();

            //Entrada das notas do 1º Bimestre
            System.out.println("Informe a nota da prova do aluno no 1º Bimestre: ");
            float nProva1b = entrada.nextFloat();

            System.out.println("Informe a nota do projeto do aluno no 1º Bimestre: ");
            float nProjeto1b = entrada.nextFloat();

            System.out.println("Informe a nota da lista de exercícios do aluno no 1º Bimestre: ");
            float nListaExercicio1b = entrada.nextFloat();

            //Entrada das notas do 2º Bimestre
            System.out.println("Informe a nota da prova do aluno no 2º Bimestre: ");
            float nProva2b = entrada.nextFloat();

            System.out.println("Informe a nota do projeto do aluno no 2º Bimestre: ");
            float nProjeto2b = entrada.nextFloat();

            System.out.println("Informe a nota da lista de exercícios do aluno no 2º Bimestre: ");
            float nListaExercicio2b = entrada.nextFloat();
            
            //Cálculo das notas do 1º e 2º Bimestre
            float nota1Bimestre = ((nProva1b * 5 + nProjeto1b * 3 + nListaExercicio1b * 2) / 10);
            float nota2Bimestre = ((nProva2b * 5 + nProjeto2b * 3 + nListaExercicio2b * 2) / 10);
            
            //Cálculo da média Semestral
            float mediaSemestral =((nota1Bimestre + nota2Bimestre) / 2);
            
            //Adição da média semestral do aluno para identifcar a menor e maior nota da classe
            notasAlunos[i] = (float)mediaSemestral;
            
            //Condicional para identificar alunos Aprovados, Repovados e AF
            if (mediaSemestral >= 8){
                alunosAprovados++;
            } else if (mediaSemestral <= 7.9 && mediaSemestral >= 5){
                alunosAF++;
            } else {
                alunosReprovados++;
            }
        } 
    }
}
