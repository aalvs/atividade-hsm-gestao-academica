
package gestaoacademica;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.Arrays;

/**
 * Instituição: HSM University
 * Diciplina: Lógica de Programação e Orientação a Objetos
 * Aluno: André Alves de Oliveira
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
        float notaTotal = 0;
       
        Scanner entrada = new Scanner (System.in);
        
        for (int i = 0; i < alunos; i++) {
            
            System.out.println("----- CÁLCULO DA MÉDIA SEMESTRAL DE QUÍMICA -----");
            System.out.println(" ");
          
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
            
            //Adição do valor da média semestral do aluno em uma variável para o calculo da média da turma
            notaTotal += mediaSemestral;
            
            //Adição da média semestral do aluno para identifcar a menor e maior nota da turma
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
        
        DecimalFormat fmt = new DecimalFormat("0.00");
        Arrays.sort(notasAlunos);
        
        //Cálculo da média da classe
        float mediaTurma = notaTotal/alunos;
        
        // Andre 9.0, 9.0, 9.5, 9.5, 9.0, 9.0
        // Marcos 3.0, 2.0, 1.5, 2.5, 2.0, 2.0
        // Jose 6.5, 4.0, 4.5, 6.5, 6.0, 5.0
        
        System.out.println("-------------------------------------------------");
        System.out.println("A média geral da turma é: " + fmt.format(mediaTurma));
        System.out.println("A menor nota da turma é: " + fmt.format(notasAlunos[0]));
        System.out.println("A maior nota da turma é: " + fmt.format(notasAlunos[notasAlunos.length - 1]));
        System.out.println(" ");
        System.out.println("Alunos aprovados: " + alunosAprovados);
        System.out.println("Alunos reprovados: " + alunosReprovados);
        System.out.println("Alunos em Avliação Final: " + alunosAF);   
    }
}
