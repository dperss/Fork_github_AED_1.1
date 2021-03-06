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
     *  Construtor por defeito.
     * @param i variavel que identifica o id.
     * @param n variavel que identifica o nome.
     */
    public Membro(int i,String n){
        id=i;
        nome=n;
        projetos=new LinkedHashSet<>();
    }
    
    /**
     * Esta classe serve para adicionar o projeto ao dicionario,situado dentro deste objeto.
     * @param p chave do projeto.
     * @return true - se for o projeto existir || return false se o projeto não existir.
     */
    public boolean associarProjeto(Projeto p){
        if(p==null){
            return false;
        }else{
        p.associarMembro(this);
        return true;
        }
    }
    
    /**
     * Classe abstrata, a implementação encontrasse nos filhos.
     * @param val é o valor a adicionar ao saldo.
     * @return 
     */
    public abstract boolean addicionarAoSaldo(double val);
    
    @Override
    public String toString(){
        return nome;
    }
}