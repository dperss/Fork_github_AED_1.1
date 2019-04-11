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
     *
     * @param i
     * @param n
     */
    public MIntegrado(int i,String n){
        super(i,n);
    }
    
    /**
     *
     * @param val
     * @return
     */
    @Override
    public boolean addicionarAoSaldo(double val) {
        saldo+=val;
        return true;
    }
    
    @Override
    public String toString(){
        return "Id do MIntegrado:" + id + "\nNome:" + super.toString()+""+"\nRecebo:"+saldo+"\n";
    }


}
