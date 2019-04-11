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
public abstract class Membro {
    protected int id;
    private String nome;
    private LinkedHashSet<Projeto> projetos;
    
    /**
     *  
     * @param i
     * @param n
     */
    public Membro(int i,String n){
        id=i;
        nome=n;
        projetos=new LinkedHashSet<>();
    }
    
    /**
     *
     * @param p
     * @return
     */
    public boolean associarProjeto(Projeto p){
        //return projetos.add(p);
        return p.associarMembro(this);
    }
    
    /**
     *
     * @param val
     * @return
     */
    public abstract boolean addicionarAoSaldo(double val);
    
    @Override
    public String toString(){
        return nome;
    }
}