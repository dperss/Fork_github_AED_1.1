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
        projetos.put(id, new Projeto(id,fin));
    }
    public boolean addMIntegrado(int id,String nome){
        if(!membros.containsKey(id))
                return false;
        else{
            membros.put(id, new MIntegrado(id,nome));
            return true;
        }
    }
    public boolean addColaborador(int id,String nome){
        if(!membros.containsKey(id))
                return false;
        else{
            membros.put(id, new Colaborador(id,nome));
            return true;
        }
    }
    public boolean associarMembroAProjeto(int idMemb, int idProj){
        return false; //TEMPORARIO
    }
    public boolean distribuirVerbaPorMIntegrados(int idProj){
        return false; // TEMPORARIO
    }
    public String membrosToString(){
        return membros.values().toString();
    }
}

