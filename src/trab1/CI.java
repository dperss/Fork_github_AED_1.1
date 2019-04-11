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
    
    /**
     *
     */
    public CI(){
        projetos = new TreeMap<>();
        membros = new TreeMap<>();
    }
    
    /**
     *
     * @param id
     * @param fin
     */
    public void addProjeto(int id,double fin){
        if(projetos.containsKey(id));
                
        else{
        projetos.put(id, new Projeto(id,fin));
            
        }
    }
    
    /**
     *
     * @param id
     * @param nome
     * @return
     */
    public boolean addMIntegrado(int id,String nome){
        if(membros.containsKey(id)==true)
                return false;
        else{
            membros.put(id, new MIntegrado(id,nome));
            return true;
        }
    }
    
    /**
     *
     * @param id
     * @param nome
     * @return
     */
    public boolean addColaborador(int id,String nome){
        if(membros.containsKey(id)==true)
                return false;
        else{
            membros.put(id, new Colaborador(id,nome));
            return true;
        }
    }
    
    /**
     *
     * @param idMemb
     * @param idProj
     * @return
     */
    public boolean associarMembroAProjeto(int idMemb, int idProj){
        Membro m=membros.get(idMemb);
        if(m==null){
            System.out.println("Membro não existe.");
            return false;
        }
        else{
            Projeto p=projetos.get(idProj);
            if(p==null){
                System.out.println("Projeto não existe.");
                return false;
            }
            else{
                System.out.println("Membro adicionado a Projeto.");
                return p.associarMembro(m) && m.associarProjeto(p);
            }
        } 
    }
    
    /**
     *
     * @param idProj
     * @return
     */
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
    
    /**
     *
     * @return
     */
    public String membrosToString(){
        
        
        return membros.values().toString();
        
    }
}

