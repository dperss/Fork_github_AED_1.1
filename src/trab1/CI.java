/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trab1;

import java.util.TreeMap;

/*
 * @author João Coelho nº39961 EI
 * @author Diogo Ramos nº39954 EI
 */
public class CI {
    private TreeMap<Integer,Projeto> projetos;
    private TreeMap<Integer,Membro> membros;
    
    /**
     *Construtor por defeito.
     *Esta classe serve para criar Centros de investigação.
     *Cria dois dicionarios um para os projetos e outro para os membros.
     */
    public CI(){
        projetos = new TreeMap<>();
        membros = new TreeMap<>();
    }
    
    /**
     *  Esta classe serve para adicionar projeto aos dicionario.
     * @param id a chave adcionar
     * @param fin o finaciamento do projeto
     */
    public void addProjeto(int id,double fin){
        if(projetos.containsKey(id));
                
        else{
        projetos.put(id, new Projeto(id,fin));
            
        }
    }
    
    /**
     *  Esta classe serve para adicionar um Membro Integrado ao dicionario.
     * @param id a adicionar.
     * @param nome do Membro Integrado.
     * @return true - se for bem inserido ||return false se não for bem sucedido.
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
     *  Esta classe serve para adicionar um Colaborador ao dicionario.
     * @param id a adcionar.
     * @param nome do Colaborador.
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
     *  Esta classe serve para associar um membro a um projetos.
     * @param idMemb a chave do membro.
     * @param idProj a chave do projeto.
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
     *  Este classe serve para chamar uma função na classe projeto que vai ditribuir a verba igualmente peols Membros Integrados.
     * @param idProj a chave do projeto.
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
     *  Esta classe serva para chamar um classe existente nos membros que imprime todo o conteudo amarzenado no dicionario.
     * 
     * @return
     */
    public String membrosToString(){
        
        
        return membros.values().toString();
        
    }
}

