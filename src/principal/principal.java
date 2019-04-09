/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

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
        
        println("--Bem-vindo ao seu Centro de Investigação--");
        println("Menu");
        println("0-Sair");
        println("1-Adicione um projeto");
        println("2-Adicione um Membro Integrado");
        println("3-Adicione um Colaborador");
        println("4-Associa um Membro a um projeto");
        println("5-Distribua a verba pelos Membros Integrados");
        println("6-Listar todos os Membros");
        
        int var = myObj.nextInt();
        switch(var) {
        case 0:
            System.exit(1);
        break;
         case 1:
             println("Escreva o id do Projeto");
             int var1=myObj.nextInt();
             println("Escreva a verba do Projeto");
             int var2=myObj.nextInt();
             teste.addProjeto(var1, var2);
        break;
        case 2:
             println("Escreva o id do Membro Integrado");
             var1=myObj.nextInt();
             println("Escreva o Nome do Membro Integrado");
             String nome=myObj.next();
            teste.addMIntegrado(var1,nome);
        break;
        case 3:
             println("Escreva o id do Colaborador");
             var1=myObj.nextInt();
             println("Escreva o nome do Colaborador");
             var2=myObj.nextInt();
            teste.addProjeto(var1, var2);
        break;
        case 4:
            println("Escreva o id do Membro");
            var1=myObj.nextInt();
            println("Escreva o id do Projeto");
            var1=myObj.nextInt();
            teste.associarMembroAProjeto(var1);
        break;
        case 5:
            println("Escreva o id do Projeto");
            var1=myObj.nextInt();
            teste.distribuirVerbaPorMIntegrado(var1);
        case 6:
            teste.membrosToString();
        break;
         default:
           // code block

    }
    
}
