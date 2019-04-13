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
     *
     * Esta classe serve para invocar colaboradores.
     * @param i chave que identifica o id.
     * @param n chave que 
     */
    public Colaborador(int i,String n){
        super(i,n);
    }
    
    /**
     *
     * @param val
     * @return
     */
    @Override
    public boolean addicionarAoSaldo(double val) {
        return false;
    }
    
    @Override
    public String toString(){
        return "Id do Colaborador:" + id + "\nNome:" + super.toString()+"\n";
    }
}
