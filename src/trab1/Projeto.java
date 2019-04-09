/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trab1;

import java.util.LinkedHashSet;

/**
 *
 * @author João Coelho nº39961 EI - Diogo Ramos n~39954 EI
 */
public class Projeto {
    private int id;
    private double financiamento;
    private LinkedHashSet<Membro> membros; 
    
    public Projeto(int i, double fin){
        id=i;
        financiamento=fin;
        membros=new LinkedHashSet<>();        
    }
    
    public boolean associarMembro(Membro m){
       return membros.add(m);
    }
    
    public void distribuirVerbaPorMIntegrado(){
        /*double total=0;
         for(Passagem p: passagens) total+=p.getValor();
         return total;*/
    }
}
