/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trab1;

import java.util.LinkedHashSet;

/*
 * @author João Coelho nº39961 EI
 * @author Diogo Ramos nº39954 EI
 */
public class Projeto {
    private int id;
    private double financiamento;
    private LinkedHashSet<Membro> membros;
    
    /**
     *  Construtor por defeito.
     * @param i
     * @param fin
     */
    public Projeto(int i, double fin){
        id=i;
        financiamento=fin;
        membros=new LinkedHashSet<>();
    }
    
    /**
     *
     * @param m
     * @return
     */
    public boolean associarMembro(Membro m){   
        if(m==null){
            return false;
        }else{
        membros.add(m);
        return true;
        }
    }
    
    /**
     *
     */
    public void distribuirVerbaPorMIntegrado(){
        double num=0;
        
        for(Membro m : membros){
           if( m instanceof MIntegrado){
               num++;
           }
        }
        double valor=financiamento/num;
        for(Membro m : membros){
           m.addicionarAoSaldo(valor);
        }
        
    }
}
