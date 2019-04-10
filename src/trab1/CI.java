/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trab1;

import java.util.TreeMap;

/**
 *
 * @author João Coelho nº39961 EI - Diogo Ramos nº39954 EI
 */
public class CI {
    private TreeMap<Integer,Projeto> projetos;
    private TreeMap<Integer,Membro> membros;
    
    public CI(){
        projetos = new TreeMap<>();
        membros = new TreeMap<>();
    }
    
    public void addProjeto(int id,double fin){
        if(projetos.containsKey(id));
                
        else{
        projetos.put(id, new Projeto(id,fin));
            
        }
    }
    
    public boolean addMIntegrado(int id,String nome){
        if(membros.containsKey(id)==true)
                return false;
        else{
            membros.put(id, new MIntegrado(id,nome));
            return true;
        }
    }
    
    public boolean addColaborador(int id,String nome){
        if(membros.containsKey(id)==true)
                return false;
        else{
            membros.put(id, new Colaborador(id,nome));
            return true;
        }
    }
    
    public boolean associarMembroAProjeto(int idMemb, int idProj){
        Membro m=membros.get(idMemb);
        if(m==null){ 
            return false;}
         else{
            Projeto p=projetos.get(idProj);
            if(p==null){
                return false;}
            else{ 
                return m.associarProjeto(p) && p.associarMembro(m);
            }
        } 
    }
    
    public boolean distribuirVerbaPorMIntegrados(int idProj){
        Projeto p=projetos.get(idProj);
       
        if(p==null){
            return false;
        }
         else{
            p.distribuirVerbaPorMIntegrado();
            return true;
        } 
    }
    
    
    public String membrosToString(){
        
        
        return membros.values().toString();
        
    }
}

