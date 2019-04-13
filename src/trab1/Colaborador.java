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
public class Colaborador extends Membro{
    
    /**
     *  Construtor por defeito
     *  Chama o construtor por defeito do Membro para construir a classe filho Colaborador.
     * @param i variavel relativa ao id.
     * @param n variavel relativa ao nome.
     */
    public Colaborador(int i,String n){
        super(i,n);
    }
    
    /**
     *  
     * @param val é o valor a adicionar ao saldo.
     * @return false porque o colaborador não recebe verbas.
     */
    @Override
    public boolean addicionarAoSaldo(double val) {
        return false;
    }
    /**
     *  Esta classe serve para Imprimir as variaveis desta objeto.
     * @return Uma String com o id e nome do colaborador.
     */
    @Override
    public String toString(){
        return "Id do Colaborador:" + id + "\nNome:" + super.toString()+"\n";
    }
}
