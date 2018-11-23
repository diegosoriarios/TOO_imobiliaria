/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.text.DecimalFormat;

/**
 *
 * @author vanes
 */
public abstract class Imovel {
    protected double valor;
    protected String endereco;
    protected double areaGlobal;
    protected Proprietario dono;
    DecimalFormat df = new DecimalFormat("#,##0.00");

    public Imovel(double valor, double areaGlobal) {
        this.valor = valor;
        this.areaGlobal = areaGlobal;
    }

    
    
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    
    public double getAreaGlobal() {
        return areaGlobal;
    }

    public void setAreaGlobal(double areaGlobal) {
        this.areaGlobal = areaGlobal;
    }

    
    
    public String getInfo(){
        
        String aux = "Dados do Imóvel:\n";
        aux += (endereco != null)?endereco:"Endereço não informado";
        aux += "\nÁrea Global: "+areaGlobal+" m²";

       if(dono != null){
           aux += "\nProprietário: "+dono;
       }
       if(valor != 0)
           aux +="\nValor: R$ "+df.format(valor);
       
        return aux;
    }
    
    
    
    
    public Proprietario getDono() {
        return dono;
    }

    public void setDono(Proprietario dono) {
        this.dono = dono;
        dono.listaImoveis.add(this);
    }

    @Override
    public String toString() {
        return (endereco!= null)?endereco:"Endereço não informado"+" - R$ "+df.format(valor);
    }
    
    public abstract void valorizar(double metro);
}
