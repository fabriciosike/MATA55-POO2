/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package policlassabs;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author fabricio.siqueira
 */
public class AplicacaoFaculdade {
    
    
    
    Cursos curso;
    private ArrayList cursosDeGrad = new ArrayList<>(); 
    private ArrayList cursosDePosGrad = new ArrayList<>(); 
    private static float precoMatricula;
    
    public static void main(String[] args) {
        
    Scanner scanner = new Scanner(System.in);
        System.out.println("Qual o codigo do curso ?");
        String codigo = scanner.nextLine();
        System.out.println("Qual o nome do curso ?");
        String nome = scanner.nextLine();
        System.out.println("Qual a área do curso ?");
        String area = scanner.nextLine();
        System.out.println("Qual o numero de vagas ?");
        String numeroDeVagas = scanner.nextLine();
        System.out.println("Qual a modalidade do curso (Graduação/Pós ?");
        if(scanner.nextLine().equals("Graduação") {
            
            
            
            
            
        }
        
System.out.println("Voce e funcionario?");
    
 public void CriarCursoGrad() { 
     
     
     
     
 }   
    
 public void consultar 
    
    public static float consultarPrecoMatricula(Object f){
        float desconto = 0;
        
        if(f instanceof CursosDeGraduacao){
            CursosDeGraduacao aux = (CursosDeGraduacao) f;
            desconto = (float)(precoMatricula *0.1); 
            precoMatricula = precoMatricula - desconto;
        }
        
        if(f instanceof CursosPosGraduacao){
            CursosPosGraduacao aux = (CursosPosGraduacao) f;
            desconto = (float) (precoMatricula *0.05);
            precoMatricula = precoMatricula - desconto;
        }
        
        return (float) precoMatricula;
}

    public static double getPrecoMatricula() {
        return precoMatricula;
    }

    public static void setPrecoMatricula(double precoMatricula) {
        AplicacaoFaculdade.precoMatricula = (float) precoMatricula;
    }
    
}

}