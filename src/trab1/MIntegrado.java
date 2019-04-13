/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trab1;

/*
 * @author João Coelho nº39961 EI
 * @author Diogo Ramos nº39954 EI
 */
public class MIntegrado extends Membro{
    private double saldo;
    
    /**
     *  Construtor por defeito
     *  Chama o construtor por defeito do Membro para construir a classe filho MIntegrado.
     * @param i variavel relativa ao id.
     * @param n variavel relativa ao nome.
     */
    public MIntegrado(int i,String n){
        super(i,n);
    }
    
    /**
     *  Esta classe serve para adicionar o saldo ao Membro Integrado.
     * @param val é o valor a adicionar ao saldo.
     * @return true - se for adicionado com sucesso um valor ao saldo || return false se o valor a adicionar for igual a zero.
     */
    @Override
    public boolean addicionarAoSaldo(double val) {
        if(val==0){
            return false;
        }else{    
        saldo+=val;
        return true;
        }
    }
    /**
     * Esta classe serve para Imprimir as variaveis deste objeto.     * 
     * @return Uma string com o id e o nome do Membro Integrado.
     */
    @Override
    public String toString(){
        return "Id do MIntegrado: " + id + "\nNome:" + super.toString()+"\nRecebe: " + saldo + "\n";
    }


}
