/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import static java.sql.DriverManager.println;
import java.util.Scanner;
import trab1.CI;

/**
 *
 * @author João Coelho nº39961 EI - Diogo Ramos nº39954 EI
 */
public class principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CI teste = new CI();
        Scanner myObj = new Scanner(System.in);
        
        
        
        teste.addColaborador(0,"Diogo");
        teste.addMIntegrado(1,"Ramos");
        teste.addMIntegrado(2,"Bia");
        teste.addColaborador(3,"Serra");
        teste.addProjeto(0,100);
        
        teste.associarMembroAProjeto(1, 0);
        teste.associarMembroAProjeto(2, 0);
        teste.associarMembroAProjeto(3, 3);
        teste.distribuirVerbaPorMIntegrados(0);
        System.out.println(teste.membrosToString());
        
        
        
        
        
        
        
        
        
        
        
        /*System.out.println("--Bem-vindo ao seu Centro de Investigação--");
        System.out.println("Menu");
        System.out.println("0-Sair");
        System.out.println("1-Adicione um projeto");
        System.out.println("2-Adicione um Membro Integrado");
        System.out.println("3-Adicione um Colaborador");
        System.out.println("4-Associa um Membro a um projeto");
        System.out.println("5-Distribua a verba pelos Membros Integrados");
        System.out.println("6-Listar todos os Membros");
        
        int var = myObj.nextInt();
        
        switch(var) {
        case 0:
            System.exit(1);
        break;
         case 1:
             System.out.println("Escreva o id do Projeto");
             int var1=myObj.nextInt();
             System.out.println("Escreva a verba do Projeto");
             int var2=myObj.nextInt();
             teste.addProjeto(var1, var2);
        break;
        case 2:
             System.out.println("Escreva o id do Membro Integrado");
             var1=myObj.nextInt();
             System.out.println("Escreva o Nome do Membro Integrado");
             String nome=myObj.next();
             teste.addMIntegrado(var1,nome);
        break;
        case 3:
             System.out.println("Escreva o id do Colaborador");
             var1=myObj.nextInt();
             System.out.println("Escreva o nome do Colaborador");
             var2=myObj.nextInt();
            teste.addProjeto(var1, var2);
        break;
        case 4:
            System.out.println("Escreva o id do Membro");
            var1=myObj.nextInt();
            System.out.println("Escreva o id do Projeto");
        int var3 = myObj.nextInt();
            teste.associarMembroAProjeto(var1,var3);
        break;
        case 5:
            System.out.println("Escreva o id do Projeto");
            var1=myObj.nextInt();
            teste.distribuirVerbaPorMIntegrados(var1);
        case 6:
            teste.membrosToString();
        break;
         default:
           // code block

    }
    */
        
}

}
