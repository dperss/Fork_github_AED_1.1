/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trab1;

/**
 *
 * @author João Coelho nº39961 EI - Diogo Ramos nº39954 EI
 */
public class Colaborador extends Membro{
    public Colaborador(int i,String n){
        super(i,n);
    }

    public boolean adicionarAoSaldo(double val){
        return false; //TEMPORARIO
    }
    @Override
    public String toString(){
        return "Id do Colaborador:" + id + "\n Nome:" + super.toString()+"";
    }
}
