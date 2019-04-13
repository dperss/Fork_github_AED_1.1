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
     * @param i variavel que identifica o id.
     * @param fin variavel que identifica o financiamento.
     */
    public Projeto(int i, double fin){
        id=i;
        financiamento=fin;
        membros=new LinkedHashSet<>();
    }
    
    /**
     *  Esta classe serve para adicionar o membro ao dicionario presente no objeto projeto.
     * @param m chave do membro.
     * @return true - se o membro existir || return false se o membro não existir.
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
     * Esta classe distribui a verba pelo Membros Integrados.Para esse objetivo vai contar a quantidade de MIntegrados existem neste projeto.
     * Por sua vez divide essa verba e adiciona ela aos MIntegrados no 2 ciclo desta função.
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
