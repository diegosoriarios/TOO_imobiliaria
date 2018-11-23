/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author vanes
 */
public class Proprietario {
    private String nome;
    private String CPF;
    
    public ArrayList<Imovel> listaImoveis;

    public Proprietario(String nome) {
        this.nome = nome;
        listaImoveis = new ArrayList<Imovel>();
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
    
    public String getInfo(){
        String aux = "Dados do Proprietário: ";
        aux+= "Nome: "+nome;
        if(CPF != null)
            aux +="\nCPF: "+CPF;
        
        if(!listaImoveis.isEmpty()){
            aux+= "Lista de Imóveis: \n"+mostraImoveis();
        }
        return aux;
    }

    @Override
    public String toString() {
        return nome;
    }
    
    
    public String mostraImoveis(){
        String aux = "";
        for(Imovel i: listaImoveis){
            aux += " - "+i+"\n";
        }
        return aux;
    }
    
    
}
