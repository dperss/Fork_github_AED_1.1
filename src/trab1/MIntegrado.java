/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trab1;

/**
 *
 * @author João Coelho nº39961 EI - Diogo Ramos n~39954 EI
 */
public class MIntegrado extends Membro{
    private double saldo;
    
    public MIntegrado(int i,String n){
        super(i,n);
    }
    
    public boolean adicionarAoSaldo(double val){
        if(saldo<0){
            return false;
        }else{
        saldo=val;
        return true;
        }
    }
    
    @Override
    public String toString(){  
        return "o id do Membro Integrado é:"+id+"\n E o seu nome é:"+super.toString()+"\nE tem em saldo:"+saldo;
    }

}
